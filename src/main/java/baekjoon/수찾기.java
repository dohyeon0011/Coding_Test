package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수찾기 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        int[] nArr = new int[N];
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        for (int i = 0; i < N; i++) {
            nArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nArr);

        int M = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(reader.readLine(), " ");
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());

            int res = Arrays.binarySearch(nArr, num);   // sort된 배열만 동작하는 알고리즘

            // 해당 key를 찾으면 그 위치를 리턴하고, 못 찾으면 -1 리턴
            if (res < 0) {
                sb.append(0 + "\n");
                continue;
            }
            sb.append(1 + "\n");
        }
        writer.write(sb.toString());

        reader.close();
        writer.close();
    }
}
