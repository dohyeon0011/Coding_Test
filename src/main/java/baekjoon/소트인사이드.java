package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class 소트인사이드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] strArr = str.split("");
        Integer[] intArr = new Integer[strArr.length];

        for (int i = 0; i < str.length(); i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        Arrays.sort(intArr, Collections.reverseOrder());

        for (Integer i : intArr) {
            bw.write(String.valueOf(i));
        }

        br.close();
        bw.close();
    }
}
