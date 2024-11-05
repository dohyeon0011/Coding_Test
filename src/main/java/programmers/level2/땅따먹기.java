package programmers.level2;

import java.util.Arrays;

public class 땅따먹기 {
    static int[][] land = new int[][] {{1,2,3,5}, {5,6,7,8}, {4,3,2,1}};

    class Solution {
        int solution(int[][] land) {
            int answer = 0;

            for (int i = 1; i < land.length; i++) {
                land[i][0] += maxCheck(land[i - 1][1], land[i - 1][2], land[i - 1][3]);
                land[i][1] += maxCheck(land[i - 1][0], land[i - 1][2], land[i - 1][3]);
                land[i][2] += maxCheck(land[i - 1][0], land[i - 1][1], land[i - 1][3]);
                land[i][3] += maxCheck(land[i - 1][0], land[i - 1][1], land[i - 1][2]);
            }

            for (int i = 0; i < land[land.length - 1].length; i++) {
                answer = Math.max(answer, land[land.length - 1][i]);
            }

            return answer;
        }

        public int maxCheck(int a, int b, int c) {
            return Math.max(a, Math.max(b, c));
        }
    }

}
