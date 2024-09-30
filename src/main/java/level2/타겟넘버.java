package level2;

public class 타겟넘버 {

    class Solution {
        static int answer = 0;

        public int solution(int[] numbers, int target) {
            dfs(0, numbers, target, 0);

            return answer;
        }

        // 깊이 우선 탐색(DFS)
        // 노드 위치, numbers, target, 합
        private void dfs(int depth, int[] numbers, int target, int sum) {
            if (depth == numbers.length) { // 마지막 노드까지 탐색
                if (target == sum) {
                    answer++;
                }
                return;
            }
            dfs(depth + 1, numbers, target, sum + numbers[depth]); // 해당 노드 값 더하고 다음 깊이 탐색
            dfs(depth + 1, numbers, target, sum - numbers[depth]); // 해당 노드 값 빼고 다음 깊이 탐색
        }
    }

}
