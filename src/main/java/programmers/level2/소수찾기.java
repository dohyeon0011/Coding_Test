package programmers.level2;

import java.util.HashSet;
import java.util.Set;

public class 소수찾기 {

    class Solution {

        static Set<Integer> set = new HashSet<>();
        static boolean[] visited = new boolean[7];

        public int solution(String numbers) {
            int answer = 0;

            dfs(0, "", numbers);

            for (Integer n : set) {
                if (checkPrime(n)) {
                    answer++;
                }
            }

            return answer;
        }

        public void dfs(int depth, String s, String numbers) {
            if (depth > numbers.length()) {
                return;
            }

            for (int i = 0; i < numbers.length(); i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    set.add(Integer.parseInt(s + numbers.charAt(i)));
                    dfs(depth + 1, s + numbers.charAt(i), numbers);
                    visited[i] = false;
                }
            }
        }

        public boolean checkPrime(int num) {
            if (num < 2) {
                return false;
            }
            int n = (int) Math.sqrt(num);

            for (int i = 2; i <= n; i++) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }

}
