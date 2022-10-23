package chap02.array;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
    public static void main(String[] args) {
        System.out.println("키의 최대값을 구합니다.");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("사람 수 : ");
        int num = random.nextInt(10);
        System.out.println(num);

        int[] height = new int[num];
        for (int i=0; i<num; i++) {
            System.out.print("height[" + i + "] : ");
            height[i] = 100 + random.nextInt(90);
            System.out.println(height[i]);
        }

        int max = 0;
        for (int i=0; i<num; i++) {
            if (height[i] > max) {
                max = height[i];
            }
        }
        System.out.println("최댓값은 " + max + "입니다.");
    }
}
