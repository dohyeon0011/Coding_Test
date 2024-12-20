package baekjoon.DP;

import java.io.*;

public class 거스름돈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int money = Integer.parseInt(br.readLine());
        int answer = 0;

        while (money > 0) {
            if (money % 5 == 0) {
                answer += (money / 5);
                break;
            }
            money -= 2;
            answer++;

            if (money < 0) {
                answer = -1;
                break;
            }
        }

        bw.write(String.valueOf(answer));

        br.close();
        bw.close();
    }
}
