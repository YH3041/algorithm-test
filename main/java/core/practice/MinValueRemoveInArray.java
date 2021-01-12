package core.practice;



import java.util.Arrays;

public class MinValueRemoveInArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};

        int min = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
