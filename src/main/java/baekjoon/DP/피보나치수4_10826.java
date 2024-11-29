package baekjoon.DP;

import java.io.*;
import java.math.BigInteger;

public class 피보나치수4_10826 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        // 1 1 2 3 5
        // BigInteger : long보다 범위가 클 때, 선언할 때 new 생성자에 문자열로
        if (num == 0) {
            bw.write("0");
        } else {
            BigInteger[] dp = new BigInteger[num + 1];
            dp[0] = BigInteger.ZERO;
            dp[1] = BigInteger.ONE;

            for (int i = 2; i <= num; i++) {
                dp[i] = dp[i - 2].add(dp[i - 1]);
            }

            bw.write(dp[num].toString());
        }

        br.close();
        bw.close();
    }
}
