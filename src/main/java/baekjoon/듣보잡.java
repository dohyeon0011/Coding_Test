package baekjoon;

import java.io.*;
import java.util.*;

public class 듣보잡 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N + M; i++) {
            String read = reader.readLine();
            map.put(read, map.getOrDefault(read, 0) + 1);
        }

        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (String keyWord : map.keySet()) {
            if (map.get(keyWord) == 2) {
                list.add(keyWord);
            }
        }
        Collections.sort(list);

        sb.append(list.size()).append("\n");
        for (String name : list) {
            sb.append(name).append("\n");
        }

        writer.write(sb.toString());

        reader.close();
        writer.close();
    }
}
