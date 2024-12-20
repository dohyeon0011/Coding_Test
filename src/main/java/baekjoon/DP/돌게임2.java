package baekjoon.DP;

import java.io.*;

public class 돌게임2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];

        // 홀수 : 창영(CY)승, 짝수 : 상근(SK)승
        // 4:2
        // 5:3
        // 6:2
        // 7:3
        // 8:4
        // 2 1 2
        // 3 2 3
        // 4 3 4
        dp[1] = 2;
        dp[2] = 1;
        dp[3] = 2;
        for (int i = 4; i <= num; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 3]) + 1;
        }

        if (dp[num] % 2 == 0) {
            bw.write("CY");
        } else {
            bw.write("SK");
        }

        br.close();
        bw.close();
    }
}
