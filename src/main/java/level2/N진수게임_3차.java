package level2;

public class N진수게임_3차 {

    class Solution {
        public String solution(int n, int t, int m, int p) {
            // 0(0) 1(1) 2(10) 3(11) 4(100) 5(101) 6(110) 7(111)
            StringBuilder sb = new StringBuilder(); // 범위 내 숫자들을 진수 변환하여 담을 공간
            StringBuilder answer = new StringBuilder(); // 튜브가 말할 것들을 담을 공간
            int len = t * m;

            // 말해야 하는 모든 숫자 진수 변환해서 저장
            // Integer.parseInt(int n, int m) => n을 m진수로 변환.
            for (int i = 0; i < len; i++) {
                String str = Integer.toString(i, n).toUpperCase(); // 16진수 변환 시 알파벳을 대문자로 변환
                sb.append(str);
            }

            // 튜브가 말해야 할 것들만 뽑아내기
            for (int i = p - 1; answer.length() < t; i += m) {
                answer.append(sb.charAt(i));
            }

            return answer.toString();
        }
    }

}
