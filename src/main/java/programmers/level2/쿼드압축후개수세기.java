package programmers.level2;

public class 쿼드압축후개수세기 {

    class Solution {
        static int[] answer = new int[2];

        public int[] solution(int[][] arr) {
            recursion(0, 0, arr, arr.length);

            return answer;
        }

        // 압축 가능한 지 확인 후, 영역 압축
        public static void recursion(int x, int y, int[][] arr, int size) {
            // 압축 가능한 지 확인
            if (partition(x, y, arr, size)) {
                // 0이면 0번 인덱스 자리, 1이면 1번 인덱스 자리 카운트 +1 증가
                // 나중에 다 끝까지 분할되면 무조건 여기로 넘어와서 0, 1의 총 개수를 카운트하게 됨.
                answer[arr[x][y]]++;
                return; // 압축된 곳은 더 이상 분할되면 안되기 때문에
            }

            // 압축이 안된다면 분할하기 (재귀)
            // 제1사분면
            recursion(x + size / 2, y, arr, size / 2);

            // 제2사분면
            recursion(x, y, arr, size / 2);

            // 제3사분면
            recursion(x, y + size / 2, arr, size / 2);

            // 제4사분면
            recursion(x + size / 2, y + size / 2 , arr, size / 2);
        }

        // 압축 가능한 지 확인
        public static boolean partition(int x, int y, int[][] arr, int size) {
            for (int i = x; i < x + size; i++) {
                for (int j = y; j < y + size; j++) {
                    if (arr[i][j] != arr[x][y]) {
                        return false;
                    }
                }
            }

            return true;
        }
    }

}
