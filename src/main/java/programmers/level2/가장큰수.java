package programmers.level2;

import java.util.Arrays;

public class 가장큰수 {

    class Solution {
        public String solution(int[] numbers) {
            String answer = "";

            String[] strArr = new String[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                strArr[i] = String.valueOf(numbers[i]);
            }

            // s2 + s1와 s1 + s2를 비교하여 더 큰 수를 반환하기
            Arrays.sort(strArr, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

            for (String str : strArr) {
                answer += str;
            }

            if (answer.charAt(0) == '0') {
                answer = "0";
            }

            return answer;
        }
    }
}
