package chap02.array;

import java.util.Scanner;

/**
 * 입력 받은 10진수를 2진수 ~ 36진수로 기수 변환하여 나타내기
 */
public class CardConvRev {

    // 정수값 x를 r 진수로 변환하여 배열 d에 아래자리부터 넣어두고 자리수를 반환합니다.
    private static int cardConvR(int x, int r, char[] d) {
        int digits = 0;
        String dChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dChar.charAt(x % r); // r로 나눈 나머지를 저장
            x /= r;
        } while (x != 0);

        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no; //변환하는 정수
        int cd; //기수
        int dno; //변환 후의 자리수
        int retry; //다시 한 번
        char[] cno = new char[32]; //변환 후 각 자리의 숫자를 넣어두는 문자의 배열

        System.out.println("10진수를 기수 변환합니다.");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수 : ");
                no = sc.nextInt();
            } while (no < 0);

            do {
                System.out.print("어떤 진수로 변환할까요? (2~36) : ");
                cd = sc.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConvR(no, cd, cno);
        }
    }
}
