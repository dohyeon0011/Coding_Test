package level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 롤케이크자르기 {
    static int[] topping = new int[] {1, 2, 1, 3, 1, 4, 1, 2};

    class Solution {
        public int solution(int[] topping) {
            int answer = 0;

            Map<Integer, Integer> map1 = new HashMap<>(); // 형
            Map<Integer, Integer> map2 = new HashMap<>(); // 동생

            // 형 맵에는 모두 다 채워주고
            for (int i : topping) {
                map1.put(i, map1.getOrDefault(i, 0) + 1);
            }

            // 1, 2, 1, 3, 1, 4, 1, 2
            // 1 : 4, 2 : 2, 3 : 1, 4 : 1
            // 동생 맵에서는 비워두고 형 맵에서는 차감, 동생 맵에는 추가 후 size()로 비교 -> Key 개수 비교
            for (int i : topping) {
                map2.put(i, map2.getOrDefault(i, 0) + 1);

                // 형 맵에서 이 종류의 토핑이 하나 뿐이었을 때, 형 맵에서는 아예 빼고 동생 맵에만 있게
                if (map1.get(i) - 1 == 0) {
                    map1.remove(i);
                } else {
                    map1.put(i, map1.get(i) - 1); // 해당 토핑 수량 -1 후 덮어 씌우기
                }

                if (map1.size() == map2.size()) {
                    answer++;
                }
            }

//         Set<Integer> set1 = new HashSet<>();
//         Set<Integer> set2 = new HashSet<>();

//         for (int i = 0; i < topping.length; i++) {
//             set1.add(topping[i]);
//             set2.clear();

//             for (int j = i + 1; j < topping.length; j++) {
//                 set2.add(topping[j]);
//             }

//             if (set1.size() == set2.size()) {
//                 answer++;
//             }
//         }

            return answer;
        }
    }

}
