package programmers.level1;

public class 소수찾기 {

    class Solution {
        public int solution(int n) {
            int answer = 0;
            int[] arr = new int[n + 1];

            for(int i = 2; i <= n; i++) {
                arr[i] = i;
            }

            int num = (int)Math.sqrt(n);
            for (int i = 2; i <= num; i++) {
                if (arr[i] == 0) { // 0으로 초기화 된 곳은 건너뛰기
                    continue;
                }
                for(int j = i + i; j <= n; j += i) { // 현재 숫자(i)를 제외한 제곱수들은 모두 0으로 초기화
                    arr[j] = 0; // 0이 들어간 곳은 소수가 아님
                }
            }

            for(int i = 2; i <= n; i++) {
                if (arr[i] != 0) {
                    answer++;
                }
            }

            return answer;
        }
    }

}
