package programmers.level2;

import java.util.Arrays;

public class 구명보트 {

    class Solution {
        public int solution(int[] people, int limit) {
            int answer = 0;
            int idx = 0;
            Arrays.sort(people); // 50 50 70 80
            // 몸무게가 제일 적은 사람과 큰 사람을 태워야 함. (차피 2명 밖에 못 태워서)
            // 테스트 케이스에는 없는데 [65, 62, 36, 30], limit : 100 이런 식이면
            // 작은 사람끼리 태워서는 3개가 필요하지만, 작은 사람 + 큰 사람 조합이면 2개면 됨.
            for (int i = people.length - 1; i >= idx; i--) {
                int weight = people[idx] + people[i];

                if (weight <= limit) {
                    idx++;
                    answer++;
                } else if (weight > limit) {
                    answer++;
                }
            }

            return answer;
        }
    }

}
