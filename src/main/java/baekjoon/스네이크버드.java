package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 스네이크버드 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());   // 과일 개수
        int L = Integer.parseInt(st.nextToken());   // 스네이크버드 초기 길이

        int[] intArr = new int[N];
        st = new StringTokenizer(reader.readLine(), " ");
        for (int i = 0; i < N; i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(intArr);

        for (int i : intArr) {
            if (L >= i) {
                L++;
            }
        }
        writer.write(L + "");

        reader.close();
        writer.close();
    }
}
