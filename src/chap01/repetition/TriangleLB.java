package chap01.repetition;

import java.util.Scanner;

public class TriangleLB {
    public static void main(String[] args) {
        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 단 삼각형입니까? : ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
