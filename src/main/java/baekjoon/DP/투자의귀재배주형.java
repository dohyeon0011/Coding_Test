package baekjoon.DP;

import java.io.*;
import java.util.StringTokenizer;

public class 투자의귀재배주형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int money = Integer.parseInt(st.nextToken());
        int year = Integer.parseInt(st.nextToken());

        long[] dp = new long[year + 1];
        dp[0] = money;

        for (int i = 1; i <= year; i++) {
            dp[i] = (long) Math.floor(dp[i - 1] * 1.05); // 1년 짜리

            if (i >= 3) { // 5년일 때 -> 작년 * 0.05(1년) vs 1 + 1 + 3년
                dp[i] = Math.max((long) Math.floor(dp[i - 3] * 1.2), dp[i]);
            }
            if (i >= 5) { // 5년일 때 -> 작년 * 0.05(1년) vs 5년 || 작년 * 0.05(1년) vs 작년 * 0.05(1년) + 3년 (위 아래 if문 다 거치고 최대값 반영)
                dp[i] = Math.max((long) Math.floor(dp[i - 5] * 1.35), dp[i]);
            }
        }

        bw.write(String.valueOf(dp[year]));

        br.close();
        bw.close();
    }
}
