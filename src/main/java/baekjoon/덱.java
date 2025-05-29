package baekjoon;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class 덱 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            String[] split = reader.readLine().split(" ");
            String keyWord = split[0];

            run(keyWord, split, deque, sb);
        }
        writer.write(sb.toString());

        reader.close();
        writer.close();
    }

    private static void run(String keyWord, String[] split, Deque<Integer> deque, StringBuilder sb) {
        Integer num;
        switch (keyWord) {
            case "push_front":
                num = Integer.parseInt(split[1]);
                deque.offerFirst(num);
                break;
            case "push_back":
                num = Integer.parseInt(split[1]);
                deque.offerLast(num);
                break;
            case "pop_front":
                if (!deque.isEmpty()) {
                    Integer popNum = deque.pollFirst();
                    sb.append(popNum).append("\n");
                    break;
                }
                sb.append("-1").append("\n");
                break;
            case "pop_back":
                if (!deque.isEmpty()) {
                    Integer popNum = deque.pollLast();
                    sb.append(popNum).append("\n");
                    break;
                }
                sb.append("-1").append("\n");
                break;
            case "size":
                sb.append(deque.size()).append("\n");
                break;
            case "empty":
                if (!deque.isEmpty()) {
                    sb.append("0").append("\n");
                    break;
                }
                sb.append("1").append("\n");
                break;
            case "front":
                if (!deque.isEmpty()) {
                    Integer peekNum = deque.peekFirst();
                    sb.append(peekNum).append("\n");
                    break;
                }
                sb.append("-1").append("\n");
                break;
            case "back":
                if (!deque.isEmpty()) {
                    Integer peekNum = deque.peekLast();
                    sb.append(peekNum).append("\n");
                    break;
                }
                sb.append("-1").append("\n");
                break;
        }
    }
}
