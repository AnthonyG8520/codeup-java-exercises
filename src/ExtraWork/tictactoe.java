package ExtraWork;

public class tictactoe {
    public static void main(String[] args) {
        String [][] tictactoe = {
                {"  ", "1", "2", "3"},
                {"1", "---", "---", "---"},
                {"2", "---", "---", "---"},
                {"3", "---", "---", "---"}
        };


        for(String[] arr : tictactoe){
            System.out.print("| ");
            for(String s : arr){
                System.out.print(s + " | ");
            }
            System.out.println();
        }
    }
}
