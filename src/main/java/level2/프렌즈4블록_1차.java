package level2;

public class 프렌즈4블록_1차 {

    static String[] board = new String [] {"CCBDE", "AAADE", "AAABF", "CCBBF"};
    static int m = 4;
    static int n = 5;

    public static void main(String[] args) {
        // CCBDE
        // AAADE
        // AAABF
        // CCBBF

        // TTTANT
        // RRFACC
        // RRRFCC
        // TRRRAA
        // TTMMMF
        // TMMTTJ
        int answer = 0;
        char[][] block = new char[m][n];

        for (int i = 0; i < m; i++) {
            block[i] = board[i].toCharArray();
        }

        // 블록이 테트리스마냥 계속 삭제될 수도 있으니 무한루프 돌리고 회차마다 flag라는 변수로 삭제될 게 없다면 중단하게 설정
        while (true) {
            boolean flag = false; // 블록 삭제 여부
            boolean[][] check = new boolean[m][n]; // 삭제된 블록 인덱스 확인용

            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (block[i][j] == '-') {
                        continue;
                    }
                    char word = block[i][j]; // 현재 위치에 해당하는 문자

                    // 2x2로 문자가 모두 일치한다면
                    if (block[i][j + 1] == word && block[i + 1][j] == word && block[i + 1][j + 1] == word) {
                        check[i][j] = true;
                        check[i][j + 1] = true;
                        check[i + 1][j] = true;
                        check[i + 1][j + 1] = true;
                        flag = true; // 블록이 삭제된 적이 있게 됨.
                    }
                }
            }

            if (!flag) { // 블록이 삭제된 적이 없다면 중단
                break;
            }

            // 삭제되어야 할 블록 '-'로 치환 후 삭제되는 블록 갯수 카운트 +1 증가
            for(int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (check[i][j]) {
                        block[i][j] = '-';
                        answer++;
                    }
                }
            }

            // 삭제되고 남은 빈공간 블록 내리기 (윗블록과 스왑하기)
            for (int i = m - 1; i >= 0 ; i--) {
                for (int j = 0; j < n; j++) {
                    if (block[i][j] == '-') {
                        for (int k = i; k >= 0; k--) { // 윗 블록이 제거('-')되어 있을 수도 있으니 반복문으로
                            if (block[k][j] == '-') {
                                continue;
                            }
                            block[i][j] = block[k][j];
                            block[k][j] = '-';
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("answer = " + answer);

    }

}
