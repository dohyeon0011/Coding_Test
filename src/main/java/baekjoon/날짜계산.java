package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class 날짜계산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int e = 1, s = 1, m = 1;
        int year = 1;

        while (true) {
            if (e > 15) {
                e = 1;
            }
            if (s > 28) {
                s = 1;
            }
            if (m > 19) {
                m = 1;
            }
            if (e == E && s == S && m == M) {
                break;
            }
            e++;
            s++;
            m++;
            year++;
        }
        bw.write(String.valueOf(year));

        br.close();
        bw.close();
    }
}
