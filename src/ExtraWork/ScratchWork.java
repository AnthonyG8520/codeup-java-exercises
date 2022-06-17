package ExtraWork;

import java.util.ArrayList;
import java.util.List;

public class ScratchWork {

    public static void sumOfNums(int x){
        ArrayList<Integer> nums = new ArrayList<>();
        int total = 0;
        for(int i = 1; i < x ; i++){
            if(i % 5 == 0 || i % 3 == 0){
                nums.add(i);
                total += i;
            }
        }
        System.out.println(nums);
        System.out.println(total);
    }

    public static void fizzBuzz(){
        for (int i = 1; i <= 100; i++){
            if(i % 5 == 0 && i % 3 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else{
                System.out.println(i);
            }
        }
    }

    public static void sameEnding(String str, String ending){
        //below only works if str is as long as or longer then ending
//        int endStrLength = ending.length();
//        int strLength = str.length();
//
//        int cutBeginningAmt = strLength - endStrLength;
//
//        String endToMatch = str.substring(cutBeginningAmt);
//
//        System.out.println(endToMatch);
//
//        System.out.println(endToMatch.equals(ending));

        System.out.println(str.endsWith(ending));
    }

    public static void countDivisors(int x){
        int numOfDivisors = 0;
        for(int i = 1; i <= x; i++){
            if(x % i == 0){
                System.out.println("divisor " + i);
                numOfDivisors++;
                System.out.println("amt divisors " + numOfDivisors);
            }
        }
    }

    public static void noFives(int lowNum, int highNum){
        int count = 0;
        for(int i = lowNum; i <= highNum; i++){
            if(!Integer.toString(i).contains("5")){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void findUnique(double[] arr){
        double unique = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if (arr[j] != arr[i]){
                    unique = arr[j];
                    break;
                }
            }
        }
        System.out.println(unique);
    }




    public static void main(String[] args) {

//        fizzBuzz();
//
//        sumOfNums(20);
//
//        countDivisors(30);

//        sameEnding("this", "fails");

//        noFives(4,17);

//        findUnique(new double[]{1, 1, 1, 2, 1, 1, 1, 1});





    }
}
