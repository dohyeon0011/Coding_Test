package level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 시소짝꿍 {

    class Solution {
        public long solution(int[] weights) {
            // 100 100 180 270 360
            // 정렬을 하면 같거나, 2배 : 3배, 2배 : 4배, 3배 : 4배 이렇게만 보면 됨.
            long answer = 0;
            Arrays.sort(weights);
            // Map에 반복문을 타는 몸무게들을 차례대로 넣으면서 key가 존재하는 지만 따져보면 됨.
            Map<Double, Integer> map = new HashMap<>();

            for (int weight : weights) {
                double a = (double) weight;
                double b = ((double) weight * 2.0) / 3.0;
                double c = ((double) weight * 2.0) / 4.0;
                double d = ((double) weight * 3.0) / 4.0;

                if (map.containsKey(a)) {
                    answer += map.get(a);
                }
                if (map.containsKey(b)) {
                    answer += map.get(b);
                }
                if (map.containsKey(c)) {
                    answer += map.get(c);
                }
                if (map.containsKey(d)) {
                    answer += map.get(d);
                }
                map.put((double) weight, map.getOrDefault((double) weight, 0) + 1);
            }

            return answer;
        }
    }

}
