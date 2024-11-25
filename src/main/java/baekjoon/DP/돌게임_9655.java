package baekjoon.DP;

import java.io.*;

public class 돌게임_9655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 1;

        for (int i = 4; i <= num; i++) {
            // 돌 1개 꺼낼 때, 3개 꺼낼 때 중에서 최소값 찾기(완벽하게 게임을 한다 했었어서 최소의 경우를 구해야함)
            // 규칙이 i가 홀수이면 SK 승리, 짝수이면 CY 승리이게 됨.
            dp[i] = Math.min(dp[i - 1], dp[i - 3]) + 1;
        }

        // dp[num]의 값이 짝수 = "CY" , 홀수면 "SK"
        if (dp[num] % 2 == 0) {
            System.out.println("CY");
        } else {
            System.out.println("SK");
        }

        br.close();
        bw.close();
    }

}
