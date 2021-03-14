package core.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();//사람 수 input 저장

        int minutes[] = new int[n + 1];//시간들 저장할 배열

        for (int i = 0; i < n; i++) {//시간 input n개 저장
            minutes[i] = scan.nextInt();
        }

        int result = Greedy_line(minutes);
        System.out.println(result);
    }

    public static int Greedy_line(int x[]) {
        int total = 0;

        Arrays.sort(x);
        int temp = 0;
        for (int i = 0; i < x.length; i++) {
            temp += x[i];
            total += temp;
        }

        return total;

    }
}
