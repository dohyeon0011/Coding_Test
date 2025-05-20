package programmers.level2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class 호텔대실 {
    private static String[][] book_time = new String[][] {
            {"15:00", "17:00"},
            {"16:40", "18:20"},
            {"14:20", "15:20"},
            {"14:10", "19:20"},
            {"18:20", "21:20"}
    };

    public static void main(String[] args) {
        int answer = 0;
        int[][] booking = new int[book_time.length][2];

        for (int i = 0; i < book_time.length; i++) {
            int start = Integer.parseInt(book_time[i][0].replace(":", ""));
            int end = Integer.parseInt(book_time[i][1].replace(":", ""));

            end += 10;
            if (end % 100 >= 60) {
                end += 40;
            }

            booking[i][0] = start;
            booking[i][1] = end;
        }
        Arrays.sort(booking, (b1, b2) -> {
            return b1[0] - b2[0];
        });

        // 1710 1930 2130
        // 1410 1930 +1
        // 1420 1530 +1
        // 1500 1710 +1
        // 1640 1830 -1 +1
        // 1820 2130 -1 +1
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < booking.length; i++) {
            if (!pq.isEmpty()) {
                if (pq.peek() <= booking[i][0]) {
                    pq.poll();
                }
            }
            pq.offer(booking[i][1]);
        }

        System.out.println(pq.size());
    }
}
