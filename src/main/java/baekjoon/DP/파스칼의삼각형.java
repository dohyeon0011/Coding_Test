package baekjoon.DP;

import java.io.*;
import java.util.StringTokenizer;

public class 파스칼의삼각형 {
    public static void main(String[] args) throws IOException {
        // 1
        // 1 1
        // 1 2 1
        // 1 3 3 1
        // 1 4 6 4 1
        // 1 5 10 10 5 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());

        if (row <= 2) {
            bw.write("1");
        } else {
            int[][] dp = new int[row + 1][row + 1];
            dp[1][1] = 1;
            dp[2][1] = 1;
            dp[2][2] = 1;

            for (int i = 3; i <= row; i++) {
                for (int j = 1; j <= i; j++) {
                    if (j == 1 || j == i) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
                    }
                }
            }

            bw.write(String.valueOf(dp[row][column]));
        }

        br.close();
        bw.close();
    }

}
