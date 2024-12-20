package baekjoon.DP;

import java.io.*;
import java.util.StringTokenizer;

// 확통 중복조합 활용
public class 다리놓기 {
    static final int[][] dp = new int[31][31]; // 0 < N <= M < 30

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            // M개중 N개를 뽑는 경우이므로 nCr 에서 n = m, r = n 이다.
            int n = Integer.parseInt(st.nextToken()); // n = r
            int m = Integer.parseInt(st.nextToken()); // m = n

            bw.write(recursion(m, n) + "\n");
        }

        br.close();
        bw.close();
    }

    private static int recursion(int n, int m) {
        if (dp[n][m] > 0) {
            return dp[n][m];
        } else if (n == m || m == 0) {
            return dp[n][m] = 1;
        }

        return dp[n][m] = recursion(n - 1, m - 1) + recursion(n - 1, m);
    }

}
