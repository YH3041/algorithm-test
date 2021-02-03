package core.practice;

import java.util.Scanner;

public class EuclideanGeometry {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();

        System.out.println(String.format("%.6f", Math.PI * r * r));
        System.out.println(String.format("%.6f", (double)2 * r * r));
    }
}
