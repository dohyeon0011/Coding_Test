package baekjoon.DP;

import java.io.*;
import java.util.StringTokenizer;

public class 최대상승 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int day = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE; // 그전까지의 최소값
        int res = 0; // 그전까지의 최대값

        st  = new StringTokenizer(br.readLine());
        for (int i = 0; i < day; i++) {
            int stockPrice = Integer.parseInt(st.nextToken()); // 현재 시점

            res = Math.max(res, stockPrice - min); // 현 시점기준 최대값 비교(그 전까지의 res(최대값), 현재 값 - 그 전까지의 최소값)
            min = Math.min(min, stockPrice);  // 현 시점기준 최소값 비교(그 전까지의 min(최소값), 현재값)
        }

        bw.write(String.valueOf(res));

        br.close();
        bw.close();
    }
}
