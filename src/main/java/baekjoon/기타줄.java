package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class 기타줄 {

    private static int sixMin = Integer.MAX_VALUE;
    private static int oneMin = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(reader.readLine(), " ");
            sixMin = Math.min(Integer.parseInt(st.nextToken()), sixMin);
            oneMin = Math.min(Integer.parseInt(st.nextToken()), oneMin);
        }
        int packageCase = (N + 5) / 6 * sixMin;
        int oneCase = N * oneMin;
        int mixCase = (N / 6) * sixMin + (N % 6) * oneMin;

        int result = Math.min(packageCase, Math.min(oneCase, mixCase));
        writer.write(result + "");

        reader.close();
        writer.close();
    }
}
