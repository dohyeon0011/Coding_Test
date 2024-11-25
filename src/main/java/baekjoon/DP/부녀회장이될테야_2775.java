package baekjoon.DP;

import java.io.*;

public class 부녀회장이될테야_2775 {

    public static void main(String[] args) throws IOException {
        // 2 0 1 4 10 20
        // 1 0 1 3 6 10
        // 0 0 1 2 3 4
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int k = Integer.parseInt(br.readLine()); // 층
            int n = Integer.parseInt(br.readLine()); // 호
            int[][] dp = new int[k + 1][n + 1];

            for (int j = 1; j <= n; j++) {
                dp[0][j] = j;
            }

            extracted(k, n, dp);

            bw.write(String.valueOf(dp[k][n]) + "\n");
//            System.out.println(dp[k][n]);
        }

        br.close();
        bw.close();
    }

    private static void extracted(int k, int n, int[][] dp) {
        for (int j = 1; j <= k; j++) {
            for (int h = 1; h <= n; h++) {
                dp[j][h] = dp[j - 1][h] + dp[j][h - 1];
            }
        }
    }

}
