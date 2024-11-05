package programmers.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 택배상자 {

    static int[] order = new int[]{4, 3, 1, 2, 5};

    public static void main(String[] args) {
        int answer = 0;

        Stack<Integer> st = new Stack<>();
        int size = order.length;
        int idx = 0;

        for (int i = 1; i <= size; i++) {
            if (order[idx] != i) {
                st.push(i);
            } else {
                idx++;
                answer++;
            }

            while (!st.isEmpty() && st.peek() == order[idx]) {
                st.pop();
                idx++;
                answer++;
            }
        }

    }
}
