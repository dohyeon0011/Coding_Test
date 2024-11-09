package baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Nx2타일링 {

    public static void main(String[] args) throws IOException {
        // 1 1
        // 2 2
        // 3 3
        // dp[0]은 0이지만 1로 해두고 해야됨. dp[2]까지 선언해버리면 n이 1이 들어왔을 때,
        // 배열 크기는 2인데 dp[2]까지 선언이 되면 런타임 에러 (ArrayIndexOutOfBounds)이 뜨기 때문.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int len = Integer.parseInt(st.nextToken());
        int[] dp = new int[len + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= len; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1]) % 10007;
        }

        System.out.println(dp[len]);
    }
}
