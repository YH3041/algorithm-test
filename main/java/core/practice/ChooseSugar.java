package core.practice;

import java.util.Scanner;

// 설탕봉지(3Kg, 5Kg)
// Kg에 맞게 살탕봉지 선택
// 3Kg, 5Kg 선택할 수 있다면 5Kg
// 가져가야할 설탕봉지 최소개수 출력

public class ChooseSugar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        if (n == 4 || n == 7) {
            System.out.println(-1);
        } else if (n % 5 == 0) {
            System.out.println(n / 5);
        } else if (n % 5 == 1 || n % 5 == 3) {
            System.out.println((n / 5) + 1);
        } else if (n % 5 == 2 || n % 5 == 4) {
            System.out.println((n / 5) + 2);
        }
    }
}
