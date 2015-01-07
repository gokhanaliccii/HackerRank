package euler;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by gokhanaliccii on 6.01.15.
 */
public class Euler2 {
    //https://www.hackerrank.com/contests/projecteuler/challenges/euler002
    public static void main(String[] args) {

        long[] inputs = readInputs();

        for (int i = 0; i < inputs.length; i++) {

            System.out.println(sumEvenFibosV2(inputs[i]));
        }


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



    public static long sumEvenFibosV2(long limit){

        long sum = 0;
        long preValue=1;
        long curValue =1;
        long result = 0;

        while (true){

            result = preValue + curValue;
            if(result >= limit)
                break;

            preValue = curValue;
            curValue = result;


            if(result % 2 == 0)
                sum += result;
        }

         return sum;
    }

}
