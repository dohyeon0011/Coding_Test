package baekjoon;

import java.io.*;

public class 누울자리를찾아라 {

    private static int rowCount = 0;
    private static int colCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        char[][] chArr = new char[N][N];

        for (int i = 0; i < chArr.length; i++) {
            String[] strArr = reader.readLine().split("");
            for (int j = 0; j < chArr[i].length; j++) {
                chArr[i][j] = strArr[j].charAt(0);
            }
        }

        // 각 열과 행에서 중간에 벽이 있는 경우, 누울 수 있는 곳이 여러 개인 점을 알아야 함.
        // 가로 연속 2칸 확인
        for (int i = 0; i < chArr.length; i++) {
            int count = 0;

            for (int j = 0; j < chArr[i].length; j++) {
                if (chArr[i][j] == '.') {
                    count++;
                } else {
                    if (count >= 2) {
                        rowCount++;
                    }
                    count = 0;
                }
            }
            if (count >= 2) {   // 처음부터 끝까지 빈칸인 경우
                rowCount++;
            }
        }

        // 세로 연속 2칸 확인
        for (int i = 0; i < chArr.length; i++) {
            int count = 0;

            for (int j = 0; j < chArr[i].length; j++) {
                if (chArr[j][i] == '.') {
                    count++;
                } else {
                    if (count >= 2) {
                        colCount++;
                    }
                    count = 0;
                }
            }
            if (count >= 2) {   // 처음부터 끝까지 빈칸인 경우
                colCount++;
            }
        }
        writer.write(rowCount + " " + colCount);

        reader.close();
        writer.close();
    }
}
