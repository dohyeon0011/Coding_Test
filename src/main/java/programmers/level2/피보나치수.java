package programmers.level2;

public class 피보나치수 {

    class Solution {
        public int solution(int n) {
            int answer = fibo(n);

            return answer;
        }

        // 일반적인 재귀함수로 돌 경우 불필요한 중복된 연산을 하게 돼서 시간 낭비와 계속 함수 내부에서 함수를 호출하여
        // 메모리를 많이 사용해야하는 메모리 낭비가 발생하게 된다.
        public int fibo(int n) {
            // int 자료형 크기를 넘어가게 되면 long으로 바꿔줘야 함.
            int[] fiboArr = new int[n + 1];
            fiboArr[0] = 0;
            fiboArr[1] = 1;

            for (int i = 2; i <= n; i++) {
                // 자료형의 범위를 넘지 않게 하기 위해 %1234567을 해줌, 문제에서 차피 n은 100,000 이하라고 했으니 이렇게 임의로 줘도 됨.
                // long일 경우 fiboArr[i] = (fiboArr[i - 2] + fiboArr[i - 1]) % 1234567L;
                fiboArr[i] = (fiboArr[i - 2] + fiboArr[i - 1]) % 1234567;
            }

            return fiboArr[n];
        }
    }

}
