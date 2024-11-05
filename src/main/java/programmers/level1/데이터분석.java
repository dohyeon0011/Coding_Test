package programmers.level1;

import java.util.*;

public class 데이터분석 {

    class Solution {
        public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
//         String[] index = { "code", "date", "maximum", "remain" };
//         List<String> dataType = Arrays.asList(index);
//         int extIdx = dataType.indexOf(ext);
//         int sortIdx = dataType.indexOf(sort_by);

//         return Arrays.stream(data)
//                 .filter(d1 -> d1[extIdx] < val_ext)
//                 .sorted((o1, o2) -> o1[sortIdx] - o2[sortIdx]) // o2, o1 바꾸면 내림차순으로 바뀜.
//                 .toArray(int[][]::new);


            Map<String, Integer> dataType = new HashMap<>();
            dataType.put("code", 0);
            dataType.put("date", 1);
            dataType.put("maximum", 2);
            dataType.put("remain", 3);

            List<int[]> dataList = new ArrayList<>();
            for(int[] intArr : data) {
                if (intArr[dataType.get(ext)] < val_ext) {
                    dataList.add(intArr);
                }
            }

            dataList.sort(Comparator.comparingInt(arr -> arr[dataType.get(sort_by)]));

            return dataList.toArray(new int[0][]);
        }
    }

}
