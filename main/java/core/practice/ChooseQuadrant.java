package core.practice;

public class ChooseQuadrant {

    public static void main(String[] args) {
        System.out.println(findQuadrant(12, 5));
        System.out.println(findQuadrant(9, -13));
    }

    public static int findQuadrant(int a, int b) {
        if(a > 0 && b > 0) {
            return 1;
        } else if(a < 0 && b > 0) {
            return 2;
        } else if(a < 0 && b < 0) {
            return 3;
        } else if(a > 0 && b < 0) {
            return 4;
        } else  {
            System.out.println("-1000 < 숫자 < 1000, 숫자 != 0 조건에 맞춰주세요!");
            return 0;
        }
    }
}
