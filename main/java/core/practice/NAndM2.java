package core.practice;

import java.util.Scanner;

public class NAndM2 {

    static int n;
    static int m;
    static boolean[] isCheck;
    static int[] num;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        isCheck = new boolean[n + 1];
        num = new int[n + 1];

        dfs(0, -1);
    }

    static void dfs(int current, int prevNum) {
        if (current == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(num[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                if (isCheck[i] == true) {
                    continue;
                }
                // 이전 값과 비교
                if (prevNum > i) {
                    continue;
                }
                isCheck[i] = true;
                num[current] = i;
                dfs(current + 1, num[current]);
                isCheck[i] = false;
            }
        }
    }
}
