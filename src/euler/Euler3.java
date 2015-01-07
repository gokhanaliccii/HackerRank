package euler;

import java.util.Scanner;

/**
 * Created by gokhanaliccii on 7.01.15.
 */
public class Euler3 {

    //https://www.hackerrank.com/contests/projecteuler/challenges/euler003
    public static void main(String[] args) {

        long[] inputs = readInputs();

        for (int i = 0; i < inputs.length; i++) {

            System.out.println(findBiggestPrime(inputs[i]));
        }

    }

    public static boolean isPrime(long num) {

        if (num == 2)
            return true;

        for (long i = 3; i * i <= num; i += 2) {

            if (num % i == 0)
                return false;

        }

        return true;
    }

    private static long[] readInputs() {

        Scanner scanner = new Scanner(System.in);
        int inputQuantities = scanner.nextInt();

        long[] inputs = new long[inputQuantities];

        for (int i = 0; i < inputQuantities; i++) {

            inputs[i] = scanner.nextLong();
        }
        return inputs;
    }

    private static long findBiggestPrime(long number) {

        long biggestPrime = 0;

        if (number % 2 == 0) {

            number = number / 2;
            biggestPrime = 2;
        }

        if (number == 2)
            return 2;



        for (int i = 3; i <= number; i += 2) {

            if (number % i != 0)
            continue;

            if(!isPrime(i))
                continue;;

                biggestPrime = i;
                number = number / biggestPrime;

        }


        return biggestPrime;
    }


}
