package programmers.level2;

public class 삼각달팽이 {

        public int[] solution(int n) {
            // 1 0 0 0
            // 2 9 0 0
            // 3 10 8 0
            // 4 5 6 7
            int[] answer = new int[n * (n + 1) / 2]; // 등비수열 합
            int[][] arr = new int[n][n];
            int x = -1, y = 0, num = 1;

            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    if (i % 3 == 0) { // 반시계 방향 패턴이 3회마다 반복이라서
                        x++;
                    } else if (i % 3 == 1) {
                        y++;
                    } else {
                        x--;
                        y--;
                    }
                    arr[x][y] = num++;
                }
            }

            int idx = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] == 0) {
                        break;
                    }
                    // 이렇게 해도 되긴 하는데 배열을 모두 탐색해서 효율이 떨어짐.
                    // if (arr[i][j] != 0) {
                    //     answer[idx++] = arr[i][j];
                    // }
                    answer[idx++] = arr[i][j];
                }
            }

            return answer;
        }
    }

