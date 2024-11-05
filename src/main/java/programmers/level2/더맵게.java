package programmers.level2;

import java.util.PriorityQueue;
import java.util.Queue;

public class 더맵게 {

    class Solution {
        public int solution(int[] scoville, int K) {
            int answer = 0;
            // 우선순위 큐 : 들어가는 순서와는 상관없이 우선순위가 높은 데이터가 먼저 나가는 자료구조
            Queue<Integer> pq = new PriorityQueue<>();

            // 우선순위 큐에 스코빌지수들을 넣어주고
            for (int n : scoville) {
                pq.offer(n);
            }

            // pq.peek()을 하게되면 우선순위가 가장 낮은 원소를 꺼내게 되므로
            // 스코빌 지수가 가장 낮을 수를 꺼내게 됨. 가장 낮은 수가 목표인 K보다 낮을 때까지 반복
            while (pq.peek() < K) {
                if (pq.size() < 2) { // 스코빌 지수 섞는 것은 2개 이상일 때 가능하므로.
                    return -1;
                }

                pq.offer(pq.poll() + pq.poll() * 2);
                answer++;
            }

            return answer;
        }
    }

}
