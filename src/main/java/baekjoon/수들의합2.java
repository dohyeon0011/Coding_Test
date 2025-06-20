package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class 수들의합2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] intArr = new int[N + 1];

        st = new StringTokenizer(reader.readLine(), " ");
        for (int i = 0; i < N; i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        int front = 0;
        int end = 0;
        int sum = intArr[0];
        while (true) {
            if (end >= N) {
                break;
            }
            if (sum > M) {
                sum -= intArr[front++];
            } else if (sum == M) {
                cnt++;
                sum += intArr[++end];
            } else {
                sum += intArr[++end];
            }
        }
        writer.write(cnt + "");

        reader.close();
        writer.close();
    }
}
