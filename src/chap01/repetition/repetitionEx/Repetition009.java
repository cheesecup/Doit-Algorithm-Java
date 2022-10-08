package chap01.repetition.repetitionEx;

public class Repetition009 {

    private static int sumOf(int a, int b) {
        int small, big;
        if (a >= b) {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }

        int sum = 0;
        for (int i=small; i<=big; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOf(3, 5));
        System.out.println(sumOf(6, 4));
    }
}
