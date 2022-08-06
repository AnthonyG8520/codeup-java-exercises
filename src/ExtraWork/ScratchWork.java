package ExtraWork;

import java.util.ArrayList;
import java.util.Arrays;
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


//    Given a string s consisting of lowercase English letters, find the number of consecutive triplets within s formed by unique characters.
//    In other words, count the number of indices i, such that s[i], s[i + 1], and s[i + 2] are all pairwise distinct.
//
//    Example
//
//    For s = "abcdaaae", the output should be solution(s) = 3.
//
//    For i = 0, s[0] = 'a', s[1] = 'b', and s[2] = 'c', which are pairwise distinct.
//    For i = 1, s[1] = 'b', s[2] = 'c', and s[3] = 'd', which are pairwise distinct.
//    For i = 2, s[2] = 'c', s[3] = 'd', and s[4] = 'a', which are pairwise distinct.
//    For i = 3, s[3] = 'd', s[4] = 'a', and s[5] = 'a', which are not pairwise distinct because s[4] and s[5] are equal.
//    For i = 4, s[4] = 'a', s[5] = 'a', and s[6] = 'a', which are not pairwise distinct because any two of these characters are equal.
//    For i = 5, s[5] = 'a', s[6] = 'a', and s[7] = 'e', which are not pairwise distinct because s[5] and s[6] are equal.
//    For i = 6 or i = 7, at least one of characters s[i + 1] or s[i + 2] doesn't exist.
//    For s = "abacaba", the output should be solution(s) = 2.
//
//    There are only 2 indices meeting the criteria:
//
//    i = 1: s[1] = 'b', s[2] = 'a', and s[3] = 'c'.
//    i = 3: s[3] = 'c', s[4] = 'a', and s[5] = 'b'.
//    All other triplets will contain more than one a character.
//
//    Input/Output
//
//[execution time limit] 3 seconds (java)
//
//[input] string s
//
//    A string consisting of lowercase English letters.
//
//    Guaranteed constraints:
//            1 ≤ s.length ≤ 1000.
//
//            [output] integer
//
//    The number of indices i in s, such that characters s[i], s[i + 1], and s[i + 2] all exist and are pairwise distinct.

    public static int distinct(String s){
        int count = 0;
        Character[] pairs = new Character[3];
        char[] chars = s.toCharArray();
//      loop for splitting into arrays of 3 characters
        for(int i = 0; i < chars.length; i++){
            int index = i;
            for(int x = 0; x < 3; x++){
                if(index < chars.length){
                    pairs[x] = chars[index];
                    index++;
                }
                else{
                    break;
                }
            }
//      ---------------------------------------------
//          add code for checking for repeated characters here
            boolean isDistinct = false;
            for(int c = 0; c < 3; c++){
                for(int j = c + 1; j < 3; j++){
                    if(pairs[c] != pairs[j]){
                        isDistinct = true;
                    }else{
                        isDistinct = false;
                        break;
                    }
                }
                if(!isDistinct){
                    break;
                }
            }
            if(isDistinct){
                count++;
            }
            else if(index >= chars.length){
                break;
            }
//          -------------------------
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

        System.out.println(distinct("hellotl"));


    }
}
