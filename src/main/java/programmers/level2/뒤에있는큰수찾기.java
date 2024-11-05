package programmers.level2;

import java.util.Arrays;
import java.util.Stack;

public class 뒤에있는큰수찾기 {

    static int[] numbers = new int[] {9, 1, 5, 3, 6, 2};

    public static void main(String[] args) {

        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>(); // answer의 인덱스를 담기 위함
        // Arrays.fill(answer, -1);

        // 스택에 들어있는 인덱스들은 아직 자기보다 큰 수를 못 찾아서 담겨져 있는 상태임.
        // 현재 numbers[i]의 값이 numbers[stack.peek()] 보다 값이 크면
        // answer[stack.pop()]의 값을 현재 numbers[i]로 채우기
        for (int i = 0; i < numbers.length; i++) {
            while (!stack.isEmpty() && numbers[i] > numbers[stack.peek()]) {
                answer[stack.pop()] = numbers[i];
            }
            stack.push(i); // 자기보다 큰 수를 못 찾아서 인덱스 담기
        }

        // 채워지지 않는 인덱스들은 자기보다 높은 수를 못 찾았으니 인덱스를 찾아서 -1로 채우기.
        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

    }
}
