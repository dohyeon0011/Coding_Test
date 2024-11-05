package programmers.level2;

public class 마법의엘리베이터 {

    public int solution(int storey) {
        // 1 : -1, 2 : -2, 3 : -3, 4 : -4
        // 6 : +4, 7 : +3, 8 : +2, 9 : +1
        int answer = 0;

        while (storey > 0) {
            int remainder = storey % 10;
            storey /= 10;

            if (remainder < 5) {
                answer += remainder;
            } else if (remainder == 5) {
                if (storey % 10 >= 5) {
                    answer = answer + (10 - remainder);
                    storey++; // 앞자리가 5이상일 때 더하는 게 나으니 +1 증가시켜버리기
                } else {
                    answer += remainder;
                }
            } else {
                answer = answer + (10 - remainder);
                storey++;
            }
        }

        return answer;
    }
}

