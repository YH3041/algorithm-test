package core.practice;

import java.util.Scanner;

public class NAndM {

    public static int[] arr;
    public static boolean[] check;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        arr = new int[m];
        check = new boolean[n];
        dfs(n, m, 0);

    }

    public static void dfs(int n, int m, int depth) {
        if (depth == m) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                check[i] = true;
                arr[depth] = i + 1;
                dfs(n, m, depth + 1);
                check[i] = false;
            }
        }
    }
}
