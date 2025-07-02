package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class 토너먼트 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int jimin = Integer.parseInt(st.nextToken());
        int hansu = Integer.parseInt(st.nextToken());
        int round = 0;

        while (jimin != hansu) {
            jimin = (jimin / 2) + (jimin % 2);
            hansu = (hansu / 2) + (hansu % 2);
            round++;
        }
        writer.write(round + "");

        reader.close();
        writer.close();
    }
}
