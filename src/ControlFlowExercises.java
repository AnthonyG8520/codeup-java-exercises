import java.util.Objects;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }
//        //for loop format^^^
//        for(int i = 5; i <= 15; i++){
//            System.out.print(i + " ");
//        }
//
//        long i = 2;
//        do{
//            System.out.println(i);
//            i *= i;
//        }while(i < 1000000);
//        for loop format^^^
//        for(long i = 2; i < 1000000; i *= i){
//            System.out.println(i);
//        }
//
//        for(int i = 0; i <= 100; i++){
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            }else if(i % 5 == 0){
//                System.out.println("Buzz");
//            }else if(i % 3 == 0){
//                System.out.println("Fizz");
//            }else System.out.println(i);
//        }
//
        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter a number:");
//        int userInput = scan.nextInt();
//        System.out.println("Here is your table!");
//        System.out.println("Number | Squared | Cubed");
//
//        for(int i = 1; i <= userInput; i++){
//            int squared =(int) Math.pow(i,2);
//            int cubed =(int) Math.pow(i,3);
//            System.out.printf("%s      |%s        |%s%n", i, squared, cubed);
//            if(userInput == i){
//                System.out.print("Would you like to continue? [y/n]");
//                String userAnswer = scan.next();
//                if(userAnswer.equals("y")){
//                    System.out.print("Enter another number:");
//                   userInput = scan.nextInt();
//                }else break;
//            }
//        }

            String userAnswer = "";
            do{
                System.out.print("Enter a grade between 0 and 100:");
                int grade = scan.nextInt();
                if (grade >= 88) {
                System.out.println("Your grade is an: A");
            } else if (grade >= 80) {
                System.out.println("Your grade is an: B");
            } else if (grade >= 67) {
                System.out.println("Your grade is an: C");
            } else if (grade >= 60) {
                System.out.println("Your grade is an: D");
            } else if (grade >= 0) {
                System.out.println("Your grade is an: F");
            }System.out.print("Would you like to continue? [y/n]");
            userAnswer = scan.next();
        }while(userAnswer.equals("y"));

    }
}
