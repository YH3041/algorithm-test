package core.practice;

import java.util.Scanner;

public class ListWeightClasses {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] grade = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (x[i] > x[j] && y[i] > y[j]) {
                    grade[j]++;
                    continue;
                }
                if (x[i] < x[j] && y[i] < y[j]) {
                    grade[i]++;
                    continue;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", grade[i] + 1);
        }
    }
}
