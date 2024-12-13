package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class 덩치_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int len = Integer.parseInt(br.readLine());
        int[][] intArr = new int[len][2];
        int[] rankArr = new int[len];

        for (int i = 0; i < len; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            intArr[i][0] = Integer.parseInt(st.nextToken()); // 몸무게
            intArr[i][1] = Integer.parseInt(st.nextToken()); // 키
        }

        for (int i = 0; i < intArr.length; i++) {
            int cnt = 0;

            for (int j = 0; j < intArr.length; j++) {
                if (i == j) {
                    continue;
                }
                if (intArr[i][0] < intArr[j][0] && intArr[i][1] < intArr[j][1]) {
                    cnt++;
                }
            }
            rankArr[i] = cnt + 1;
        }

        for (int r : rankArr) {
            bw.write(String.valueOf(r) + " ");
        }

        br.close();
        bw.close();
    }
}
