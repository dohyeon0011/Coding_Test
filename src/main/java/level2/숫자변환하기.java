package level2;

public class 숫자변환하기 {
    static int x = 10;
    static int y = 40;
    static int n = 5;
    
    public static void main(String[] args) {

        int[] dp = new int[y + 1]; // 각 인덱스 번호에 연산 총 횟수가 계산이 됨.

        for (int i = x; i <= y; i++) {
            // 연산으로 나올 수 없는 값일때 -1 처리
            if (i != x && dp[i] == 0) {
                dp[i] = -1;
                continue;
            }

            // 최소 연산횟수를 구해야 하므로 Math.min() 함수 사용
            // 왜냐면 다른 연산 방법으로 해당 숫자가 나와서 카운트가 올라가기 때문에
            if (i + n <= y) {
                dp[i + n] = (dp[i + n] == 0) ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i + n]);
            }

            if (i * 2 <= y) {
                dp[i * 2] = (dp[i * 2] == 0) ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i * 2]);
            }

            if (i * 3 <= y) {
                dp[i * 3] = (dp[i * 3] == 0) ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i * 3]);
            }
        }

        System.out.println("dp[y] = " + dp[y]);

    }
}
