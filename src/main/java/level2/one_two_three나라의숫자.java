package level2;

public class one_two_three나라의숫자 {

    class Solution {
        public String solution(int n) {
            // 1 % 3 == 1(1)
            // 2 % 3 == 2(2)
            // 3 % 3 == 0(4)
            String answer = "";
            String[] numbers = {"4", "1", "2"};

            while (n > 0) {
                int remainder = n % 3;
                n /= 3;

                if (remainder == 0) {
                    n--;
                }

                answer = numbers[remainder] + answer;
            }

            return answer;
        }
    }

}
