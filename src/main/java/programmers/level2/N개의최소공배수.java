package programmers.level2;

public class N개의최소공배수 {

    class Solution {
        public int solution(int[] arr) {
            // 내가 푼 방식
//         int answer = 0;
//         int num = 1;

//         while (true) {
//             boolean bl = true;
//             num++;

//             for (int i = 0; i < arr.length; i++) {
//                 if (!(num % arr[i] == 0)) {
//                     bl = false;
//                 }
//             }
//             if (bl) {
//                 answer = num;
//                 break;
//             }
//         }

            int answer = 0;

            if (arr.length < 2) {
                int g = gcd(arr[0], arr[1]);
                answer = (arr[0] * arr[1]) / g;

                return answer;
            } else if (arr.length > 2) { // 두 수와의 최소 공배수를 먼저 구하고
                int g = gcd(arr[0], arr[1]);
                answer = (arr[0] * arr[1]) / g;

                // 나머지 수들끼리 최소 공배수를 구하면 됨.
                for (int i = 2; i < arr.length; i++) {
                    g = gcd(answer, arr[i]);
                    answer = (answer * arr[i]) / g;
                }
            }

            return answer;
        }

        public int gcd(int max, int min) {
            if (min == 0) {
                return max;
            }
            return gcd(min, max % min);
        }

    }

}
