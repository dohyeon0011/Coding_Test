package level1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class 가장많이받은선물 {

    class Solution {
        public int solution(String[] friends, String[] gifts) {
            int answer = 0;
            Map<String, Map<String, Integer>> map = new HashMap<>(); // 누가 누구에게, 몇 개 줬는지
            Map<String, Integer> factorMap = new HashMap<>(); // 선물 지수
            Map<String, Integer> nextMonthResultMap = new HashMap<>(); // 다음 달 받을 선물 개수

            // Map, 이중 Map 초기화
            for (String str : friends) {
                map.put(str, new HashMap<>());
                nextMonthResultMap.put(str, 0); // getOrDefault()로 쓸거면 지워도 됨.
            }

            // 누가 누구에게 줬는 지, 선물 지수 계산(준 사람은 + 1, 받은 사람은 - 1)
            for (String gift : gifts) {
                String[] str = gift.split(" ");
                String giver = str[0];
                String receiver = str[1];

                map.get(giver).put(receiver, map.get(giver).getOrDefault(receiver, 0) + 1);
                factorMap.put(giver, factorMap.getOrDefault(giver, 0) + 1);
                factorMap.put(receiver, factorMap.getOrDefault(receiver, 0) - 1);
            }

            for (String giver : friends) {
                for (String receiver : friends) {
                    if (!giver.equals(receiver)) {
                        int giverCnt = map.get(giver).getOrDefault(receiver, 0); // a가 b에게 준 개수
                        int receiverCnt = map.get(receiver).getOrDefault(giver, 0); // b가 a에게 준 개수

                        if (giverCnt > receiverCnt) { // a가 b보다 많이 줬다면
                            nextMonthResultMap.put(giver, nextMonthResultMap.get(giver) + 1);
                        } else if (giverCnt == receiverCnt &&
                                factorMap.getOrDefault(giver, 0) > factorMap.getOrDefault(receiver, 0))
                            // a랑 b가 같이 주고 받고, 선물 지수가 더 크다면
                            nextMonthResultMap.put(giver, nextMonthResultMap.get(giver) + 1);
                    }
                }
            }

            // for (String user : friends) {
            // if (answer < nextMonthResultMap.get(user)) {
            // answer = nextMonthResultMap.get(user);
            // }
            // }

            return Collections.max(nextMonthResultMap.values());
            // return answer;
        }
    }

}
