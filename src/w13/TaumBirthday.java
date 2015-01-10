package w13;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * Created by gokhanaliccii on 10.01.15.
 */
public class TaumBirthday {

    //https://www.hackerrank.com/contests/w13/challenges/taum-and-bday

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testQuantity = scanner.nextInt();
        scanner.nextLine();


        for (int i = 0; i < testQuantity; i++) {

            String quantitiesLine = scanner.nextLine();
            String unitPricesLine = scanner.nextLine();
            calculateMinPrice(quantitiesLine, unitPricesLine);

        }

        scanner.close();
    }


    private static void calculateMinPrice(String quantitiesLine, String unitPricesLine) {


        long[] unitPrices = getUnitPrices(unitPricesLine);
        long[] newPrices = getConvertedPrices(unitPrices[0], unitPrices[1], unitPrices[2]);

        long blackQuantiy = getBlackQuantity(quantitiesLine);
        long whiteQuantiy = getWhiteQuantity(quantitiesLine);

        long totalPrice = (blackQuantiy * newPrices[0]) + (whiteQuantiy * newPrices[1]);

        System.out.println(totalPrice);
    }

    private static long[] getConvertedPrices(long bUnitPrice, long wUnitPrice, long conversionPrice) {

        long newPrices[] = new long[2];

        if (wUnitPrice + conversionPrice < bUnitPrice)
            newPrices[0] = wUnitPrice + conversionPrice;
        else
            newPrices[0] = bUnitPrice;

        if (bUnitPrice + conversionPrice < wUnitPrice)
            newPrices[1] = bUnitPrice + conversionPrice;
        else
            newPrices[1] = wUnitPrice;

        return newPrices;
    }

    private static long getBlackQuantity(String quantityLine) {

        if (quantityLine == null)
            return 0l;

        int spaceIndex = quantityLine.indexOf(" ");
        String blackString = quantityLine.substring(0, spaceIndex);
        return Long.valueOf(blackString);
    }

    private static long getWhiteQuantity(String quantityLine) {

        if (quantityLine == null)
            return 0l;

        int spaceIndex = quantityLine.indexOf(" ");
        String whiteString = quantityLine.substring(spaceIndex + 1, quantityLine.length());
        return Long.valueOf(whiteString);
    }

    private static long[] getUnitPrices(String priceLine) {

        if (priceLine == null)
            return null;

        long[] unitPrices = new long[3];
        String[] splittedLine = priceLine.split(" ");

        for (int i = 0; i < 3; i++) {

            unitPrices[i] = Long.valueOf(splittedLine[i]);
        }

        return unitPrices;
    }

}
