package level2;

import java.util.LinkedList;
import java.util.Queue;

public class 게임맵최단거리 {

    class Solution {
        // 상하좌우 좌표 움직임
        int[] dx = {0, 1, -1, 0};
        int[] dy = {1, 0, 0, -1};

        public int solution(int[][] maps) {
            int answer = 0;

            int[][] visited = new int[maps.length][maps[0].length]; // 방문한 곳을 표시하기 위한 배열

            bfs(maps, visited);
            answer = visited[maps.length - 1][maps[0].length - 1]; // 상대 팀 진영

            if (answer == 0) {
                return -1;
            }

            return answer;
        }

        public void bfs(int[][] maps, int[][] visited) {
            Queue<int[]> q = new LinkedList<>();
            q.offer(new int[]{0, 0});
            visited[0][0] = 1;

            // 더 나아갈 곳이 없을 때까지 (마지막 도착지가 되면 offer를 하지 않아 큐가 Empty 상태가 됨)
            while (!q.isEmpty()) {
                int[] current = q.poll(); // 정점 하나 꺼내기
                int x = current[0]; // 방금 이전에 방문한 x 좌표
                int y = current[1]; // 방금 이전에 방문한 y 좌표

                for (int i = 0; i < 4; i++) {
                    int nX = x + dx[i]; // 앞으로 움직일 x좌표
                    int nY = y + dy[i]; // 앞으로 움직일 y좌표

                    // 좌표가 maps에서 벗어날 경우 다음으로 넘어가기
                    if (nX < 0 || nX > maps.length - 1 ||
                            nY < 0 || nY > maps[0].length - 1) {
                        continue;
                    }

                    // 아직 방문하지 않았고, 벽이 아닐 경우
                    if (visited[nX][nY] == 0 && maps[nX][nY] == 1) {
                        visited[nX][nY] = visited[x][y] + 1; // 방문한 곳에는 +1씩 카운트 계속 올려서 저장
                        q.offer(new int[]{nX, nY}); // 성공적으로 방문했으면 새로 큐에 배열 넣어주기
                    }
                }
            }

        }
    }

}
