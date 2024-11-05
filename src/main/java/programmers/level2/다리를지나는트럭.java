package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {

    class Solution {
        public int solution(int bridge_length, int weight, int[] truck_weights) {
            int answer = 0;
            int weightSum = 0;
            Queue<Integer> q = new LinkedList<>();

            for (int truck : truck_weights) {
                while (true) {
                    if (q.isEmpty()) {
                        q.offer(truck);
                        weightSum += truck;
                        answer++;
                        break;
                    } else if (q.size() == bridge_length) {
                        weightSum -= q.poll();
                    } else {
                        if (weightSum + truck <= weight) {
                            q.offer(truck);
                            answer++;
                            weightSum += truck;
                            break;
                        } else {
                            q.offer(0);
                            answer++;
                        }
                    }
                }
            }

            return answer + bridge_length;
        }
    }

}
