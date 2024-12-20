package baekjoon;

import java.io.*;
import java.util.Arrays;

public class 수정렬하기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int len = Integer.parseInt(br.readLine());
        int[] intArr = new int[len];

        for (int i = 0; i < len; i++) {
            int num = Integer.parseInt(br.readLine());

            intArr[i] = num;
        }
        Arrays.sort(intArr);

        for (int n : intArr) {
            bw.write(String.valueOf(n) + "\n");
        }
        br.close();
        bw.close();
    }
}
