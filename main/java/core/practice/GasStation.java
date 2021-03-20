package core.practice;

import java.util.Scanner;

public class GasStation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] dis = new long[n - 1];
        long[] price = new long[n];


        for (int i = 0; i < n - 1; i++) {
            dis[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            if (price[i] < price[i + 1]) {
                price[i + 1] = price[i];
            }
        }

        long total = 0;
        for (int i = 0; i < n - 1; i++) {
            total += (price[i] * dis[i]);
        }
        System.out.println(total);
        sc.close();
    }
}
