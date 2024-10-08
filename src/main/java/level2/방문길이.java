package level2;

import java.util.*;

public class 방문길이 {
    static String dirs = "ULURRDLLU";

    public static void main(String[] args) {

        import java.util.*;

        class Solution {
            static int[] dX = {0, 1, 0, -1};
            static int[] dY = {-1, 0, 1, 0};

            public int solution(String dirs) {
                int answer = 0;
                Map<Character, int[]> map = new HashMap<>();
                Set<String> set = new HashSet<>();
                int x = 0, y = 0;

                map.put('U', new int[] {0, 1});
                map.put('D', new int[] {0, -1});
                map.put('R', new int[] {1, 0});
                map.put('L', new int[] {-1, 0});

                for (char ch : dirs.toCharArray()) {
                    int nX = map.get(ch)[0]; // 움직여질 x좌표
                    int nY = map.get(ch)[1]; // 움직여질 y좌표

                    x += nX;
                    y += nY;

                    if(x < -5 || x > 5) {
                        x -= nX;
                        continue;
                    }
                    if(y < -5 || y > 5) {
                        y -= nY;
                        continue;
                    }
                    // 왕복하는 거리를 하나로 쳐야됨.
                    set.add("" + (x - nX) + "" + (y - nY) + "" + x + "" + y); // 원래 자리 -> 움직인 자리
                    set.add("" + x + "" + y + "" + (x - nX) + "" + (y - nY)); // 움직인 자리 -> 원래 자리
                }
                answer = set.size() / 2;

//         int answer = 0;
//         boolean[][][] visited = new boolean[11][11][4];
//         int x = 5, y = 5, d = 0; // 현재 x, y좌표 위치(0 ~ 5 -> -5 ~ 0, 6 ~ 11, 0 ~ 5)

//         for (char c : dirs.toCharArray()) {
//             if (c == 'U') d = 0;
//             else if (c == 'R') d = 1;
//             else if (c == 'D') d = 2;
//             else d = 3;

//             int nX = x + dX[d];
//             int nY = y + dY[d];

//             if (nX < 0 || nX >= 11 || nY < 0 || nY >= 11) {
//                 continue;
//             }

//             if (!visited[nX][nY][d]) {
//                 visited[nX][nY][d] = true;
//                 d = d % 2 == 0 ? 2 - d : 4 - d;
//                 visited[x][y][d] = true;
//                 answer++;
//             }
//             x = nX;
//             y = nY;
//         }

                return answer;
            }
        }


    }
}
