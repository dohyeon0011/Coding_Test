package programmers.level2;

public class 배열자르기 {

    class Solution {
        public int[] solution(int n, long left, long right) {
            int len = (int) (right - left) + 1;
            int[] answer = new int[len];
            int idx = 0;

            // 1 2 3
            // 2 2 3
            // 3 3 3
            for (long i = left; i <= right; i++) {
                answer[idx++] = (int) Math.max(i / n, i % n) + 1;
            }

            return answer;
        }
    }

}
