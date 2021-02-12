package core.practice;

import java.util.*;

public class Sort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashSet<Integer> arr = new HashSet();

        for(int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        for(int element : arr) {
            System.out.println(element);
        }

    }
}
