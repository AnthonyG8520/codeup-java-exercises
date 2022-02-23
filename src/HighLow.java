import java.util.Scanner;

public class HighLow {
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
    public static void main(String[] args) {
        HighLow();
    }
}
