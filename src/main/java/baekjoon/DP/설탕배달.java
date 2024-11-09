package baekjoon.DP;

public class 설탕배달 {
    static int sugarBox = 18;

    public static void main(String[] args) {
        // 5 5 5 3
        int answer = 0;

        while (sugarBox > 0) {
            if (sugarBox % 5 == 0) {
                answer += (sugarBox / 5);
                break;
            }

            sugarBox -= 3;
            answer++;

            if (sugarBox < 0) {
                answer = -1;
                break;
            }
        }

        System.out.println(answer);
    }

}