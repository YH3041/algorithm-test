package core.practice;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String result;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            result = f(n) + " " + f(n + 1);
            System.out.println(result);
        }
    }

    public static int f(int n) {

        int a = 1;
        int b = 0;
        int c = 1;
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 0;
        } else {
            for (int i = 1; i <= n; i++) {
                a = b;
                b = c;
                c = a + b;
            }
            return a;
        }
    }


}
