package programmers.level2;

import java.util.*;

public class 압축_3차 {

    static String msg = "KAKAO";

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 1; i < 27; i++) {
            map.put(String.valueOf((char) (65 + i - 1)), i);
        }

        for (int i = 0; i < msg.length(); i++) {
            int idx = 0;
            String str = "";

            for (int j = i + 1; j <= msg.length(); j++) {
                str = msg.substring(i, j);

                if (map.containsKey(str)) {
                    idx = map.get(str);

                    if (j == msg.length()) {
                        i = j;
                    }
                } else {
                    i = j - 2;
                    break;
                }
            }
            map.put(str, map.size() + 1);
            intList.add(idx);
        }
    }
}
