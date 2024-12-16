package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class 색종이_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int len = Integer.parseInt(br.readLine());
        int[][] arr = new int[100][100];
        int res = 0;

        for (int i = 0; i < len; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    res += arr[i][j];
                }
            }
        }
        bw.write(String.valueOf(res));

        br.close();
        bw.close();
    }
}
