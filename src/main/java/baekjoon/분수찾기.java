package baekjoon;

import java.io.*;

public class 분수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int floor = 1; // 층수

        while (num - floor > 0) { // 몇 층인지
            num -= floor;
            floor++;
        }

        int idx = num; // 몇 번째 칸인지
        int sum = floor + 1; // 분모와 분자의 합
        int a = 0, b = 0; // 분모, 분자

        if (floor % 2 == 1) {
            a = idx;
            b = sum - idx;
        } else {
            a = sum - idx;
            b = idx;
        }

        bw.write(String.valueOf(b) + "/" + String.valueOf(a));

        br.close();
        bw.close();
    }
}
