package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 문자열집합 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<String> setList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String alpha = reader.readLine();
            setList.add(alpha);
        }

        List<String> checkList = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String alpha = reader.readLine();
            if (setList.contains(alpha)) {
                checkList.add(alpha);
            }
        }
        writer.write(checkList.size() + "");

        reader.close();
        writer.close();
    }
}
