package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 접미사배열 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = reader.readLine();
        List<String> suffixWords = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            String subWord = word.substring(i);
            suffixWords.add(subWord);
        }
        Collections.sort(suffixWords);

        for (String suffix : suffixWords) {
            writer.write(suffix + "\n");
        }
        reader.close();
        writer.close();
    }
}
