package baekjoon.DP;

import java.io.*;

public class 피보나치수1 {
    static int recursionCnt, dpCnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());

        fibo(num);
        dp(num);

        bw.write(recursionCnt + " " + dpCnt);

        br.close();
        bw.close();
    }

    private static void dp(int num) {
        int[] dp = new int[num + 1]; // 차피 문제에서 5 <= N <= 40이라 해서 dp[2]까지 미리 초기화하고 num+1로 배열 크기 잡아줘도 에러 안터짐.
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= num; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
            dpCnt++;
        }
    }

    private static int fibo(int n) {
        if (n == 1 || n == 2) {
            recursionCnt++;
            return 1;
        }
        return fibo(n - 2) + fibo(n - 1);
    }

}
