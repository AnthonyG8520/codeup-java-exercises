package ExtraWork;

import java.util.Scanner;

public class tictactoe {
    public static String [][] tictactoe = {
            {" ", " 1 ", " 2 ", " 3 "},
            {"1", "---", "---", "---"},
            {"2", "---", "---", "---"},
            {"3", "---", "---", "---"}
    };

    public static void printGame(){
        System.out.println("Please select a spot. [x,y]");
        for(String[] arr : tictactoe){
            for(String s : arr){
                System.out.print(s + " | ");
            }
            System.out.println();
        }
    }



    public static void game(){
        boolean player1 = true;
        boolean player2 = false;


        printGame();


    }
//--------------------------------------------------------------------------------------
    public static Scanner scan = new Scanner(System.in);

    public static void add(){
        System.out.println("Enter a number");
        int num1 = scan.nextInt();
        System.out.println("Enter another number");
        int num2 = scan.nextInt();
        System.out.println("Result: " + (num1 + num2));
    }

    public static void subtract(){
        System.out.println("Enter a number");
        int num1 = scan.nextInt();
        System.out.println("Enter another number");
        int num2 = scan.nextInt();
        System.out.println("Result: " + (num1 - num2));
    }

    public static void divide(){
        System.out.println("Enter a number");
        float num1 = scan.nextFloat();
        System.out.println("Enter another number");
        float num2 = scan.nextFloat();
        System.out.println("Result: " + (num1 / num2));
    }

    public static void multiply(){
        System.out.println("Enter a number");
        int num1 = scan.nextInt();
        System.out.println("Enter another number");
        int num2 = scan.nextInt();
        System.out.println("Result: " + (num1 * num2));
    }


    public static void calc(){
        System.out.println("1: Addition\n2: Subtraction\n3: Division\n4: Multiplication\n5: Quit");
        System.out.print("Choose an operation. [By list no.]");
        String opAns = scan.next();
        switch(opAns){
            case "1":
                add();
                break;
            case "2":
                subtract();
                break;
            case "3":
                divide();
                break;
            case "4":
                multiply();
                break;
            case "5":
                return;
            default:
                System.out.println("That entry doesn't match anything. Try again.");
                calc();
        }
        System.out.println("Another?[Y/N]");
        String cont = scan.next();
        if(cont.equalsIgnoreCase("y")) {
            calc();
        }
        System.out.println("Goodbye");
    }







    public static void main(String[] args) {
//        game();
        calc();




    }
}
