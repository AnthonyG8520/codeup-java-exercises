package ExtraWork;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

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

    public static void fixString(String str){
        String [] arrOfStr = str.split(" ");
        String [] newarr = new String[arrOfStr.length];
        for(String word : arrOfStr){
            int position = parseInt(word.replaceAll("[^\\d]", ""));
            newarr[position] = word;
        }
        String newString = "";
        for(String word : newarr){
            newString += word + " ";
        }
        System.out.println(newString);
    }



//        You are given an array of integers numbers and two integers left and right.
//        You task is to calculate a boolean array result,
//        where result[i] = true if there exists an integer x,
//        such that numbers[i] = (i + 1) * x and left ≤ x ≤ right. Otherwise, result[i] should be set to false.

    public static boolean[] solution(int[] numbers, int left, int right) {
        boolean[] result = new boolean[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            for(int x = left; x <= right; x++){
                if(numbers[i] == ((i+1) * x) && x >= left && x <= right){
                    result[i] = true;
                    break;
                }
                else{
                    result[i] = false;
                }
            }
        }
        return result;
    }


    public static int distinct(String s){
        int count = 0;
//        String[] chars = new String[s.length()];
        char[] pairs = new char[3];
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){
            int index = i;
            for(int x = 0; x < 3; x++){
                pairs[x] = chars[index];
                index++;
            }
            for(char pair : pairs){
                System.out.println(pair);
            }
        }


        return count;
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

//        fixString("the1re ma2n hell0o");


//--------------------------------------------------------------------
//        int[] nums = new int[5];
//        nums[0] = 8;
//        nums[1] = 6;
//        nums[2] = 6;
//        nums[3] = 16;
//        nums[4] = 5;
//
//        for(boolean i : solution(nums, 1, 3)){
//            System.out.println(i);
//        }
//----------------------------------------------------------------------

        distinct("hellooo");


    }
}
