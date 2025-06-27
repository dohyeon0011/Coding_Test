package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주몽 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        int[] intArr = new int[N];
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        for (int i = 0; i < N; i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(intArr);

        // 1 2 3 4 5 7
        int start = 0, end = N - 1, cnt = 0;
        while (start < end) {
            if (intArr[start] + intArr[end] == M) {
                cnt++;
                start++;
                end--;
            } else if (intArr[start] + intArr[end] < M) {
                start++;
            } else {
                end--;
            }
        }
        writer.write(cnt + "");

        reader.close();
        writer.close();
    }
}
