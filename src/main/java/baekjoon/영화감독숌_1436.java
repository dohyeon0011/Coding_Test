package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class 영화감독숌_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int movieName = 666;
        int cnt = 1;

        while (cnt < num) {
            movieName++;

            if (String.valueOf(movieName).contains("666")) {
                cnt++;
            }
        }

        bw.write(String.valueOf(movieName));

        br.close();
        bw.close();
    }
}
