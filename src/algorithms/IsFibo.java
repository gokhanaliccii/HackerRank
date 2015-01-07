package algorithms;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.Scanner;

/**
 * Created by gokhanaliccii on 25.12.14.
 */
public class IsFibo {

    //https://www.hackerrank.com/challenges/is-fibo

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputQuantity = scanner.nextInt();

        for (int i = 0; i < inputQuantity; i++)
            checkFibo(scanner.nextLong());

    }

    private static boolean isWholeNumber(double num) {
        return num - Math.round(num) == 0;
    }

    private static boolean isFibByFormula(long num)
    {
        double power = (double)num * (double)num;
        double first = 5 * power + 4;
        double second = 5 * power - 4;


        return isWholeNumber(Math.sqrt(first)) || isWholeNumber(Math.sqrt(second));
    }

    private  static void isFibo(int value){

        if(isFibByFormula(value))
            System.out.println("IsFibo");
        else
            System.out.println("IsNotFibo");
    }

    //TODO check why it is wrong
    public static void checkFibo (long input) {

        if (input == 0 || input == 1)
            System.out.println("IsFibo");

        long currentFibo = 0;
        long previousFibo = 1;
        long newFibo = 0;

        //main loop breaker
        while (true) {


            if (newFibo > input) {

                System.out.println("IsNotFibo");
                break;
            }

            if (input == newFibo) {
                System.out.println("IsFibo");
                break;
            }

            currentFibo = previousFibo;
            previousFibo = newFibo;


        }
    }



    public static long getFibo(long fib){

        if(fib == 1 || fib ==2)
            return 1;

        return  getFibo(fib-1) + getFibo(fib-2);
    }


}
