package programmers.level2;

import java.util.*;

class Solution {
    private static List<File> list = new ArrayList<>();

    public String[] solution(String[] files) {

        // 주어진 입력 형식 중 파일명은 영문자로 시작하며, 숫자를 하나 이상 포함하고 있다. 라는 구문을 활용하여 numflag를 통해 head,                 num, tail을 나눌 수 있었다.
        // 정렬은 File 클래스에서 Comparable을 통해 커스텀한 정렬을 사용했다. 우선순위는 아래와 같다.
        // 1. 비교할 때는 대소문자를 구분하지 않기 때문에 .toLowerCase()를 사용
        // 2. 숫자는 Integer.parseInt()를 활용하여 비교
        // 3. 그 외, turn(들어온 순서)으로 비교
        String[] answer = new String[files.length];
        int turn = 0;

        for (String file : files) {
            boolean numflag = false;
            StringBuilder num = new StringBuilder();
            StringBuilder head = new StringBuilder();
            StringBuilder tail = new StringBuilder();

            for (int i = 0; i < file.length(); i++) {
                char c = file.charAt(i);

                if (c >= '0' && c <= '9') {
                    num.append(c);
                    numflag = true;
                } else {
                    if (!numflag) head.append(c);
                    else {
                        tail.append(file.substring(i));
                        break;
                    }
                }
            }
            list.add(new File(turn++, head.toString(), num.toString(), tail.toString()));
        }

        Collections.sort(list);

        for (int i = 0; i < answer.length; i++) {
            File file = list.get(i);
            answer[i] = file.head + file.num + file.tail;
        }

        return answer;
    }

    private static class File implements Comparable<File> {
        int turn;
        String head;
        String num;
        String tail;

        public File(int turn, String head, String num, String tail) {
            this.turn = turn;
            this.head = head;
            this.num = num;
            this.tail = tail;
        }

        @Override
        public int compareTo(File f) {
            if (this.head.equalsIgnoreCase(f.head)) {
                if (Integer.parseInt(this.num) == Integer.parseInt(f.num)) {
                    return this.turn - f.turn;
                }
                return Integer.parseInt(this.num) - Integer.parseInt(f.num);
            }
            return this.head.toLowerCase().compareTo(f.head.toLowerCase());
        }
    }
}