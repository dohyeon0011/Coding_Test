package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class K번째수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int len = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // 1 2 3 4 5
        st = new StringTokenizer(br.readLine());
        int[] intArr = new int[len];

        for (int i = 0; i < len; i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(intArr);

        bw.write(String.valueOf(intArr[k - 1]));

        br.close();
        bw.close();
    }
}
