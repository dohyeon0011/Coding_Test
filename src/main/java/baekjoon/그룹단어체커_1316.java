package baekjoon;

import java.io.*;
import java.util.Scanner;

public class 그룹단어체커_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int len = Integer.parseInt(br.readLine());
        int cnt = len;

        for (int i = 0; i < len; i++) {
            String str = br.readLine();
            boolean[] bl = new boolean[26];

            for (int j = 0; j < str.length() - 1; j++) {
                if (j > 0 && str.charAt(j) != str.charAt(j + 1)) {
                    // 이전에 나온 문자가 다시 나오면 그룹 단어 아님
                    if (bl[str.charAt(j + 1) - 'a']) {
                        cnt--;
                        break;
                    }
                }
                bl[str.charAt(j) - 'a'] = true; // 현재 문자를 체크
            }
        }
        bw.write(String.valueOf(cnt));

        br.close();
        bw.close();
    }

}