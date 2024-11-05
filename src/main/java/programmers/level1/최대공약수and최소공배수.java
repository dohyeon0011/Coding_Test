package programmers.level1;

public class 최대공약수and최소공배수 {
    public int[] solution(int n, int m) {
        // 최소공배수 = n * m / 최대공약수
        int[] answer = new int[2];
        answer[0] = gcd(Math.max(n, m), Math.min(n, m)); // 12, 3 / 5, 2
        answer[1] = (n * m) / answer[0];

        return answer;
    }

    public int gcd(int max, int min) {
        if(min == 0) {
            return max;
        }
        return gcd(min, max % min);
    }

}
