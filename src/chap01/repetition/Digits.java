package chap01.repetition;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        String nStr;

        System.out.println("2자리의 정수를 입력하세요.");
        do {
            System.out.print("입력: ");
            n = sc.nextInt();
            nStr = String.valueOf(n);

        } while (n > 0 && nStr.length() != 2);

        System.out.println("변수 n의 값은 " + n + "가(이) 되었습니다.");
    }
}
