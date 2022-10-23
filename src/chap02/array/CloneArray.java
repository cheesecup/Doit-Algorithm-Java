package chap02.array;

import java.util.Arrays;

public class CloneArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b;
        b = a.clone();

        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
    }
}
