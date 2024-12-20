package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 좌표정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int len = Integer.parseInt(br.readLine());
        int[][] arr = new int[len][2];

        for (int i = 0; i < len; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (num1, num2) -> {
            return num1[0] == num2[0] ? num1[1] - num2[1] : num1[0] - num2[0];
        });

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i][0] + " " + arr[i][1] + "\n");
        }

        br.close();
        bw.close();
    }
}
