package core.practice;

import java.util.Scanner;

// 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.

public class FindFourthPoint {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();


        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        int x4 = 0;
        int y4 = 0;

        if(x1 == x2) {
            x4 = x3;
        } else if(x2 == x3) {
            x4 = x1;
        } else if(x1 == x3) {
            x4 = x2;
        } else {
            System.out.println(-1);
        }

        if(y1 == y2) {
            y4 = y3;
        } else if(y2 == y3) {
            y4 = y1;
        } else if(y1 == y3) {
            y4 = y2;
        } else {
            System.out.println(-1);
        }

        System.out.println(x4 + " " + y4);
    }
}
