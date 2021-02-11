package core.practice;

import java.io.IOException;
import java.util.Scanner;

public class FilmDirectorShum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 0;
        int idx = 666;

        while (true) {
            if (String.valueOf(idx).contains("666")) {
                cnt++;
                if (cnt == num) {
                    System.out.println(idx);
                    break;
                }
            }
            idx++;
        }
    }
}
