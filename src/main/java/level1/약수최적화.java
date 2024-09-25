package level1;

public class 약수최적화 {

    class Solution {
        public int solution(int number, int limit, int power) {
            // 1 2 3 4 5 6 7 8 9 10 / 1 2 2 3 2 4 2 4 3 4 -> 6번 8번 10번은 power로 구매한 후 모두 더하기
            int answer = 0;

            // 약수 구하기 최적화
            for(int i = 1; i <= number; i++) { // 1 2 3 4 5 6 7 8 9 10
                int cnt = 0;

                for(int j = 1; j * j <= i; j++) { // 1(2)
                    if (j * j == i) {
                        cnt++;
                    } else if (i % j == 0) {
                        cnt+=2;
                    }
                }
                answer += cnt > limit ? power : cnt;
            }

            return answer;
        }
    }

}
