import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int userInput = scanner.nextInt();
        System.out.printf("You entered: %s%n",userInput);

        System.out.print("Enter three words:");
        String input1 = scanner.next();
        String input2 = scanner.next();
        String input3 = scanner.nextLine();
        //used next line for last scanner so that following scanner below doesn't look for input here^ -- could have declared new scanner as well
        System.out.printf("You enter %s, %s, and %s.%n", input1, input2, input3);

        System.out.print("Enter a sentence:");
        String sentence = scanner.nextLine();
        System.out.printf("You entered: %s %n", sentence);

        System.out.print("Enter length:");
        String l = scanner.nextLine();
        System.out.print("Enter width:");
        String w = scanner.nextLine();
        int length = Integer.parseInt(l);
        int width = Integer.parseInt(w);
        int area = length * width;
        int perimeter = (length * 2) + (width * 2);
        System.out.printf("The area is %S.%n",area);
        System.out.printf("The perimeter is %s.%n", perimeter);

    }
}
