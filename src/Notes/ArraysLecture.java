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

        //iterating through arrays


        //traditional FOR
//            String[] names = {"cody", "Kenneth", "jordy"};
//            System.out.println(names.length);
//            for(int i = 0; i < names.length; i++){
//                System.out.println(names[i]);
//            }


        //enhanced FOR
            //similar to .forEach() is js
        //for(data type and name of variable : name of the array we're iterating)
            String[] names = {"cody", "Kenneth", "jordy"};
            System.out.println(names.length);
            for(String name : names){
                System.out.println(name);
            }

        System.out.println(sumAll());

        //ARRAYS CLASS

            // arrays.fill()
            // changing the existing/original array
                String[] languages = {"french", "english", "Dutch"};
                System.out.println(Arrays.toString(languages));
                Arrays.fill(languages, "french");
                System.out.println(Arrays.toString(languages));

            //arrays.equals()







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
