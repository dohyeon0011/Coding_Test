package baekjoon;

import java.io.*;

public class 수들의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long num = Long.parseLong(br.readLine());
        int cnt = 1;

        for (int i = 1; ; i++) {
            if (num < i) {
                break;
            }
            num -= i;
            cnt++;
        }
        bw.write(String.valueOf(--cnt));

        br.close();
        bw.close();

    }
}