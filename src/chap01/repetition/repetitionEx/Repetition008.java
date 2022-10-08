package chap01.repetition.repetitionEx;

import java.util.Scanner;

public class Repetition008 {
    public static void main(String[] args) {
        System.out.println("1부터 n까지의 합을 구합니다.");
        Scanner sc = new Scanner(System.in);
        System.out.print("n의 값: ");
        int n = sc.nextInt();

        int sum = 0;
        if (n % 2 == 0) {
            sum = (1 + n) * (n / 2);
        } else {
            sum = (1 + n) * (n / 2) + (n / 2 + 1);
        }

        System.out.println("1부터 n까지의 합은 " + sum + "입니다.");
    }
}
