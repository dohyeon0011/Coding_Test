package baekjoon.DP;

import java.io.*;

public class one으로만들기 {
    // 백준은 이상하게 이거 시간 초과로 바로 뜸
    /*static Integer[] dp; // null로 체크하기 위해서

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num = Integer.parseInt(st.nextToken());

        dp = new Integer[num + 1];
        dp[0] = dp[1] = 0;

        System.out.println(recursion(num));
    }

    static int recursion(int n) {
        if (dp[n] == null) {
            if (n % 6 == 0) {
                dp[n] = Math.min(recursion(n - 1), Math.min(recursion(n / 2), recursion(n - 3))) + 1;
            } else if (n % 3 == 0) {
                dp[n] = Math.min(recursion(n - 1), recursion(n / 3)) + 1;
            } else if (n % 2 == 0) {
                dp[n] = Math.min(recursion(n - 1), recursion(n / 2)) + 1;
            } else {
                dp[n] = recursion(n - 1) + 1;
            }
        }

        return dp[n];
    }
}*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] dp = new int[num + 1];  // DP 배열 초기화
        dp[2] = 1;
        dp[3] = 1;

        for (int i = 4; i <= num; i++) {
            if (i % 6 == 0) {
                dp[i] = Math.min(dp[i / 3], Math.min(dp[i / 2], dp[i - 1])) + 1;
            } else if (i % 3 == 0) {
                dp[i] = Math.min(dp[i / 3], dp[i - 1]) + 1;
            } else if (i % 2 == 0) {
                dp[i] = Math.min(dp[i / 2], dp[i - 1]) + 1;
            } else {
                dp[i] = dp[i - 1] + 1;
            }
        }
        System.out.print(dp[num]);
    }
}

