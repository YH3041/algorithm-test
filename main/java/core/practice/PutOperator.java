package core.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class PutOperator {

    public static int[] inputAry;
    public static ArrayList<Integer> inputList;
    public static boolean[] check;

    public static ArrayList<Integer> outputList;
    public static int min = Integer.MAX_VALUE;
    public static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        inputAry = new int[n];

        for (int i = 0; i < n; i++) {
            inputAry[i] = sc.nextInt();
        }

        inputList = new ArrayList<Integer>();
        check = new boolean[n - 1];
        outputList = new ArrayList<Integer>();

        for (int i = 0; i < 4; i++) {
            int num = sc.nextInt();
            if (num > 0) {
                for (int j = 0; j < num; j++) {
                    inputList.add(i);
                }
            }
        }

        dfs(n - 1, 0);
        System.out.println(max);
        System.out.println(min);
    }

    public static void dfs(int n, int depth) {
        if (depth == n) {
            calAnswer(n);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (check[i]) continue;
            check[i] = true;
            outputList.add(inputList.get(i));
            dfs(n, depth + 1);
            outputList.remove(outputList.size() - 1);
            check[i] = false;
        }
    }

    public static void calAnswer(int n) {
        int sum = inputAry[0];

        for (int i = 1; i < n + 1; i++) {
            int sign = outputList.get(i - 1);
            if (sign == 0) {
                sum += inputAry[i];
            } else if (sign == 1) {
                sum -= inputAry[i];
            } else if (sign == 2) {
                sum *= inputAry[i];
            } else {
                sum /= inputAry[i];
            }
        }
        max = Math.max(max, sum);
        min = Math.min(min, sum);
    }
}
