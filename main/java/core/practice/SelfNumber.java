package core.practice;

public class SelfNumber {

    public static void main(String[] args) {

        boolean[] checkNum = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int n = findSelfNumber(i);

            if(n < 10001) {
                checkNum[n] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < 10001; i++) {
            if(!checkNum[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }

    static int findSelfNumber(int num) {
        int sum = num;

        while (num != 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }

        return sum;
    }
}
