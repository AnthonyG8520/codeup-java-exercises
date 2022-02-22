import org.w3c.dom.ls.LSOutput;

import java.io.PrintStream;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(add(2,5));
//        System.out.println(subtract(10,2));
//        System.out.println(divide(10,5));
//        System.out.println(multiply(10,2));
//        System.out.println(remainder(7,2));
//        getInteger(0,100);
        factorial();
//        HighLow();
    }

    //--------------------------------CUSTOM METHODS--------------------------------------------------------


    //1.------------------
    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int subtract(int num1, int num2){
        return num1 - num2;
    }

    public static int divide(int num1, int num2){
        return num1 / num2;
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    public static int remainder(int num1, int num2){
        return num1 % num2;
    }
    //-------------------------------------

    //2.----------------------------
//    public static int getInteger(int min, int max){
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter a number between " + min + " and " + max + ":");
//        int userInput = scan.nextInt();
//        System.out.println("user entered" + userInput);
//        if(userInput <= min || userInput >= max){
//            System.out.println("That number is out of range. Try another.");
//            getInteger(min, max);
//        }return userInput;
//    }

    public static void getInteger(int min, int max){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " and " + max + ":");
        int userInput = scan.nextInt();
        if(userInput >= min && userInput <= max){
            System.out.println(userInput);
        } else{ System.out.println("That number is out of range. Try another.");
        getInteger(min, max);
        }
    }
    //-------------------------------------------------

    //3.--------------------------------------------
    public static void factorial(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10:");
        int userInput = scan.nextInt();
        long result = userInput;
        String print = userInput + "! =";
        for (int i = 1; i <= userInput; i++){
            result = result * i;
            print += " x " + i;
        }
        print += " = " + result;
        System.out.println(print);
    }

    //4.--------------------------------









    //5.--------------------------------------

    public static void HighLow(){
        Scanner input = new Scanner(System.in);
        long num =Math.round(1 + (Math.random() * 100));
//        System.out.println(num);
        int userGuess = 0;
        do{
            System.out.print("Try to guess the number:");
            userGuess = input.nextInt();
            if(userGuess > num){
                System.out.println("Lower");
            }else if(userGuess < num){
                System.out.println("Higher");
            }else System.out.println("You got it.");
        }while(userGuess != num);
    }







}
