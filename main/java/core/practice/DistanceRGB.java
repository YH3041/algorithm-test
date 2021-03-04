package core.practice;

import java.util.Scanner;

public class DistanceRGB {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt(); //집의 수
        int dp[][] = new int[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {//RGB
                dp[i][j] = s.nextInt();
            }
        }


        for (int i = 1; i < n; i++) { //dp[0]은 초기화 상태로 같으므로 생략하고 1부터 시작
            dp[i][0] += Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] += Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] += Math.min(dp[i - 1][0], dp[i - 1][1]);
        }

        int min = Math.min(Math.min(dp[n - 1][0], dp[n - 1][1]), dp[n - 1][2]);

        System.out.println(min);

    }
}
