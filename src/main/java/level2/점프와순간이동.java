package level2;

public class 점프와순간이동 {

    public class Solution {
        public int solution(int n) {
            int ans = 0;
            // 홀수일 때 n-- 해주고, 점프 +1 함.
            // 짝수일 때는 / 2 만

            while (n != 0) {
                if (n % 2 == 0) {
                    n /= 2;
                    continue;
                }
                n--;
                ans++;
            }

            return ans;
        }
    }

}
