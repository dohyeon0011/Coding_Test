package programmers.level2;

public class 연속된부분수열의합 {

        public int[] solution(int[] sequence, int k) {
            // 배열의 수를 더할 때 이런식으로 포인터 2개를 활용해서 이동해가며 쓸 때가 많음.
            int[] answer = new int[2];
            int sum = 0;
            int a = 0, b = 0, size = sequence.length;

            for (a = 0; a < sequence.length; a++) {
                // 일단 더해주기
                sum += sequence[a];

                // 합이 k보다 클 때
                while (sum > k) {
                    sum -= sequence[b];
                    b++;
                }

                // sum이 k와 같으면
                if (sum == k) {
                    if (size > a - b) {
                        size = a - b;
                        answer[0] = b;
                        answer[1] = a;
                    }
                }
            }

            return answer;
        }
    }
