package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM {

    public static void main(String[] args) throws IOException {
        // 1 2 3 3 4
        // 1 3 6 9 13
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        int[] intArr = new int[N];
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        for (int i = 0; i < N; i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(intArr);

        int sum = intArr[0];
        for (int i = 1; i < intArr.length; i++) {
            intArr[i] += intArr[i - 1];
            sum += intArr[i];
        }
        writer.write(sum + "");

        reader.close();
        writer.close();
    }
}
