package programmers.level2;

public class 예상대진표 {

    class Solution
    {
        public int solution(int n, int a, int b)
        {
            // 12, 34, 56, 78
            // 14(2), 57(4)
            // 4(1) 7(2)
            int answer = 0;

            while (true) {
                answer++;

                a = (a / 2) + (a % 2);
                b = (b / 2) + (b % 2);

                if (a == b) {
                    break;
                }
            }

            return answer;
        }
    }

}
