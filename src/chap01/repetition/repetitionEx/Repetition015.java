package chap01.repetition.repetitionEx;

import java.util.Scanner;

public class Repetition015 {

    /* 왼쪽 아래가 직각인 이등변 삼각형 */
    private static void triangleB(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* 왼쪽 위가 직각인 이등변 삼각형 */
    private static void triangleU(int n) {
        int k = 0;

        for (int i=1; i<=n; i++) {
            for (int j=n-k; j>0; j--) {
                System.out.print("*");
            }
            k++;
            System.out.println();
        }
    }

    /* 오른쪽 위가 직각인 이등변 삼각형 */
    private static void triangleRU(int n) {
        int i=0;

        while (i<n) {
            for (int j=0; j<i; j++) {
                System.out.print(" ");
            }
            for (int j=i; j<n; j++) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }

    /* 오른쪽 아래가 직각인 이등변 삼각형 */
    private static void triangleRB(int n) {
        int i=0;

        while (i<n) {
            for (int j=i; j<n-1; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 단 삼각형 입니까? : ");
        int n = sc.nextInt();
        System.out.println("왼쪽 아래가 직각인 이등변 삼각형");
        triangleB(n);
        System.out.println("왼쪽 위가 직각인 이등변 삼각형");
        triangleU(n);
        System.out.println("오른쪽 위가 직각인 이등변 삼각형");
        triangleRU(n);
        System.out.println("오른쪽 아래가 직각인 이등변 삼각형");
        triangleRB(n);
    }
}
