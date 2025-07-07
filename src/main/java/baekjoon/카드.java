package baekjoon;

import java.io.*;
import java.util.*;

public class 카드 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        Map<Long, Integer> numMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            Long num = Long.parseLong(reader.readLine());
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }
        List<Long> keys = new ArrayList<>(numMap.keySet());
        keys.sort((k1, k2) ->
        {
            int numCompare = numMap.get(k2).compareTo(numMap.get(k1));
            if (numCompare == 0) {
                return k1.compareTo(k2);
            }
            return numCompare;
        });
        writer.write(keys.get(0) + "");

        reader.close();
        writer.close();
    }
}
