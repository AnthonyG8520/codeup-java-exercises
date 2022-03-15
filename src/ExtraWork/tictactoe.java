package ExtraWork;

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
    public static void main(String[] args) {
        game();
    }
}
