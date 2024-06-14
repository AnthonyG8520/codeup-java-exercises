package ExtraWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CurrencyConverter {
    public static ArrayList<String> currencyConversionList = new ArrayList<>(Arrays.asList("Dollars to Euros", "Euros to Dollars", "Dollars to Yen", "Yen to Dollars"));
    public static String userInput;
    public static Scanner scan = new Scanner(System.in);

    public static void currencyConverterProgram(){
        String cont = "";
        for(String conversion : currencyConversionList){
            int i = 1;
            System.out.println(i + "." + conversion);
            i++;
        }


    }


    public static void main(String[] args) {
        currencyConverterProgram();
    }




}
