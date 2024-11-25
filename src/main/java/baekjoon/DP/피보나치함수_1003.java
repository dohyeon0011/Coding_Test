package baekjoon.DP;

import java.io.*;
import java.util.StringTokenizer;

public class 피보나치함수_1003 {
    static int[] cnt0Arr;
    static int[] cnt1Arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int len = Integer.parseInt(st.nextToken());

        for (int i = 0; i < len; i++) {
            int num = Integer.parseInt(br.readLine());
            getFibo(num);

            System.out.println(cnt0Arr[num] + " " + cnt1Arr[num]);
        }
    }

    private static void getFibo(int num) {
        cnt0Arr = new int[41];
        cnt1Arr = new int[41];
        cnt0Arr[0] = 1;
        cnt1Arr[0] = 0;
        cnt0Arr[1] = 0;
        cnt1Arr[1] = 1;

        for (int j = 2; j <= num; j++) {
            cnt0Arr[j] = cnt0Arr[j - 1] + cnt0Arr[j - 2];
            cnt1Arr[j] = cnt1Arr[j - 1] + cnt1Arr[j - 2];
        }
    }

}
