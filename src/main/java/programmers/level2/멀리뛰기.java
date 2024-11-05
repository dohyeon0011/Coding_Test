package programmers.level2;

public class 멀리뛰기 {

    class Solution {
        public long solution(int n) {
            // 0 1 2 3 5 (피보나치 이용)
            long answer = fibo(n);

            return answer;
        }

        public long fibo(int n) {
            long[] longArr = new long[n + 2]; // 1이 올 수도 있어서 n + 2로 크기 잡아줘야 함.
            longArr[0] = 0;
            longArr[1] = 1;
            longArr[2] = 2;

            for (int i = 3; i <= n; i++) {
                longArr[i] = (longArr[i - 2] + longArr[i - 1]) % 1234567L;
            }

            return longArr[n];
        }
    }

}
