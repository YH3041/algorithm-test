package core.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Star {

    static char[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        arr = new char[input][input];


        for (int i = 0; i < input; i++) {
            Arrays.fill(arr[i], ' ');
        }

        makeStar(0, 0, input);

        for (int i = 0; i < input; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void makeStar(int x, int y, int n) {
        if (n == 1) {
            arr[x][y] = '*';
            return;
        }
        int k = n / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    continue;
                }
                makeStar(x + k * i, y + k * j, k);
            }
        }
    }
}
