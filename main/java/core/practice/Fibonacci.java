package core.practice;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        System.out.println(fi(n));

    }
    public static int fi(int n) {
        if(n <= 1) {
            return n;
        } else {
            return fi(n - 2) + fi(n - 1);
        }
    }
}
