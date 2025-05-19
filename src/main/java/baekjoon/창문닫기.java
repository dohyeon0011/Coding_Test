package baekjoon;

import java.io.*;

public class 창문닫기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1, 4, 9, 16, 25 ...
        // 0 0
        // 1 1
        // 2 1
        // 3 1
        // 4 2
        // 5 2
        // 6 2
        // 7 2
        // 8 2
        // 9 3
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 1; i * i <= N; i++) {
            count++;
        }
        bw.write(count + "\n");

        br.close();
        bw.close();
    }
}
