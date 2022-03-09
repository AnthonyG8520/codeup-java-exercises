package util;

import java.util.Scanner;

public class Input {
    public static Scanner scanner = new Scanner(System.in);


    public static String getString(){
        System.out.print("Enter a string:");
        String input = scanner.nextLine();
        return input;
    }

    public static boolean yesNo(){
        System.out.print("Yes/No?");
        String answer = scanner.next();
        if(answer.equalsIgnoreCase("Yes")){
            return true;
        }else return false;
    }

    public static void getInt(int min, int max){
        int userInput = 0;
        System.out.print("Enter a number between " + min + " and " + max + ":");
//        int userInput = scanner.nextInt();
        try {
            String stringInt = getString();
            userInput = Integer.valueOf(stringInt);
        }catch(Exception e){
            System.out.println(e);
            System.out.println("That number is not valid");
        }
        if(userInput >= min && userInput <= max){
            System.out.println(userInput);
        } else{ System.out.println("That number is out of range. Try another.");
            getInt(min, max);
        }
    }

    public static int getInt(){
        System.out.print("Enter a number:");
        int userInput = scanner.nextInt();
        return userInput;
    }

    public static void getDouble(int min, int max){
        double userInput = 0;
        System.out.print("Enter a decimal between " + min + " and " + max + ":");
        try {
            String stringInt = getString();
            userInput = Double.valueOf(stringInt);
        }catch(NumberFormatException e){
            System.out.println(e);
            System.out.println("That number is not valid");
        }
        if(userInput >= min && userInput <= max){
            System.out.println(userInput);
        } else{ System.out.println("That number is out of range. Try another.");
            getDouble(min, max);
        }
    }

    public static void getDouble(){
        System.out.print("Enter a decimal:");
        double userInput = scanner.nextDouble();
        System.out.println(userInput);
    }

    public static void main(String[] args) {
//        getString();
//        System.out.println(yesNo());
//        getInt(5,10);
//        getInt();
//        getDouble(1,10);
//        getDouble();



    }
}
