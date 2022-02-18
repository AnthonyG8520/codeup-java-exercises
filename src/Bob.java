import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cont = "";
        do{
            System.out.print("Say something:");
            String response = scan.nextLine();
            if(response.endsWith("?")){
                System.out.println("Bob said: Sure.");
            }else if(response.endsWith("!")){
                System.out.println("Bob said: Whoa, chill out!");
            }else if(response.isEmpty()){
                System.out.println("Bob said: Fine. Be that way!");
            }else System.out.println("Whatever.");
            System.out.print("Would you like to respond? [y/n]");
            cont = scan.nextLine();
        }while(cont.equals("y"));
    }
}
