package baekjoon;

import java.io.*;
import java.util.*;

public class 베스트셀러 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        Map<String, Integer> bookSellMap = new HashMap<>();
        int maxSellCnt = 0;
        for (int i = 0; i < N; i++) {
            String book = reader.readLine();
            bookSellMap.put(book, bookSellMap.getOrDefault(book, 0) + 1);
            maxSellCnt = Math.max(maxSellCnt, bookSellMap.get(book));
        }

        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : bookSellMap.entrySet()) {
            if (entry.getValue() == maxSellCnt) {
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        writer.write(list.get(0));

        reader.close();
        writer.close();
    }
}
