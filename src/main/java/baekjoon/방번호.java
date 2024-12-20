package baekjoon;

import java.io.*;
import java.util.Arrays;

public class 방번호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        int[] cnt = new int[10];

        for (int i = 0; i < n.length(); i++) {
            int num = n.charAt(i) - '0';

            if (num == 9) { // 6을 9로 치환 -> 6과 9는 서로 바꿀 수 있으니 한 곳에 몰아넣기.(같은 수 취급)
                num = 6;
            }
            cnt[num]++;
        }
        cnt[6] = (cnt[6] / 2) + (cnt[6] % 2);
        Arrays.sort(cnt); // 오름차순 하면 가장 많이 필요한 숫자의 개수가 맨 뒷 인덱스로 정렬됨.

        bw.write(String.valueOf(cnt[cnt.length - 1])); // 가장 많이 필요한 숫자의 개수가 필요한 세트가 됨.

        br.close();
        bw.close();
    }
}
