public class SyntaxTypesVariableNotes {
    public static void main (String[] args){
        //primitive data types
        //not objects
        //store values of a specific type
        // byte, short, int, long, float, double, char, boolean (see chart in curriculum)

        //declaring variables
        //MUST declare the data type before assigning it
        int myFavoritenumber = 18;
        System.out.println(myFavoritenumber);

        // let's store my favorite letter
        char myFavoriteLetter = 'L';
        System.out.println(myFavoriteLetter);

        // boolean
        boolean isSunny = true;
        System.out.println(isSunny);

        //good to know
        //int -> primitive type / not an object
        //Integer -> object / give us access to manipulate the Integer as an object

        //double -> primitive
        //Double -> object

        //char -> primitve
        //Character -> object

        //why not just use double for everything
        //it will affect hoq quickly the progrsm runs
        //use the correct data type to be more efficient

        // Strings
        // strings are not primitive data type
        //objects
        // can be initialized at the same time as declaring
        //declaring a variable of the String data type
        String school;
        //assing a value (initializing) the variable
        school = "Codeup";
        System.out.println(school);
        //can declare multiple strings at once

        String student1, student2, student3;
        student1 = "Anthony";
        student2 = "Anthony";
        student3 = "Anthony";

        //arithmetic expressions
        // 3, 9
        byte firstNum = 120;
        byte secondNum = 120;
        int result = firstNum + secondNum;
        System.out.println(result);

        // java 'final' keyword can't reassign the variable (similar to const in JS)
        final String myName = "Ant";
//        myName = "name"; --> can't change value of variable

        int myInteger = 900;
        long morePrecise = myInteger;
        System.out.println(myInteger);
        System.out.println(morePrecise);

        double pi = 3.14159;
        int almostPi = (int) pi;
        System.out.println(pi);
        System.out.println(almostPi);

        byte l = 127;
        l++;
        System.out.println(l);

    }
}
