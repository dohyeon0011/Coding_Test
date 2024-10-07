package level2;

import java.util.ArrayList;
import java.util.List;

public class 모음사전 {

    class Solution {

        static String[] strArr = new String[]{"A", "E", "I", "O", "U"};
        static List<String> strList = new ArrayList<>();

        public int solution(String word) {
            int answer = 0;

            dfs("", 0);
            int size = strList.size();

            for (int i = 0; i < size; i++) {
                if (word.equals(strList.get(i))) {
                    answer = i;
                    break;
                }
            }

            return answer;
        }

        // 모든 경우의 수 리스트에 담기
        static void dfs(String str, int len) {
            strList.add(str);

            if (len == 5) {
                return;
            }

            for (int i = 0; i < strArr.length; i++) {
                dfs(str + strArr[i], len + 1);
            }
        }

    }
}
