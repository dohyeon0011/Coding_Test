package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class 팩토리얼0의개수_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (n >= 5) {
            cnt += (n /= 5);
        }
        bw.write(String.valueOf(cnt));

        br.close();
        bw.close();
    }
}
