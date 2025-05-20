package baekjoon;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class 국회의원선거 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine()) - 1;
        int dasom = Integer.parseInt(reader.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            pq.offer(Integer.parseInt(reader.readLine()));
        }

        int count = 0;
        while (!pq.isEmpty() && dasom <= pq.peek()) {   // queue에 있는 가장 큰 수랑만 티키타카 하면 됨.
            dasom++;
            count++;
            pq.offer(pq.poll() - 1);
        }
        writer.write(count + "");

        reader.close();
        writer.close();
    }
}
