package baekjoon;

import java.io.*;
import java.util.*;

public class 보물 {

    // 1 1 0 1 6
    // 2 7 8 3 1
    // 2 + 7 + 0 + 3 + 6 = 18

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        int[] nArr = new int[N];
        for (int i = 0; i < N; i++) {
           nArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nArr);

        Integer[] mArr = new Integer[N];
        st = new StringTokenizer(reader.readLine(), " ");
        for (int i = 0; i < N; i++) {
            mArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(mArr, Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (nArr[i] * mArr[i]);
        }
        writer.write(sum + "");

        reader.close();
        writer.close();
    }
}
