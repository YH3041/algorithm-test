package core.practice;

import java.util.Scanner;

public class TowerOfHanoi {

    static int ans = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        hanoi(num, 1, 2, 3);
        System.out.println(ans);
        System.out.println(sb);
    }

    public static void hanoi(int n, int from, int by, int to) {
        ans += 1;

        if (n == 1) { //원판 하나 남았을 경우
            sb.append(from + " " + to + "\n");
            return;
        } else {
            hanoi(n - 1, from, to, by); // 원판1에서 원판2로 넘기는 작업
            sb.append(from + " " + to + "\n"); // 원판1에서 남은 마지막 원판3으로 옮기기
            hanoi(n - 1, by, from, to); //원판2에서 원판3로 넘기는 작업
        }

    }

}
