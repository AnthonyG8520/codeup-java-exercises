package Notes;

import java.util.Arrays;

public class ArraysLecture {
    public static void main(String[] args) {
        //What are arrays
            //length of arrays must be defined before using in java
            //data type of the elemenets being stored in the array

        //syntax
            int[] texasTemps = new int[3];
            //int[] - data type of the variable
            //texsTemps - var name
            //new int[3] - initializing new array of int's
            // [3] - length of the array being created

        //assign some values
        texasTemps[0] = 36;
        texasTemps[1] = 45;
        texasTemps[2] = 86;
        System.out.println(texasTemps[0]); // print out value of element in 0 index

        String[] texasWeather = new String[3];
        texasWeather[0] = "sunnny";
        texasWeather[1] = "rainy";
        texasWeather[2] = "cloudy";

        System.out.println(texasWeather[0]);

        //handling multiple elements at a time
            //create an array thath= holds my daily steps
            // data type of elements ? long
            //data type - array
            //name the variable that holds the array - dailySteps
            //data type of the variable (dailySteps) ? long
            // making the elements while declaring the array
            long[] dailySteps = {10000, 12000, 22000};
            //Arrays.toString() prints the array in string format
        System.out.println(Arrays.toString(dailySteps));

        // TODO: Create an array of ints and print out the array

        // HOW TO ITERATE THROUGH ARRAYS

        // //TODO: 👩🏼‍💻 Let’s create a method (sumAll) that returns the sum of all integers in an int array (nums)
        // example: array of ints:[5, 2, 3, 1] // returns: 11

        // // // PSEUDOCODE
        // 1. create a method (nums)
        // // what's the method signature? --> public static
        // // what data type (if any) is being returned from this method --> int
        //
        // 2. create an array of ints
        // // 2a. What's the length of our array? --> (5)
        // // 2b. Where does this array go? --> in sumAll method

        // 3. Assign values to the array
        // // how are we going to initialize the arrat of ints?
        // // // array literal {}
        // // // array declaration new int[]

        // 4. iterate through our elements in the array
        // // where does the iteration live? --> inside of the sumAll()
        // // how do you want to iterate?
        // // // traditional FOR loop
        // // // ** enhanced for

        // 5. create a variable to store the sum
        // // where does this variable live? --> in sumAll() --> before (outside) loop
        // // what's this variable's type (int)
        // // what's this variable's starting point?

        // 6. add logic that will add each element to itself?
        // where does this logic live?
        // int sum;
        // // [1,5,3,2]
        //  //  ** sum variable = sum + index of element **
        // // 1st iteration: sum = 0 -> sum = 0 + 1 // sum = 1;
        // // 2nd iteration: sum = 1 -> sum = 1 + 5 // sum = 6;

        // 7. return the sum;
        // // where does this return statement live? --> in sumAll() after (outside) loop

        // 8. call the method
        // // where and how do we call the method --> in PSVM
        // // sout the result of the sumAll method


        // // // TRADITIONAL FOR LOOP
//        String[] names = {"Cody", "Kenneth", "Jordy", "Laura"};
//        System.out.println(names.length);
//        for(int i = 0; i < names.length; i += 1){
//            System.out.println(names[i]);
//        }

        // // // ENHANCED FOR
        // similar to .forEach() in js

//        String[] names = {"Cody", "Kenneth", "Jordy", "Laura"};
//        System.out.println(names.length); //4
////        for (data type and name of variable : name of the array we're iterating through )
//        for(String name: names ){
//            System.out.println(name);
//        }


        // // // SOLUTION (see sumAll() method outside of main)
        // 8. call the sumAll method and print the results
//        System.out.println(sumAll());

//        String[] dogs = {"boxer", "schnauzer","poodle"};
////        dogs[3] = "chihuahua";
//        System.out.println(Arrays.toString(dogs));

        // ARRAYS CLASS

        // // ARRAYS.FILL()
//        String[] languages = {"French", "Portuguese", "Dutch"};
//        System.out.println(Arrays.toString(languages));
//        Arrays.fill(languages, "French");
//        System.out.println(Arrays.toString(languages));
//        // changing the existing/original array


        // // ARRAYS.EQUALS()
        String[] answer = {"apart", "learn", "knock"}; // 3
        String[] KenGuess = {"texas", "green", "knock"}; // 3
//        System.out.println(Arrays.equals(answer, KenGuess));
        // accepts two params
        // returns a boolean
        boolean isKenRight = Arrays.equals(answer, KenGuess);
//        System.out.println(isKenRight);


        // // ARRAYS.COPYOF()
        String[] lauraCopy = Arrays.copyOf(answer, answer.length);
//        System.out.println(Arrays.toString(lauraCopy));

        // // ARRAYS.TOSTRING()

        // // ARRAYS.SORT()
//        String[] languages = {"French", "Portuguese", "Dutch"};
//        System.out.println(Arrays.toString(languages));
//        Arrays.sort(languages);
//        System.out.println(Arrays.toString(languages));

//        int[] random = {3,12,17,4, 8};
//        System.out.println(Arrays.toString(random));
//        Arrays.sort(random);
//        System.out.println(Arrays.toString(random));


        // TWO-DIMENSIONAL ARRAYS
//        {
//            [x][x][x][x],
//            [x][x][x][x],
//            [x][x][x][x],
//            [x][x][x][x]
//        }

        int[] myArr = new int[3];

        int[][] myMatrix = {
                {4,5,9,7},
                {1,5,9,6},
                {2,2,7,4},
                {3,8,6,5}
        };

        int[][] newMatrix = new int[4][4];
        newMatrix[0][0] = 8;
        newMatrix[3][3] = 2;
        System.out.println(Arrays.deepToString(newMatrix));

//        System.out.println(Arrays.deepToString(myMatrix));

        // print out every nested element in the matrix
        // do a loop
        // do another loop
        // loop de loop

        for(int[] rows: myMatrix){
            System.out.println("------ this is a new row ----------") ;
            for(int column: rows){
                System.out.println(column);
            }
        }







        int[] warmup = {3,1,7,2,8,3,5}; // 19, 10
//
        int[] solution = warmupMethod(warmup);
//        System.out.println(Arrays.toString(solution));



    }
    public static int sumAll(){
        int[] nums = {1,5,7,3};
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        return sum;
    }

}
