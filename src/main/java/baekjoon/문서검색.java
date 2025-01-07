package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class 문서검색 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        String s = br.readLine();
        int cnt = 0;

        while (word.contains(s)) {
            word = word.replaceFirst(s, " "); // ""으로 하면 aabb인 경우 1회 사이클 돈 후 ab가 돼서 또 지워짐.
            cnt++;
        }

        bw.write(String.valueOf(cnt));

        br.close();
        bw.close();
    }
}
