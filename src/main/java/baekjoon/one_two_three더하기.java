package baekjoon;

import java.io.*;
import java.net.SocketTimeoutException;

public class one_two_three더하기 {
    // 1 : 1 = 1
    // 2 : 1+1, 2 = 2
    // 3 : 1+1+1, 1+2, 2+1 = 3
    // 4 : 1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2, 1+3, 3+1 = 7
    static int cnt = 0;
    static int dp[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine()); // 몇 번 출력할건지
        dp = new int[11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i < 11; i++) {
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
        }

        for(int i = 0; i < num; i++) { // 출력
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[n]);
        }

    }
}
