package level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 햄버거만들기 {

    class Solution {
        public int solution(int[] ingredient) {
            // 빵(1) - 야채(2) - 고기(3) - 빵(1)
            int answer = 0;
            List<Integer> intList = new ArrayList<>();
            Stack<Integer> intStack = new Stack<>();

//         for(int i : ingredient) {
//             intStack.push(i);

//             if (intStack.size() >= 4) {
//                 int idx = intStack.size();
//                 if (intStack.get(idx - 4) == 1
//                    && intStack.get(idx - 3) == 2
//                    && intStack.get(idx - 2) == 3
//                    && intStack.get(idx - 1) == 1) {
//                     for(int j = 0; j < 4; j++) {
//                         intStack.pop();
//                     }
//                     answer++;
//                 }
//             }
//         }


            for(int i : ingredient) {
                intList.add(i);

                // 2 1 2 3 1
                if (intList.size() >= 4) {
                    int idx = intList.size();
                    if (intList.get(idx - 4) == 1
                            && intList.get(idx - 3) == 2
                            && intList.get(idx - 2) == 3
                            && intList.get(idx - 1) == 1) {
                        answer++;
                        for(int j = 0; j < 4; j++) {
                            intList.remove(intList.size() - 1);
                        }
                    }
                }
            }

            return answer;
        }
    }

}
