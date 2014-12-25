package algorithms;

import java.util.Scanner;

/**
 * Created by gokhanaliccii on 25.12.14.
 */
public class FindDigits {

    //https://www.hackerrank.com/challenges/find-digits

    public static void main(String[] args) {

        int inputQuantity;
        int inputs[] ;

        Scanner scanner = new Scanner(System.in);
        inputQuantity = scanner.nextInt();

       inputs = new int[inputQuantity];

        for (int i = 0; i < inputQuantity; i++)
            inputs [i] = scanner.nextInt();

        for (int i :inputs)
            executeAlgorithm(i);
    }

    private static void executeAlgorithm(int input){

        String svalue = String.valueOf(input);
        String []splitted = svalue.split("");

        if (splitted == null)
            return;

        int qvalue = 0;

        for (String value : splitted) {

            if (value == null)
                continue;

            if (value.equals(""))
                continue;

            int intValue = Integer.valueOf(value);
            if (intValue == 0)
                continue;

            if(input % intValue != 0)
                continue;

            qvalue ++;
        }

        System.out.println(qvalue);
    }

}
