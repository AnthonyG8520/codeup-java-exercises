package ExtraWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CurrencyConverter {
    public static ArrayList<String> currencyConversionList = new ArrayList<>(Arrays.asList("Dollars to Euros", "Euros to Dollars", "Dollars to Yen", "Yen to Dollars"));
    public static int userInput;
    public static Scanner scan = new Scanner(System.in);
    public static int amountInput;

    public static double dollarsToEuros(int amount){
        return amount * .93;
    };

    public static double eurosToDollars(int amount){
        return amount * 1.07;
    };

    public static double dollarsToYen(int amount){
        return amount * 157.29;
    };

    public static double yenToDollars(int amount){
        return amount * .0064;
    };



    public static void currencyConverterProgram(){
        String cont = "";
        int i = 1;
        for(String conversion : currencyConversionList){
            System.out.println(i + "." + conversion);
            i++;
        }
        System.out.println("Choose a conversion");
        userInput = scan.nextInt();

        switch(userInput){
            case 1:
                System.out.println("Enter the amount you would like to convert");
                amountInput = scan.nextInt();
                System.out.println(dollarsToEuros(amountInput));
                break;
            case 2:
                System.out.println("Enter the amount you would like to convert");
                amountInput = scan.nextInt();
                System.out.println(eurosToDollars(amountInput));
                break;
            case 3:
                System.out.println("Enter the amount you would like to convert");
                amountInput = scan.nextInt();
                System.out.println(dollarsToYen(amountInput));
                break;
            case 4:
                System.out.println("Enter the amount you would like to convert");
                amountInput = scan.nextInt();
                System.out.println(yenToDollars(amountInput));
                break;
            default:
                System.out.println("That entry doesn't match anything");
        }

        System.out.println("Would you like to convert another? [Yes,No]");
        cont = scan.next();

        if(cont.equalsIgnoreCase("yes")){
            currencyConverterProgram();
        }

    }


    public static void main(String[] args) {
        currencyConverterProgram();
    }




}
