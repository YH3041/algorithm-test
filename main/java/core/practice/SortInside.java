package core.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortInside {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();

        String[] arr = num.split("");

        Arrays.sort(arr, Comparator.reverseOrder());
        for (String string : arr) {
            System.out.print(string);
        }
    }
}
