package level2;

import java.util.LinkedList;
import java.util.Queue;

public class 두큐합같게만들기 {

    class Solution {
        // 먼저 각 큐의 합을 구하는 메서드
        public long getSum(int[] queue) {
            long sum = 0;

            for (int n : queue) {
                sum += (long) n;
            }

            return sum;
        }

        public int solution(int[] queue1, int[] queue2) {
            int answer = 0;
            long sum1 = getSum(queue1);
            long sum2 = getSum(queue2);
            Queue<Long> q1 = new LinkedList<>(); // 각 큐를 배열이 아닌 직접 큐에 담아 쓰려고
            Queue<Long> q2 = new LinkedList<>();

            for (int i = 0; i < queue1.length; i++) {
                q1.offer((long) queue1[i]);
                q2.offer((long) queue2[i]);
            }

            while(sum1 != sum2) {
                long num = 0;

                if(answer > (queue1.length + queue2.length) * 2) {
                    return -1;
                }

                if(sum1 > sum2) {
                    num = q1.poll();
                    q2.offer(num);
                    sum1 -= num;
                    sum2 += num;
                }
                else if (sum1 < sum2) {
                    num = q2.poll();
                    q1.offer(num);
                    sum1 += num;
                    sum2 -= num;
                }
                else {
                    return answer;
                }

                answer++;
            }

            return answer;
        }
    }

}
