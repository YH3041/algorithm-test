package core.practice;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();
        int n;

        for (int i = 0; i < tc; i++) {
            n = scan.nextInt();
            long[] dp = new long[n + 1];
            dp[1] = 1;

            if (n >= 2) {
                dp[2] = 1;
            }

            for (int j = 3; j < n + 1; j++) {
                dp[j] = dp[j - 2] + dp[j - 3];
            }
            System.out.println(dp[n]);
        }
    }
}
