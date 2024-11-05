package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 개인정보수집유효기간 {

    class Solution {
        public int[] solution(String today, String[] terms, String[] privacies) {
            List<Integer> intList = new ArrayList<>();
            int year = Integer.parseInt(today.substring(0, 4));
            int month = Integer.parseInt(today.substring(5, 7));
            int day = Integer.parseInt(today.substring(8));

            for (int i = 0; i < privacies.length; i++) {
                int addMonth = 0;
                int resultYear = Integer.parseInt(privacies[i].substring(0, 4));
                char chkPri = privacies[i].charAt(privacies[i].length() - 1);

                for (int j = 0; j < terms.length; j++) {
                    char chkTerm = terms[j].charAt(0);

                    if (chkPri == chkTerm) {
                        addMonth = Integer.parseInt(terms[j].substring(2));
                    }
                }
                int endIdx = privacies[i].indexOf(".", 5);

                int resultMonth = Integer.parseInt(privacies[i].substring(5, endIdx)) + addMonth;
                int resultDay = Integer.parseInt(privacies[i].substring(8, 10));

                if (resultMonth > 12) {
                    while (resultMonth > 12) {
                        resultMonth -= 12;
                        resultYear++;
                    }
                }

                if (year == resultYear) {
                    if (month == resultMonth) {
                        if (day >= resultDay) {
                            intList.add(i + 1);
                        }
                    } else if (month > resultMonth) {
                        intList.add(i + 1);
                    }
                } else if (year > resultYear) {
                    intList.add(i + 1);
                }
            }

            int[] answer = new int[intList.size()];

            for (int k = 0; k < intList.size(); k++) {
                answer[k] = intList.get(k);
            }
            Arrays.sort(answer);

            return answer;
        }
    }

}
