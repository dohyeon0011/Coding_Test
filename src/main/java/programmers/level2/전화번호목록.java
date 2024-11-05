package programmers.level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 전화번호목록 {

    static String[] phone_book = {"119", "97674223", "1195524421"};

    public static void main(String[] args) {
        boolean answer = true;
        Arrays.sort(phone_book); // 문자열 사전순으로 정렬

        // phone_book[i + 1], phone_book[i + 2]의 접두사일 순 있어도
        // phone_book[i + 1]의 접두사는 아니지만 phone_book[i + 2]의 접두사일 수 없어서 인접한 인덱스만 확인해주면 됨.
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }

        System.out.println("answer = " + answer);
    }

}
