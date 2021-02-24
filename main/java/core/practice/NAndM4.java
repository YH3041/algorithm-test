package core.practice;

import java.util.Scanner;

public class NAndM4 {
    private static int n, m;
    private static int[] map;
    private static boolean[] visit;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[m];
        visit = new boolean[n + 1];

        dfs(0);

    }

    private static void dfs(int start) {

        if (start == m) {

            for (int i = 0; i < m; i++) {
                System.out.print(map[i] + " ");
            }
            System.out.println();

        } else {

            for (int i = 1; i <= n; i++) {

                if (start == 0) {
                    map[start] = i;
                    dfs(start + 1);
                } else if (map[start - 1] <= i) {
                    map[start] = i;
                    dfs(start + 1);
                }
            }

        }

    }
}
