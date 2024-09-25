public class 피로도 {
    public static int[][] dungeons = {{80,20}, {50,40}, {30,10}};
    public static int answer = 0;
    public static boolean[] visited; // 해당 던전을 방문했는 지

    public static void main(String[] args) {
        visited = new boolean[dungeons.length];
        backTracking(0, 80, dungeons);
        System.out.println("answer = " + answer);
    }

    // 모든 경우의 수(조합)를 확인해주는 로직
    public static void backTracking(int depth, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && dungeons[i][0] <= k) { // 방문하지 않았던 던전이고, 현재 피로도가 최소 필요 피로도보다 높을 때
                visited[i] = true; // 이 로직을 타면 해당 던전은 방문한 것으로 하여 true
                // 다시 이 로직을 타면서 현재 방문 카운트 +1, 현재 피로도는 해당 던전의 피로도 소모량 만큼 차감
                backTracking(depth + 1, k - dungeons[i][1], dungeons);
                // A먼저 돌았다면 이제 B부터 돌아야 하기 때문에 false로 바꿔줌. 왜냐면 그대로 냅두면 다시 또 새로운 경우의 수로 확인X
                visited[i] = false;
            }
        }
        answer = Math.max(depth, answer);
    }
}
