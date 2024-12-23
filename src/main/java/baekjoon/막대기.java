package baekjoon;

import java.io.*;

public class 막대기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 64 32 16 8 4 2 1
        // 23 - 16 = 7 - 4 = 3 - 2 = 1 - 1 = 0
        // 1 1 1 1
        int X = Integer.parseInt(br.readLine());
        int stick = 64;
        int cnt = 1;

        while (true) {
            if (X == stick) {
                break;
            }

            if (X >= stick) {
                X -= stick;
                cnt++;
            }
            stick /= 2;
        }
        bw.write(String.valueOf(cnt));

        br.close();
        bw.close();
    }
}
