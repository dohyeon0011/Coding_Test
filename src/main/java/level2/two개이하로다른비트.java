package level2;

public class two개이하로다른비트 {

    public long[] solution(long[] numbers) {
        // 규칙성을 찾아야함.
        // # 첫번째 방법
        // -> 짝수인 경우 끝 비트에 +1만 하면 조건이 충족되고 홀수인 경우
        // 1로만 이루어져 있다면 맨 앞을 10으로 바꾸고, 1과 0으로 이루어져 있다면 맨 뒤에서 첫번째로 나오는 0의 자리에
        // 1로 바꿔주고 그 뒤에 나오는 1을 0으로 바꿔주는 규칙성을 찾으면 됨.

        // # 두번째 방법
        // 주어진 수 xor 주어진 수 +1 하고난 뒤 오른쪽 쉬프트 연산으로 비트 2칸을 밀어주고
        // 여기서 나온 숫자 + 주어진 수 +1을 해주면 됨.
        // 0111
        // 1000
        // xor = 1111
        // >> 2 -> 0011
        // 0011 + 1000 = 1011

        // # 첫번째 방법
        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            long num = numbers[i];

            if (num % 2 == 0) {
                answer[i] = num + 1;
                continue;
            } else {
                String str = Long.toBinaryString(num);

                if (str.contains("0")) {
                    int idx = str.lastIndexOf("0"); // 2
                    str = str.substring(0, idx) + "10" + str.substring(idx + 2);
                    // 1001 -> 1010
                } else {
                    str = "10" + str.substring(1); // 111 -> 1011
                    // 1111 -> 10111 (15 -> 31)
                }
                answer[i] = Long.parseLong(str, 2);
            }
        }

        // # 두번째 방법
        // long[] answer = numbers.clone();
        // for (int i = 0; i < numbers.length; i++) {
        //     answer[i]++; // x보다 큰수로 만든다.
        //     answer[i] += (answer[i] ^ numbers[i]) >> 2;
        // }

        return answer;
    }

}
