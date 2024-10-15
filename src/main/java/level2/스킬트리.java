package level2;

public class 스킬트리 {

    static String skill = "CBD";
    static String[] skill_trees = new String[]{"BACDE", "CBADF", "AECB", "BDA"};

    public static void main(String[] args) {

        int answer = 0;

        for (String skill_tree : skill_trees) {
            boolean bl = true;
            int cnt = 0;

            for (char ch : skill_tree.toCharArray()) {
                if (skill.contains(ch + "")) {
                    if (skill.charAt(cnt) == ch) {
                        cnt++;
                    } else {
                        bl = false;
                        break;
                    }
                }
            }
            if (bl) {
                answer++;
            }
        }

        System.out.println("answer = " + answer);


    }
}
