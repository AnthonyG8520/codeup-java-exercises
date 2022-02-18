import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(add(2,5));
        System.out.println(subtract(10,2));
        System.out.println(divide(10,5));
        System.out.println(multiply(10,2));
        System.out.println(remainder(7,2));
        System.out.println(getInteger(0,100));
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
    public static int getInteger(int min, int max){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " and " + max + ":");
        int userInput = scan.nextInt();
        System.out.println("user entered" + userInput);
        if(userInput <= min || userInput >= max){
            System.out.println("That number is out of range. Try another.");
            getInteger(min, max);
        }return userInput;
    }
    //------------------------------------







}
