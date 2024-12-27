package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 배열합치기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] nArr = new int[N];
        int[] mArr = new int[M];
        List<Integer> intList = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nArr[i] = Integer.parseInt(st.nextToken());
            intList.add(nArr[i]);
        }

        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < M; j++) {
            mArr[j] = Integer.parseInt(st.nextToken());
            intList.add(mArr[j]);
        }

        Collections.sort(intList);

        for (Integer i : intList) {
            bw.write(String.valueOf(i) + " ");
        }

        br.close();
        bw.close();

        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Integer> intList = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            intList.add(Integer.valueOf(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < M; j++) {
            intList.add(Integer.valueOf(st.nextToken()));
        }

        Collections.sort(intList);

        for (Integer i : intList) {
            bw.write(String.valueOf(i) + " ");
        }

        br.close();
        bw.close();*/
    }
}
