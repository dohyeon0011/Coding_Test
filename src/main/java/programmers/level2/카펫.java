package programmers.level2;

public class 카펫 {

    class Solution {
        public int[] solution(int brown, int yellow) {
            // 24, 24 -> (8, 6)
            // 1 1 1 1 1 1 1 1
            // 1 0 0 0 0 0 0 1
            // 1 0 0 0 0 0 0 1
            // 1 0 0 0 0 0 0 1
            // 1 0 0 0 0 0 0 1
            // 1 1 1 1 1 1 1 1

            // 8, 1 -> (3, 3)
            // 1 1 1
            // 1 0 1
            // 1 1 1

            // 10, 2 -> (4, 3)
            // 1 1 1 1
            // 1 0 0 1
            // 1 1 1 1

            // yellow 넓이 = (직사각형 가로 - 2) * (직사각형 세로 - 2)
            int[] answer = new int[2];
            int sum = brown + yellow; // 48

            // 가로, 세로 모두 3이상이어야 하기 때문에 3부터 시작
            for (int i = 3; i <= sum; i++) {
                int j = sum / i;

                if (sum % i == 0 && j >= 3) {
                    int col = Math.max(i, j);
                    int row = Math.min(i, j);
                    int area = (col - 2) * (row - 2); // (8 - 2) * (6 - 2)

                    if (area == yellow) {
                        answer[0] = col;
                        answer[1] = row;
                    }
                }
            }

            return answer;
        }
    }

}
