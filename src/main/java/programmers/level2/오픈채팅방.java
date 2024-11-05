package programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class 오픈채팅방 {

    class Solution {
        public String[] solution(String[] record) {
            Map<String, String> idNickMap = new HashMap<>();
            int cnt = 0; // change일 때

            // 먼저 최종적으로 닉네임이 어떻게 바꼈는 지 맵에 저장하기
            for (int i = 0; i < record.length; i++) {
                String[] info = record[i].split(" ");

                if (info[0].equals("Leave")) {
                    continue;
                } else if (info[0].equals("Enter")) {
                    idNickMap.put(info[1], info[2]);
                } else {
                    idNickMap.put(info[1], info[2]);
                    cnt++;
                }
            }

            String[] answer = new String[record.length - cnt];
            int idx = 0;

            for (int i = 0; i < record.length; i++) {
                String[] info = record[i].split(" ");
                String nickname = idNickMap.get(info[1]);

                if (info[0].equals("Enter")) {
                    answer[idx++] = nickname + "님이 들어왔습니다.";
                } else if (info[0].equals("Leave")) {
                    answer[idx++] = nickname + "님이 나갔습니다.";
                }
            }

            return answer;
        }
    }

}
