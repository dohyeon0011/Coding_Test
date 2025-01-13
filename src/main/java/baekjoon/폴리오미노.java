package baekjoon;

import java.io.*;

public class 폴리오미노 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        str = str.replace("XXXX", "AAAA").replace("XX", "BB");

        if (str.contains("X")) {
            str = "-1";
        }

        bw.write(str);

        br.close();
        bw.close();
    }
}
