package core.practice;

// 노트북 판매 대수에 상관없이 매년 임대료, 재산세, 보험료, 급여 등 A만원의 고정 비용
// 한 대의 노트북을 생산하는 데에는 재료비와 인건비 등 총 B만원의 가변 비용
// 노트북 가격이 C만원으로 책정
// 일반적으로 생산 대수를 늘려 가다 보면 어느 순간 총 수입(판매비용)이 총 비용(=고정비용+가변비용)보다 많아지게 된다.
// 최초로 총 수입이 총 비용보다 많아져 이익이 발생하는 지점을 손익분기점(BREAK-EVEN POINT)이라고 한다.
// A, B, C가 주어졌을 때, 손익분기점을 구하는 프로그램을 작성하시오.
// 최초로 이익이 발생하는 판매량을 출력한다.

import java.util.Scanner;

public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(B >= C) {
            System.out.println(-1);
        } else {
            System.out.println((A /( C - B)) + 1);
        }

    }

}

