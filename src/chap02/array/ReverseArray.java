package chap02.array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요소수 : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            System.out.print("x[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        reverse(arr);
        System.out.println("요소를 역순으로 정렬했습니다.");

        for (int i=0; i<n; i++) {
            System.out.println("x[" + i + "] = " + arr[i]);
        }
    }

    private static void reverse(int[] arr) {
        for (int i=0; i<arr.length/2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
    }
}
