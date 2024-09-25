package level1;

public class 옹알이 {

    class Solution {
        public int solution(String[] babbling) {
            int answer = 0;
            String[] str = {"ayaaya", "yeye", "woowoo", "mama"};
            String[] replaceStr = {"aya", "ye", "woo", "ma"};

            // 공백으로 replace 하는 이유는 공백으로 처리했을 경우 앞의 단어와 연결되어 또 다른 문자로 변경될 수 있으므로
            // 공백으로 replace 해준 후 trim()으로 공백을 제거해 준다.  
            // 남은 양 옆의 글자들이 붙어버려 엉뚱하게 삭제 되어버리는 경우가 생김.
            for(int i = 0; i < babbling.length; i++) {
                for(int j = 0; j < str.length; j++) {
                    babbling[i] = babbling[i].replace(str[j], "1").replace(replaceStr[j], " ");
                }

                if (babbling[i].trim().length() == 0) {
                    answer++;
                }
            }

            return answer;
        }
    }

}
