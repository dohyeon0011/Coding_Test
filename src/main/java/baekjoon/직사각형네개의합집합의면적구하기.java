package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class 직사각형네개의합집합의면적구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        boolean[][] bl = new boolean[101][101];
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    bl[j][k] = true;
                }
            }
        }

        for (int i = 0; i < bl.length; i++) {
            for (int j = 0; j < bl[i].length; j++) {
                if (bl[i][j]) {
                    sum++;
                }
            }
        }
        bw.write(String.valueOf(sum));

        br.close();
        bw.close();
    }
}
