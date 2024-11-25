package baekjoon.DP;

import java.io.*;

public class 계단오르기_2579 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] stairs = new int[num + 1]; // 해당 계단의 점수
        int[] maxScore = new int[num + 1]; // 해당 계단에서의 최고 점수를 저장할 곳

        for (int i = 1; i <= num; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }

        maxScore[1] = stairs[1];
        maxScore[2] = stairs[1] + stairs[2];
        maxScore[3] = Math.max(stairs[1], stairs[2]) + stairs[3];

        for (int i = 4; i <= num; i++) {
            maxScore[i] = Math.max(maxScore[i - 3] + stairs[i - 1], maxScore[i - 2]) + stairs[i];
        }

        bw.write(String.valueOf(maxScore[num]));

        br.close();
        bw.close();
    }

}
