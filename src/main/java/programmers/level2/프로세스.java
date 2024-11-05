package programmers.level2;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class 프로세스 {

    class Solution {
        public int solution(int[] priorities, int location) {
            int answer = 0;
            /**
             * 일반적인 Queue는 기본적인 선입선출 구조이지만
             * 우선순위 큐(Priority Queue)는 우선순위가 가장 높거나, 낮은 큐부터 나간다.
             */
            Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 우선순위 큐(내림차순으로 들어감, 숫자 높은 것이 우선순위 높게됨.)

            for (int n : priorities) {
                pq.offer(n);
            }

            // 3 2 2 1
            // 9 1 1 1 1 1
            while (!pq.isEmpty()) { // 큐가 모두 비워질 때까지 무한 루프
                for (int i = 0; i < priorities.length; i++) {
                    if (priorities[i] == pq.peek()) { // 가장 우선순위인 큐와 같을 때
                        pq.poll(); // 우선순위 큐 제거
                        answer++;

                        if (i == location) {
                            return answer;
                        }
                    }
                }
            }

            return answer;
        }
    }

}
