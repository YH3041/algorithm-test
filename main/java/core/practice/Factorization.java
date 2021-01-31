package core.practice;

// 정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
// 첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.
// N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.

import java.util.Scanner;

public class Factorization {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 2;

        while (n >= i) {
            if (n % i == 0) {
                System.out.println(i);
                n /= i;
            } else {
                i++;
            }
        }
    }
}
