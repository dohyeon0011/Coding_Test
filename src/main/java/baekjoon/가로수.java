package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class 가로수 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        List<Integer> trees = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            trees.add(Integer.parseInt(reader.readLine()));
        }

        int distance = 0;
        for (int i = 1; i < N; i++) {
            int n = trees.get(i) - trees.get(i - 1);
            distance = gcd(n, distance);
        }
        writer.write(((trees.get(N - 1) - trees.get(0)) / distance) - N + 1 + "");

        reader.close();
        writer.close();
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
}
