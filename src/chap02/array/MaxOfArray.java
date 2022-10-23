package chap02.array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        System.out.println("키의 최대값을 구합니다.");
        Scanner sc = new Scanner(System.in);
        System.out.print("사람 수 : ");
        int num = sc.nextInt();

        int[] height = new int[num];
        for (int i=0; i<num; i++) {
            System.out.print("height[" + i + "] : ");
            height[i] = sc.nextInt();
        }

        int max = 0;
        for (int i=0; i<num; i++) {
            if (height[i] > max) {
                max = height[i];
            }
        }
        System.out.println("최댓값은 " + max + "입니다.");

//        Arrays.sort(height);
//        System.out.println("최댓값은 " + height[num-1] + "입니다.");
    }
}
