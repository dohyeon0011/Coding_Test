package baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class 큐 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int lastNum = 0;

        for (int i = 0; i < N; i++) {
            String read = reader.readLine();
            String[] word = read.split(" ");
            String keyword = word[0];

            switch (keyword) {
                case "push":
                    int num = Integer.parseInt(word[1]);
                    queue.offer(num);
                    lastNum = num;
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        writer.write("-1\n");
                        break;
                    }
                    writer.write(queue.poll() + "\n");
                    break;
                case "size":
                    writer.write(queue.size() + "\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        writer.write("1\n");
                        break;
                    }
                    writer.write("0\n");
                    break;
                case "front":
                    if (!queue.isEmpty()) {
                        writer.write(queue.peek() + "\n");
                        break;
                    }
                    writer.write("-1\n");
                    break;
                case "back":
                    if (!queue.isEmpty()) {
                        writer.write(lastNum +"\n");
                        break;
                    }
                    writer.write("-1\n");
                    break;
            }
        }
        reader.close();
        writer.close();
    }
}
