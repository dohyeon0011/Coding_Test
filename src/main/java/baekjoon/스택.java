package baekjoon;

import java.io.*;
import java.util.Stack;

public class 스택 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            String[] str = getStrings(reader);
            String keyword = str[0];
            if (keyword.equals("push")) {
                stack.push(Integer.parseInt(str[1]));
            } else if (keyword.equals("pop")) {
                if (stack.isEmpty()) {
                    writer.write("-1\n");
                    continue;
                }
                Integer pop = stack.pop();
                writer.write(pop + "\n");
            } else if (keyword.equals("size")) {
                writer.write(stack.size() + "\n");
            } else if (keyword.equals("empty")) {
                if (stack.isEmpty()) {
                    writer.write("1\n");
                    continue;
                }
                writer.write("0\n");
            } else if (keyword.equals("top")) {
                if (!stack.isEmpty()) {
                    writer.write(stack.peek() + "\n");
                    continue;
                }
                writer.write("-1\n");
            }
        }
        reader.close();
        writer.close();
    }

    private static String[] getStrings(BufferedReader reader) throws IOException {
        String read = reader.readLine();
        String[] str = read.split(" ");

        return str;
    }
}
