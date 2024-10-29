package level2;

public class 큰수만들기 {

    class Solution {
        public String solution(String number, int k) {
            String answer = "";
            StringBuilder sb = new StringBuilder();

            char[] chArr = number.toCharArray();
            int idx = 0; // 탐색할 인덱스

            for (int i = 0; i < chArr.length - k; i++) { // 나와야할 숫자 자릿수 만큼 반복문
                char max = '0';

                for (int j = idx; j <= i + k; j++) {
                    if (chArr[j] > max) {
                        max = chArr[j];
                        idx = j + 1;
                    }
                }
                sb.append(max);
            }
            answer = sb.toString();

            return answer;
        }
    }

}
