package programmers.level2;

import java.util.*;

public class 주차요금계산 {

    class Solution {
        public int[] solution(int[] fees, String[] records) {
            List<Integer> intList = new ArrayList<>();
            Map<String, Integer> inOut = new HashMap<>();
            Map<String, Integer> minResult = new TreeMap<>(); // 데이터를 넣을 때 자동으로 정렬된다.

            for (String str : records) {
                String[] strArr = str.split(" ");
                int time = getTime(strArr[0]);
                String carNumber = strArr[1];
                String status = strArr[2];

                if (status.equals("IN")) { // 입차 할 때
                    inOut.put(carNumber, time);
                } else { // 출차할 때
                    if (minResult.containsKey(carNumber)) { // 입차 기록 있으면.
                        int inTime = inOut.get(carNumber);
                        int result = time - inTime;

                        minResult.put(carNumber, minResult.getOrDefault(carNumber, result) + result);
                    } else { // 입차 기록 없으면
                        int inTime = inOut.get(carNumber);
                        int result = time - inTime;

                        minResult.put(carNumber, result);
                    }
                    inOut.remove(carNumber);
                }
            }

            // 23:59가 지나도록 출차하지 않았을 때 23:59에 출차 처리
            if (!inOut.isEmpty()) {
                for (String car : inOut.keySet()) {
                    Integer inTime = minResult.get(car);
                    inTime = (inTime == null) ? 0 : inTime;
                    int result = inTime + (23 * 60 + 59) - inOut.get(car);

                    minResult.put(car, result);
                }
            }

            for (Integer t : minResult.values()) {
                if (t <= fees[0]) {
                    intList.add(fees[1]);
                } else {
                    intList.add((int) (fees[1] + Math.ceil((double)(t - fees[0]) / fees[2]) * fees[3]));
                }
            }

            return intList.stream().mapToInt(Integer::intValue).toArray();
        }

        public int getTime(String timeStr) {
            String[] timeArr = timeStr.split(":");
            int hour = Integer.parseInt(timeArr[0]);
            int min = Integer.parseInt(timeArr[1]);
            return hour * 60 + min;
        }

    }

}
