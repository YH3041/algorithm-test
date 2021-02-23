package core.practice;

import java.util.Scanner;

public class NAndM3 {

    static int n, m;
    static int[] rlt;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        rlt = new int[m];
        solve(0, 0);
        System.out.println(sb);
    }

    private static void solve(int index, int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(rlt[i] + " ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < n; i++) {
            rlt[depth] = i + 1;
            solve(i, depth + 1);
        }

    }
}
