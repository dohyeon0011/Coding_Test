package level2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 뉴스클러스터링_1차 {

    static String str1 = "aabbc";
    static String str2 = "abbde";

    public static void main(String[] args) {

        int answer = 0;
        List<String> str1List = new ArrayList<>();
        List<String> str2List = new ArrayList<>();
        List<String> unionList = new ArrayList<>(); // 합집합
        List<String> interList = new ArrayList<>(); // 교집합
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        for (int i = 0; i < str1.length() - 1; i++) {
            boolean bl = true;
            String s = str1.substring(i, i + 2);

            for (char ch : s.toCharArray()) {
                if (!Character.isLetter(ch)) {
                    bl = false;
                }
            }
            if (bl) {
                str1List.add(s);
            }
        }

        for (String string : str1List) {
            System.out.println("string = " + string);
        }
        System.out.println("==================");

        for (int i = 0; i < str2.length() - 1; i++) {
            boolean bl = true;
            String s = str2.substring(i, i + 2);

            for (char ch : s.toCharArray()) {
                if (!Character.isLetter(ch)) {
                    bl = false;
                }
            }
            if (bl) {
                str2List.add(s);
            }
        }

        for (String string : str2List) {
            System.out.println("string = " + string);
        }
        System.out.println("==================");

        if (str1List.isEmpty() && str2List.isEmpty()) {
            answer = 65536;
        }

        // 교집합, 합집합 구하기
        for (String s1 : str1List) {
            if (str2List.remove(s1)) {
                interList.add(s1);
            }
            unionList.add(s1);
        }
        unionList.addAll(str2List);

        double d = (double) interList.size() / (double) unionList.size();
        System.out.println("d = " + d);

        answer = (int) (d * 65536);
        System.out.println("answer = " + answer);

    }
    
}
