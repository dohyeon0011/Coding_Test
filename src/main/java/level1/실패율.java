package level1;

import java.util.*;

public class 실패율 {

    class Solution {
        public int[] solution(int N, int[] stages) {
            // 1 2 2 2 3 3 4 6
//         int[] answer = new int[N];
//         Map<String, Integer> stageCnt = new HashMap<>();
//         Map<String, Double> stageRank = new HashMap<>();
//         int topStage = 0;

//         for(int i = 0; i < stages.length - 1; i++) {
//             topStage = Math.max(stages[i], stages[i + 1]);
//         }

//         for(int i = 0; i < stages.length; i++) {
//             stageCnt.put(String.valueOf(stages[i]), stageCnt.getOrDefault(String.valueOf(stages[i]), 1) + 1);
//         }

//         for(int i = 0; i < stageCnt.size(); i++) {
//             int sum = 0;
//             for(int j = 0; j < stageCnt.size(); j++) {
//                 sum += stageCnt.get(String.valueOf(stages[j]));
//             }

//             double probability = stageRank.get(String.valueOf(stages[i])) / sum;
//             stageRank.put(String.valueOf(stages[i]), probability);
//             stageCnt.remove(stages[i] + "");
//         }

            Map<Integer, Double> map = new HashMap<>();
            int[] userFailCnt = new int[N + 2]; // 스테이지 별 머물러 있는 사용자 수
            int[] userTotalCnt = new int[N + 1]; // 스테이지 별 도달한 사용자 수

            // 스테이지 별 머물러 있는 사용자 수 카운트
            // 0 1 2 3 4 5 6
            // 0 1 3 2 1 0 1

            // 0 1 2 3 4 5
            // 0 0 0 0 4 0
            for(int stage : stages) {
                userFailCnt[stage]++;
            }

            // 1 2 2 2 3 3 4 6
            // 스테이지 별 도달한(클리어 + 머무르고 있는) 사용자 수 카운트
            // 0 1 2 3 4 5
            // 0 8 7 4 2 1

            // 0 1 2 3 4
            // 0 4 4 4 4
            userTotalCnt[N] = userFailCnt[N] + userFailCnt[N + 1];
            for(int i = N - 1; i >= 1; i--) { // idx 4 ~ 1
                userTotalCnt[i] = userFailCnt[i] + userTotalCnt[i + 1];
            }

            // 스테이지 별 실패율 계산
            for(int i = 1; i < userTotalCnt.length; i++) {
                if (userFailCnt[i] == 0) {
                    map.put(i, 0.0);
                } else {
                    map.put(i, (double) userFailCnt[i] / userTotalCnt[i]);
                }
            }

            // 실패율(value) 값으로 내림차순 정렬
            List<Integer> intList = new ArrayList<>(map.keySet());
            // o2의 실패율이 o1보다 크면 -1, 작으면 1, 같으면 0 반환 / 오름차순은 o2, o1 바꿔서
            Collections.sort(intList, (o1, o2) -> Double.compare(map.get(o2), map.get(o1)));

            return intList.stream().mapToInt(Integer::intValue).toArray();
        }
    }

}
