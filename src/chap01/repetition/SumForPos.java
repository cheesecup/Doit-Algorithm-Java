package chap01.repetition;

import java.util.Scanner;

public class SumForPos {
    public static void main(String[] args) {
        System.out.println("1부터 n까지의 합을 구합니다.");
        Scanner sc = new Scanner(System.in);

        int n = 0;
        do {
            System.out.print("n의 값: ");
            n = sc.nextInt();
        } while (n <= 0);

        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum += i;
        }

        System.out.println("1부터 n까지의 합은 " + sum + "입니다.");
    }
}
