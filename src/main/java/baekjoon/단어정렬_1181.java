package baekjoon;

import java.io.*;
import java.util.*;

public class 단어정렬_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int len = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < len; i++) {
            String str = br.readLine();
            set.add(str);
        }
        String[] strArr = set.toArray(new String[set.size()]);

        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        for (String s : strArr) {
            bw.write(String.valueOf(s) + "\n");
        }

        br.close();
        bw.close();
    }
}
