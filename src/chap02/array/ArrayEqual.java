package chap02.array;

import java.util.Scanner;

public class ArrayEqual {

    private static boolean equals(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        boolean answer = false;
        for (int i=0; i<a.length; i++) {
            if (a[i] != b[i]) {
                return answer;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열 a의 요소수 : ");
        int a = sc.nextInt();

        int[] aArr = new int[a];
        for (int i=0; i<a; i++) {
            System.out.print("a[" + i + "] : ");
            aArr[i] = sc.nextInt();
        }

        System.out.print("배열 b의 요소수 : ");
        int b = sc.nextInt();

        int[] bArr = new int[b];
        for (int i=0; i<b; i++) {
            System.out.print("b[" + i + "] : ");
            bArr[i] = sc.nextInt();
        }

        boolean answer = equals(aArr, bArr);
        System.out.println("배열 a와 b는 " + (answer ? "같습니다." : "다릅니다."));
    }
}
