package codesignal;

import java.util.ArrayList;
import java.util.List;

public class sample1 {
    static int[] numbers = new int[]{1, 3, 4, 5, 6, 14, 14}; // 5 / 7

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < numbers.length - 2; i++) {
            if ((numbers[i] <= numbers[i+1]) && (numbers[i+1] <= numbers[i+2])) {
                integerList.add(0);
                continue;
            } else if ((numbers[i] >= numbers[i+1]) && (numbers[i+1] >= numbers[i+2])) {
                integerList.add(0);
                continue;
            }
            integerList.add(1);
        }
//        int[] array = integerList.stream()
//                .mapToInt(Integer::intValue)
//                .toArray();

        int[] answer = new int[integerList.size()];

        int idx = 0;
        for (Integer i : integerList) {
            answer[idx++] = i;
        }
    }
}
