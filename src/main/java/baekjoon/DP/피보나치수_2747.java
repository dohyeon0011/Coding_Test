package baekjoon.DP;

import java.io.*;

public class 피보나치수_2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int[] dp = new int[num + 1];

        recursion(dp, num);

        bw.write(String.valueOf(dp[num]));

        br.close();
        bw.close();
    }

    private static void recursion(int[] dp, int num) {
        // 0, 1, 1, 2, 3, 5, 8, 13
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= num; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
    }

}
