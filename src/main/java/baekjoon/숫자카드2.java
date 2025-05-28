package baekjoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 숫자카드2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        Map<String, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        for (int i = 0; i <N; i++) {
            String numKey = st.nextToken();
            map.put(numKey, map.getOrDefault(numKey, 0) + 1);
        }

        int M = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(reader.readLine(), " ");
        for (int i = 0; i < M; i++) {
            String numKey = st.nextToken();
            Integer count = 0;
            if (map.containsKey(numKey)) {
                count = map.get(numKey);
            }
            sb.append(count + " ");
        }
        writer.write(sb.toString());

        reader.close();
        writer.close();
    }
}
