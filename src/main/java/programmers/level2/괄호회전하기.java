package programmers.level2;

import java.util.Stack;

public class 괄호회전하기 {

    class Solution {
        public int solution(String s) {
            int answer = 0;

            for (int i = 0; i < s.length(); i++) {
                Stack<Character> st = new Stack<>();
                String str = s.substring(i, s.length()) + s.substring(0, i);

                for (int j = 0; j < str.length(); j++) {
                    char c = str.charAt(j);

                    if (st.isEmpty()) {
                        st.push(c);
                    } else if (c == ')' && st.peek() == '(') {
                        st.pop();
                    } else if (c == '}' && st.peek() == '{') {
                        st.pop();
                    } else if (c == ']' && st.peek() == '[') {
                        st.pop();
                    } else {
                        st.push(c);
                    }
                }

                if (st.isEmpty()) {
                    answer++;
                }
            }

            return answer;
        }
    }

}
