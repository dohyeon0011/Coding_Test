package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class 뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();

//        int answer = 0;
//        int idx = 1;
//        char ch = S.charAt(0);
//
//        while (idx < S.length()) { // 첫번째 문자를 기준으로 비교
//            if (ch == S.charAt(idx)) {
//                idx++;
//                continue;
//            }
//            answer++; // 첫번째 문자와 달라질 때 횟수 + 1
//
//            for (int i = idx; i < S.length(); i++) { // 첫번째 문자와 다른 순간부터
//                if (ch == S.charAt(i)) { // 첫번째 문자와 같아지면
//                    break;
//                }
//                idx++;
//            }
//        }
//        bw.write(String.valueOf(answer));
//
//        br.close();
//        bw.close();

        StringTokenizer st0 = new StringTokenizer(S, "0");
        StringTokenizer st1 = new StringTokenizer(S, "1");
        int answer = Math.min(st0.countTokens(), st1.countTokens());

        bw.write(String.valueOf(answer));

        br.close();
        bw.close();
    }
}
