package core.practice;

import java.util.Scanner;

public class Decomposition {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            int sum = Sum(i);
            if (i + sum == n) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }

    private static int Sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
