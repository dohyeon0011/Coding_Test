package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class 동전0 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] coins = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            coins[i] = Integer.parseInt(reader.readLine());
        }

        int count = 0;
        for (int i = 0; i < coins.length; i++) {
            int coin = coins[i];
            if (K / coin > 0) {
                count += (K / coin);
                K %= coin;
            }
        }
        writer.write(count + "");

        reader.close();
        writer.close();
    }
}
