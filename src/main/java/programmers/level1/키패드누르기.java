package programmers.level1;

import java.lang.Math;

public class 키패드누르기 {

    class Solution {
        public String solution(int[] numbers, String hand) {
            // 가운데 위치 둘 다 같으면 hand(주 손)으로
            // 1(왼) 2(가까운) 3(오)
            // 4(왼) 5(가까운) 6(오)
            // 7(왼) 8(가까운) 9(오)
            // *(왼) 0(가까운) #(오)
            String answer = "";
            int leftPs = 10;
            int rightPs = 12;

            for(int num : numbers) {
                if (num == 1 || num == 4 || num == 7) {
                    answer += "L";
                    leftPs = num;
                } else if (num == 3 || num == 6 || num == 9) {
                    answer += "R";
                    rightPs = num;
                } else {
                    if (num == 0) {
                        num = 11;
                    }
                    // 번호 간의 거리 계산 = ((현재 위치 - 누를 번호) / 3) + ((현재 위치 - 누를 번호) % 3)
                    int leftDist = (Math.abs(leftPs - num) / 3) + (Math.abs(leftPs - num) % 3);
                    int rightDist = (Math.abs(rightPs - num) / 3) + (Math.abs(rightPs - num) % 3);

                    if (leftDist > rightDist) {
                        answer += "R";
                        rightPs = num;
                    } else if (leftDist < rightDist) {
                        answer += "L";
                        leftPs = num;
                    } else {
                        if (hand.equals("right")) {
                            answer += "R";
                            rightPs = num;
                        } else {
                            answer += "L";
                            leftPs = num;
                        }
                    }
                }
            }

            return answer;
        }
    }

}
