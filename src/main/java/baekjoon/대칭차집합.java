package baekjoon;

import java.io.*;
import java.util.*;

public class 대칭차집합 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        Set<Integer> setA = new HashSet<>();
        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < A; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> setB = new HashSet<>();
        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < B; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        int count = 0;
        for (Integer num : setA) {
            if (!setB.contains(num)) {
                count++;
            }
        }

        for (Integer num : setB) {
            if (!setA.contains(num)) {
                count++;
            }
        }
        writer.write(count + "");

        reader.close();
        writer.close();
    }
}
