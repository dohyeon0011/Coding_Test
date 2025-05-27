package baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class 카드2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while (queue.size() != 1) {
            queue.poll();
            Integer num = queue.poll();
            queue.offer(num);
        }
        writer.write(queue.peek() + "");

        reader.close();
        writer.close();
    }
}
