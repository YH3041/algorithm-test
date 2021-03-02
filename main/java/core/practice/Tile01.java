package core.practice;

import java.util.Scanner;

public class Tile01 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int dp[] = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        if (n >= 2) {
            for (int i = 2; i <= n; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
            }
        }

        System.out.println(dp[n]);
    }
}
