package programmers.level1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 신고결과받기 {

    class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            int[] answer = new int[id_list.length];
            // id, 신고한 사람들
            Map<String, Set<String>> resultMap = new HashMap<>();
            Map<String, Integer> idxMap = new HashMap<>(); // 인덱스 순서

            for (int i = 0; i < id_list.length; i++) {
                resultMap.put(id_list[i], new HashSet<>());
                idxMap.put(id_list[i], i);
            }

            for (String s : report) {
                String[] str = s.split(" ");
                String front = str[0];
                String behind = str[1];

                resultMap.get(behind).add(front);
            }

            for (int i = 0; i < id_list.length; i++) {
                Set<String> str = resultMap.get(id_list[i]);
                if (str.size() >= k) {
                    for (String s : str) {
                        answer[idxMap.get(s)]++;
                    }
                }
            }

            return answer;
        }
    }

}
