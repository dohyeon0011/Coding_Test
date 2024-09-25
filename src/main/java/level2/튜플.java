package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 튜플 {
    public static String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";

    public static void main(String[] args) {
        // String[] strArr = s.substring(2, s.length() - 2).replace("},{", "-").split("-");
        String[] strArr = s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim().split(" , ");
        List<Integer> intList = new ArrayList<>();
        Arrays.sort(strArr, (o1, o2) -> o1.length() - o2.length());

        // 0 ~ 9 : 48 ~ 57
        for (String str1 : strArr) {
            for (String str2 : str1.split(",")) {
                int n = Integer.parseInt(str2);

                if (!intList.contains(n)) {
                    intList.add(n);
                }
            }
        }

        int[] answer = new int[intList.size()];

        for (int i = 0; i < intList.size(); i++) {
            answer[i] = intList.get(i);
        }

        for (int i : answer) {
            System.out.println("i = " + i);
        }
    }

}
