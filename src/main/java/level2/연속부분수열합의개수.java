package level2;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class 연속부분수열합의개수 {

    class Solution {
        public int solution(int[] elements) {
            int answer = 0;
            Set<Integer> set = new HashSet<>();

            for (int i = 1; i <= elements.length; i++) { // 1 ~ 5
                for (int j = 0; j < elements.length; j++) { // 0 ~ 4
                    int sum = 0;

                    for (int k = j; k < j + i; k++) {
                        sum += elements[k % elements.length];
                    }
                    set.add(sum);
                }
            }

//         ArrayList<Integer> list = new ArrayList<Integer>();

//         // 주어진 배열 크기 2배로 늘리기
//         // 7 9 1 1 4 7 9 1 1 4
//         for (int i = 0; i < 2; i++) {
//             for (int element : elements) {
//                 list.add(element);
//             }
//         }

//         for (int i = 0; i < elements.length; i++) { // 0 ~ 4
//             for (int j = 1; j <= elements.length; j++) { // 1 ~ 5
//                 List<Integer> subList = list.subList(i, i + j);
//                 int sum = 0;
//                 for (int num : subList)
//                     sum += num;
//                 set.add(sum);
//             }
//         }

            return set.size();
        }
    }

}
