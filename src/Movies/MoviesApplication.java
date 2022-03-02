package Movies;
import java.util.Arrays;

import static util.Input.*;


public class MoviesApplication {
    public static Movie[] movies = MoviesArray.findAll();
    public static void findMovie(){
        System.out.println("What would you like to do?\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the comedy category\n" +
                "4 - view movies in the musical category\n" +
                "5 - view movies in the drama category\n" +
                "6 - view movies in the horror category\n" +
                "7 - view movies in the scifi category\n");
        System.out.print("Enter your choice here:");
        String userInput = scanner.next();
        for(int i = 0; i < movies.length; i++){
            if(userInput.equals("0")){
                return;
            }else if(userInput.equals("1")){
                System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                }
            else if(userInput.equals("2")){
                if(movies[i].getCategory().equalsIgnoreCase("animated")){
                    System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                }
            }
            else if(userInput.equals("3")){
                if(movies[i].getCategory().equalsIgnoreCase("comedy")){
                    System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                }
            }
            else if(userInput.equals("4")){
                if(movies[i].getCategory().equalsIgnoreCase("musical")){
                    System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                }
            }
            else if(userInput.equals("5")){
                if(movies[i].getCategory().equalsIgnoreCase("drama")){
                    System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                }
            }
            else if(userInput.equals("6")){
                if(movies[i].getCategory().equalsIgnoreCase("horror")){
                    System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                }            }
            else if(userInput.equals("7")){
                if(movies[i].getCategory().equalsIgnoreCase("scifi")){
                    System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                }
            }
        }
        findMovie();
    }
    public static void main(String[] args) {
       findMovie();





    }
}
