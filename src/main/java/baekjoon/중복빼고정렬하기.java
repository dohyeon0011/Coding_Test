package baekjoon;

import java.io.*;
import java.util.*;

public class 중복빼고정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int len = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Set<Integer> intSet = new HashSet<>();

        for (int i = 0; i < len; i++) {
            intSet.add(Integer.parseInt(st.nextToken()));
        }

//        intSet.stream().sorted().forEach(System.out::println);

        List<Integer> intList = new ArrayList<>(intSet);
        Collections.sort(intList);

        for (Integer i : intList) {
            bw.write(String.valueOf(i) + " ");
        }

        br.close();
        bw.close();
    }
}
