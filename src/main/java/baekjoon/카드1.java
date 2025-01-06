package baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class 카드1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            int num = queue.poll();
            sb.append(num).append(" ");

            int top = queue.poll();
            queue.add(top);
        }
        sb.append(queue.poll());
        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}
