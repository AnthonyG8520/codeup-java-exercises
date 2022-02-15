import java.sql.SQLOutput;

// class - defining the class
// HelloWorld is the name of the class and it matches the name of the .java file
public class HelloWorld {

    //method - similar toa function in jaavscript
    //main method -> specific method in java that acts as our entry point when running java
    public static void main (String[] args){
        //void - method doesn't expect anything to be returned
        // main - name of our method, main is a keyword that is going ot be searched as the entry point
        // String[] args - passing in a string array named args
        //print out "hello world" to the console
        System.out.print("Hello");
        System.out.println(" World");

        int myFavoritenumber = 99;
        System.out.println(myFavoritenumber);

        String myString = "Anthony";
        System.out.println(myString);

        double myNumber = 3.14;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        boolean class = false;

        String theNumberThree = "three";
        Object o = theNumberThree;
//        int three = (int) "three";
//        int three = (int) o;

//        int x = 4;
//        System.out.println(x += 5);

//        int x = 3;
//        int y = 4;
//        System.out.println(y *= x);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);
    }

}
