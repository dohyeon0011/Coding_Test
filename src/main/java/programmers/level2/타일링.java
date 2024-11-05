package programmers.level2;

public class 타일링 {

    class Solution {
        public Long solution(int n) {
            Long[] dp = new Long[n + 1];
            dp[0] = 0L;
            dp[1] = 1L;
            dp[2] = 2L;

            for (int i = 3; i <= n; i++) {
                dp[i] = (dp[i - 2] + dp[i - 1]) % 1000000007L;
            }

            return dp[n];
        }
    }

}
