package level2;

public class 다음큰숫자 {

    class Solution {
        public int solution(int n) {
            int answer = 0;
            int nextNum = n;
            // toBinaryString().replaceAll()을 하는 것 보다 Integer.bitCount()을 쓰는 게 더 효율적이고 빠름.
            // Integer.bitCount : 2진수에서 1인 개수만 가져오기
            // int nLen = Integer.toBinaryString(n).replaceAll("0", "").length(); // 1111(4)
            int nLen = Integer.bitCount(n);

            while(true) {
                nextNum++;
                // int nextNumLen = Integer.toBinaryString(nextNum).replaceAll("0", "").length();
                int nextNumLen = Integer.bitCount(nextNum);

                if (nLen == nextNumLen) {
                    answer = nextNum;
                    break;
                }
            }

            return answer;
        }
    }

}
