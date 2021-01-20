package core.practice;

import java.util.Scanner;

public class GetSum {

    public static void main(String[] args) {
        Scanner SCANNER = new Scanner(System.in);
        int n = SCANNER.nextInt();

        int[] arr = new int[n];
        System.out.println(sum(arr));

    }

    public static int sum(int[] a) {
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum = sum + i;
        }
        return sum;
    }
}

