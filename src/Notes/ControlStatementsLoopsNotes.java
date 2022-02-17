package Notes;

import java.util.Scanner;

public class ControlStatementsLoopsNotes {
    public static void main(String[] args) {
        //control statements
        //allows to control flow of code
        //operators - tools needed to control the flow
        //==,!=,<,>,<=,>=//operators

        //boolean expression
        //java statement that results in either true or false
        int myFavNum = 18; //statement
        boolean yorn = myFavNum > 0; // result in a boolean

        System.out.println(yorn);

        //logical operators
        //&&, ||, &, |, !

        //if statements
        int age = 31;
        int bmi = 20;

        if(age > 30 && bmi < 100){
            System.out.println("Still young!");
        };

        //STRING COMPARISON
        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [y/N] ");
        String userInput = sc.next();

        // Don't do this!
        //boolean confirmation = userInput == "y";
        //do this
        //boolean confirmation = userInput.equals("y")
        if(userInput.equals("y")){
            System.out.println("yes continue");
        }else{
            System.out.println("dont continue");
        }

        String myName = "Ant";
        String yourName = "ANT";

        boolean nameMatching = myName.equals(yourName);
        System.out.println(nameMatching); // false
        boolean nameNoCase = myName.equalsIgnoreCase(yourName);
        System.out.println(nameNoCase);

//        boolean bothNames = myName == yourName; //works but should be as shown below
        boolean bothNames = myName.equals(yourName);
        System.out.println(bothNames);

        //LOOPS
        //iterating through an index/array
        //for
        for(int i = 0; i < 10; i++){
            System.out.println("i is currently at: " + i);
        }
        //while
        //not sure how many times it'll loop and will check condition first before starting loop
        int i = 0;
        while(i < 10){
            System.out.println("i is: " + i);
            i++;
            if(i == 4){
                break; // will break when i is equal to 4
            }
        }
        //do while
        //executes code once before checking
//        int i = 0;
        do{
            System.out.println("i is:" + i);
            i++;
            break; // will only see i printed once with break placed here
        }while (i < 10);
    }
}
