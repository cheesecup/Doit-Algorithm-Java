package chap01.algorithm;

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("세 정수의 최대값을 구합니다.");

        System.out.print("a의 값: ");
        int a = sc.nextInt();
        System.out.print("b의 값: ");
        int b = sc.nextInt();
        System.out.print("c의 값: ");
        int c = sc.nextInt();

        int max = a;
        if (max < b) {
            max = b;
        }

        if (max < c) {
            max = c;
        }

        System.out.println("최대값은 " + max + "입니다.");
    }
}
