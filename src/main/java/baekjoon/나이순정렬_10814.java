package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 나이순정렬_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int len = Integer.parseInt(br.readLine());
        String[][] strArr = new String[len][2];

        for (int i = 0; i < len; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            strArr[i][0] = st.nextToken(); // 나이
            strArr[i][1] = st.nextToken(); // 이름
        }

        Arrays.sort(strArr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (int i = 0; i < strArr.length; i++) {
            bw.write(strArr[i][0] + " " + strArr[i][1] + "\n");
        }

        br.close();
        bw.close();
    }
}
