package level1;

import java.util.HashMap;
import java.util.Map;

public class 성격유형검사하기 {

    class Solution {
        public String solution(String[] survey, int[] choices) {
            // R T
            // C F
            // J M
            // A N
            String answer = "";
            int[] scoreArr = {3, 2, 1, 0, 1, 2, 3};
            char[] chArr = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
            Map<Integer, Integer> scoreMap = new HashMap<>();
            Map<Character, Integer> rank = new HashMap<>();
            int scoreIdx = 1;
            int choicesIdx = 0;

            for(int n : scoreArr) {
                scoreMap.put(scoreIdx++, n);
            }
            for(char c : chArr) {
                rank.put(c, 0);
            }

            for(String str : survey) {
                if (choices[choicesIdx] >= 1 && choices[choicesIdx] <= 3) {
                    char ch = str.charAt(0);
                    int score = rank.get(ch);
                    rank.put(ch, score + scoreMap.get(choices[choicesIdx++]));
                } else if (choices[choicesIdx] >= 5 && choices[choicesIdx] <= 7) {
                    char ch = str.charAt(1);
                    rank.put(ch, rank.getOrDefault(ch, 0) + scoreMap.get(choices[choicesIdx++]));
                } else {
                    choicesIdx++;
                    continue;
                }
            }

            for(int i = 0; i < chArr.length; i += 2) {
                int num1 = rank.get(chArr[i]).intValue();
                int num2 = rank.get(chArr[i + 1]).intValue();

                if (num1 == num2) {
                    answer += chArr[i] > chArr[i + 1] ?  chArr[i + 1] + "" : chArr[i] + "";
                } else if (num1 > num2) {
                    answer += chArr[i] + "";
                } else {
                    answer += chArr[i + 1] + "";
                }
            }

            return answer;
        }
    }

// import java.util.*;
// import java.lang.Math;

// class Solution {
//     public String solution(String[] survey, int[] choices) {
//         // R T
//         // C F
//         // J M
//         // A N
//         String answer = "";
//         char[] chArr = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
//         Map<Character, Integer> rank = new HashMap<>();
//         int choicesIdx = 0;

//         for(char c : chArr) {
//             rank.put(c, 0);
//         }

//         for(String str : survey) {
//             if (choices[choicesIdx] >= 1 && choices[choicesIdx] <= 4) {
//                 char ch = str.charAt(0);
//                 int score = rank.get(ch);
//                 rank.put(ch, score + 4 - choices[choicesIdx++]);
//             } else if (choices[choicesIdx] >= 5 && choices[choicesIdx] <= 7) {
//                 char ch = str.charAt(1);
//                 int score = rank.get(ch);
//                 rank.put(ch, score + choices[choicesIdx++] - 4);
//             }
//         }

//         for(int i = 0; i < chArr.length; i += 2) {
//             int num1 = rank.get(chArr[i]).intValue();
//             int num2 = rank.get(chArr[i + 1]).intValue();

//             if (num1 == num2) {
//                 answer += chArr[i] > chArr[i + 1] ?  chArr[i + 1] + "" : chArr[i] + "";
//             } else if (num1 > num2) {
//                 answer += chArr[i] + "";
//             } else {
//                 answer += chArr[i + 1] + "";
//             }
//         }

//         return answer;
//     }
// }

}
