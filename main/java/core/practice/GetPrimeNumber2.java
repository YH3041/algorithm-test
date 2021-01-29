package core.practice;

//자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
//예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.


import java.util.Scanner;

public class GetPrimeNumber2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("M : ");
        int M = sc.nextInt();
        System.out.print("N : ");
        int N = sc.nextInt();

        int sum = 0;
        int min = 10000;
        int cnt = 0;

        if (M > N) {
            System.out.println("M은 N보다 작거나 같아야 합니다.");
        } else {
            if (M > 0 && M <= 10000 && N > 0 && N <= 10000) {
                for (int i = M; i <= N; i++) {
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            cnt++;

                        }
                    }
                    if (cnt == 0) {
                        sum += i;
                        if (min > i) {
                            min = i;
                            //N을 포함하지 않은 범위이기 때문에
                        }
                    }
                    cnt = 0;
                }
                if (sum == 0) {
                    System.out.println(-1);
                }
                System.out.println(sum);
                System.out.println(min);
            }

        }

    }
}
