package core.practice;

// 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다. 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.


import java.util.Scanner;

public class GuessRightTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();

        int result = (int)Math.pow(a,2) + (int)Math.pow(b,2);


        if(result == (int)Math.pow(c,2)) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }


    }
}
