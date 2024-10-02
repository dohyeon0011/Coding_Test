package level2;

public class k진수에서소수개수구하기 {
    static int n = 437674;
    static int k = 3;

    public static void main(String[] args) {
        int answer = 0;
        String s = Integer.toString(n, k);
        System.out.println("s = " + s);

        String[] strArr = s.split("0"); // 차피 0으로 나눠버리면 알아서 0p0, p0, 0p 조건 성립됨.

        for (String string : strArr) {
            System.out.println("string = " + string);
        }

        for (String str : strArr) {
            if (str.equals("")) { // 110011 이런 경우 split("0") 했을 때, 공백이 생겨서 확인해줘야함.
                continue;
            }
            Long Lnum = Long.parseLong(str); // 조건이 정수 100만까지라 int 자료형 범위 넘어설 수도 있어서

            if (Lnum >= 2) {
                boolean bl = true;
                int num = (int) Math.sqrt(Lnum);

                for (int i = 2; i <= num; i++) { // Lnum이 제곱근으로 나눠지면 소수가 아님.
                    if (Lnum % i == 0) {
                        bl = false;
                        break;
                    }
                }
                if (bl) {
                    answer++;
                }
            }

        }

        System.out.println("answer = " + answer);
    }
}
