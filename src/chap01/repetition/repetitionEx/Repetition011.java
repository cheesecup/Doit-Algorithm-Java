package chap01.repetition.repetitionEx;

import java.util.Scanner;

public class Repetition011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("n의 자리수를 구합니다.");
        System.out.print("n의 값: ");
        int n = sc.nextInt();
        String s = String.valueOf(n);
        int len = s.length();

        System.out.println("그 수는 " + len + "자리입니다.");
    }
}
