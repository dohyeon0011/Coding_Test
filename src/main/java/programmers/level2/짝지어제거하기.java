package programmers.level2;

import java.util.Stack;

public class 짝지어제거하기 {

    class Solution {
        public int solution(String s) {
            // 문제에 짝이 들어가면 보통 stack으로 풀림. replaceAll 정규 표현식으로 헤매지 않기.
            int answer = 0;
            char[] chArr = s.toCharArray();
            Stack<Character> st = new Stack<>();

            for (char c : chArr) {
                if (st.isEmpty()) {
                    st.push(c);
                } else {
                    if (st.peek() == c) {
                        st.pop();
                    } else {
                        st.push(c);
                    }
                }
            }

            answer = st.isEmpty() ? 1 : 0;

            return answer;
        }
    }

}
