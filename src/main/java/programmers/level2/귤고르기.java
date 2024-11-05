package programmers.level2;

import java.util.*;

public class 귤고르기 {

    class Solution {
        public int solution(int k, int[] tangerine) {
            // 1 2 2 3 3 4 5 5 (6, 1:1, 2:2, 3:2, 4:1, 5:2)
            // 1 2 2 3 3 4 5 5 (4, 1:1, 2:2, 3:2, 4:1, 5:2)
            // 1 1 1 1 2 2 2 3 (2, 1:4, 2:3, 3:1)

            int sum = 0; // 총 고른 귤의 개수
            int answer = 0;

            Map<Integer, Integer> map = new HashMap<>();
            for (int n : tangerine) {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }
            List<Integer> list = new ArrayList<>(map.values()); // 각 숫자가 몇 개 있는 지 value 값들만 저장
            Collections.sort(list, Collections.reverseOrder()); // 내림차순 정렬, 많은 것부터 담으려고
            // list.sort( (o1 , o2) -> map.get(o2) - map.get(o1));

            for (int num : list) {
                if (sum + num >= k) {
                    answer++;
                    break;
                } else {
                    sum += num;
                    answer++;
                }
            }

            return answer;
        }
    }

}
