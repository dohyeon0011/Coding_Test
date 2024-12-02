package baekjoon.DP;

import java.io.*;
import java.util.StringTokenizer;

public class 피자_small_14606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());

        int[] dp = new int[11]; // 1 <= N <= 10
        dp[0] = dp[1] = 0;
        dp[2] = 1;

        for (int i = 3; i <= num; i++) {
          dp[i] = dp[i - 1] + (i - 1);
        }

        bw.write(String.valueOf(dp[num]));

        br.close();
        bw.close();
    }
}
