package programmers.level2;

public class 이진변환반복 {

    class Solution {
        public int[] solution(String s) {
            // 내가 푼 풀이
//         int cycleCnt = 0;
//         int deleteCnt = 0;

//         // 111111, 6 -> 110
//         // 11, 2 -> 10
//         // 1, 1 -> 1
//         while(!s.equals("1")) {
//             String str = "";

//             for (char ch : s.toCharArray()) {
//                 if (ch == '1') {
//                     str += ch + ""; // 1만 추가
//                 } else {
//                     deleteCnt++;
//                 }
//             }
//             int n = str.length();
//             s = Integer.toBinaryString(n); // 10진수 -> 2진수 변환
//             cycleCnt++;
//         }
//         int[] answer = {cycleCnt, deleteCnt};

//         return answer;

            // 다른 사람이 푼 풀이
            int[] answer = new int[2];
            int num;

            while(!s.equals("1")) {
                answer[1] += s.length(); // 0 제거 계산 방법 : 맨 처음 전체 길이 - 0을 제외한 문자열 길이 = 0이 제거된 길이
                s = s.replaceAll("0", ""); // 0을 ""로 바꿔주기
                num = s.length(); // 1만 남은 문자열의 길이
                s = Integer.toBinaryString(num);
                answer[0]++; // 변환한 사이클 수
                answer[1] -= num; // 0 제거한 개수
            }

            return answer;
        }
    }

}
