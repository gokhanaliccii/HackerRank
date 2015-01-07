package euler;

import java.util.Scanner;

/**
 * Created by gokhanaliccii on 6.01.15.
 */
public class Euler1 {

    //https://www.hackerrank.com/contests/projecteuler/challenges/euler001

    public static void main(String[] args) {


        long[] inputs = readInputs();

        for (int i = 0; i < inputs.length; i++) {

            System.out.println(eulerProblem(inputs[i]));
        }


    }

    private static long[] readInputs() {

        Scanner scanner = new Scanner(System.in);
        int inputQuantities = scanner.nextInt();

        long[] inputs = new long[inputQuantities];

        for (int i = 0; i < inputQuantities; i++) {

            inputs[i] = scanner.nextInt();
        }
        return inputs;
    }

    public static long eulerProblem(long value) {
        long t1 = f(value, 3);
        long t2 = f(value, 5);
        long t3 = f(value, 3 * 5);
        return t1 + t2 - t3;
    }

    private static long f(long max, int n) {
        long a = (max - 1) / n;
        return n * a * (a + 1) / 2;
    }
}
