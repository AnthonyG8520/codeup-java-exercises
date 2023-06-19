package ExtraWork;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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


    public static int findMissingInt(int[] a) {
        boolean found = false;
        for (int i = 1;; i++) {
            found = false;
            for (int j = 0; j < a.length; j++) {
                int x = a[j];
                if (x == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
    }


    public static String breakCamelCase(String str){
        String newStr = "";
        for(int i = 0; i <= str.length() - 1; i++){
        String currentChar = str.substring(i, i+1);
            if(currentChar.equals(currentChar.toUpperCase())){
                newStr += " " + currentChar;
                continue;
            }
            newStr += currentChar;
        }


        return newStr;
    }

    public static void sumParts(ArrayList<Integer> nums){
        int listSize = nums.size();
        ArrayList<Integer> sumArr = new ArrayList<>();

        for(int i = 0; i <= listSize - 1; i++){
            int sum = 0;
            for(int num : nums){
                sum += num;
            }
            sumArr.add(sum);
            nums.remove(0);
        }

        if(nums.isEmpty()){
            sumArr.add(0);
        }

        System.out.println(sumArr);
    }

    public static String readableTime(int seconds){
        String hours = Integer.toString(seconds / 3600);
        seconds = seconds % 3600;

        String minutes = Integer.toString(seconds / 60);

        String remainingSeconds = Integer.toString(seconds % 60);

        if(parseInt(hours) < 10){
            hours = "0" + hours;
        }
        if(parseInt(minutes) < 10){
            minutes = "0" + minutes;
        }
        if(parseInt(remainingSeconds) < 10){
            remainingSeconds = "0" + remainingSeconds;
        }

        return hours + ":" + minutes + ":" + remainingSeconds;
    }


    // problem from smoothstack coding challenge
    //needs work
    public static int eval_algebraic(String expr, int val) {
        int finalVal = 0;
        expr = expr.replaceAll("\\s", "");
        String [] exp = null;

        if(expr.contains("+")){
            exp = expr.split("\\+");
            if(exp[0].startsWith("x") || exp[1].startsWith("x")){
                finalVal = -1;
            }

            if(exp[0].equals("x")){
                int firstVal = val;
                int secondVal = Integer.parseInt(exp[1]);
                finalVal = firstVal + secondVal;
            }
            else if(exp[1].equals("x")){
                int firstVal = Integer.parseInt(exp[0]);
                int secondVal = val;
                finalVal = firstVal + secondVal;
            }
            else if(exp[0].endsWith("x")){
                String num = exp[0].replaceAll("x", "");
                int firstVal = Integer.parseInt(num) * val;
                int secondVal = Integer.parseInt(exp[1]);
                finalVal = firstVal + secondVal;
            }
            else if(exp[1].endsWith("x")){
                String num = exp[1].replaceAll("x", "");
                int firstVal = Integer.parseInt(num) * val;
                int secondVal = Integer.parseInt(exp[0]);
                finalVal = firstVal + secondVal;
            }
        }
        else if(expr.contains("-")){
            exp = expr.split("-");
            if(exp[0].startsWith("x") || exp[1].startsWith("x")){
                finalVal = -1;
            }
            if(exp[0].equals("x")){
                int firstVal = val;
                int secondVal = Integer.parseInt(exp[1]);
                finalVal = firstVal - secondVal;
            }
            else if(exp[1].equals("x")){
                int firstVal = Integer.parseInt(exp[0]);
                int secondVal = val;
                finalVal = firstVal - secondVal;
            }
            else if(exp[0].endsWith("x")){
                String num = exp[0].replaceAll("x", "");
                int firstVal = Integer.parseInt(num) * val;
                int secondVal = Integer.parseInt(exp[1]);
                finalVal = firstVal - secondVal;
            }
            else if(exp[1].endsWith("x")){
                String num = exp[1].replaceAll("x", "");
                int firstVal = Integer.parseInt(num) * val;
                int secondVal = Integer.parseInt(exp[0]);
                finalVal = firstVal - secondVal;
            }
        }

        return finalVal;
    }


//  Check if can use letters in first string to create second string (take into consideration amount of each character)
    public static boolean containsSameLetters(String str1, String str2){
        boolean answer = true;
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");
        ArrayList<String> firstStr = new ArrayList<>(Arrays.asList(arr1));
        ArrayList<String> secondStr = new ArrayList<>(Arrays.asList(arr2));


        for(int i = 0; i < secondStr.size() - 1; i++){
            if(firstStr.contains(secondStr.get(i))){
                answer = true;
                firstStr.remove(secondStr.get(i));
            }else{
                answer = false;
                break;
            }
        }

        return answer;
    }

//  Another solution for the above problem
//    public static boolean containsSameLetters(String str1, String str2) {
//        if (str2.length() > str1.length()) return false;
//        for (String s: str2.split("")) {
//            if (!str1.contains(s))  return false;
//            str1 = str1.replaceFirst(s,"");
//        }
//
//        return true;
//    }


    public static String pigLatin(String str){
        String newStr = "";
        String punctToAdd = "";

        if(str.substring(str.length() - 1).matches("[!|?|.]")){
            punctToAdd = str.substring(str.length() - 1);
            str = str.substring(0, str.length() - 1);
        }

        String[] words = str.split(" ");

        for(String word : words){
            String newWord = word.substring(1) + word.charAt(0) + "ay";
            newStr += newWord + " ";
        }
        return newStr.trim() + punctToAdd;
    }

//  regex solution for above problem
//    public static String pigLatin(String str){
//        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
//    }


    // my solution
    public static int persistence(int n){
        int count = 0;
        String number = String.valueOf(n);
        ArrayList <String> numArr = new ArrayList<>(List.of(number.split("")));
        int result = parseInt(numArr.get(0));

        if(number.length() == 1){
            return 0;
        }

        for(int i = 0; i <= numArr.size(); i++){
            if(i+1 <= numArr.size() - 1){
                result *= parseInt(numArr.get(i+1));
            }
            if(i == numArr.size() - 1 && String.valueOf(result).length() != 1){
                numArr = new ArrayList<>(List.of(String.valueOf(result).split("")));
                result = parseInt(numArr.get(0));
                count++;
                i = -1;
            }else if(i == numArr.size() - 1 && String.valueOf(result).length() == 1){
                count++;
                break;
            }
        }

        return count;
    }

    //Another users solution to above problem(doesn't make sense yet)
//    public static int persistence(long n) {
//        int i = 0;
//
//        while(n >= 10) {
//            int m = 1;
//
//            while (n > 0) {
//                m *= (n % 10);
//                n /= 10;
//            }
//            n = m;
//            i += 1;
//        }
//        return i;
//    }


    public static String encode(String word){
        String wordToCheck = word.toLowerCase();
        String newStr = "";
        for(int i = 0; i < word.length(); i++){
            int count = word.length() - wordToCheck.replaceAll(String.valueOf(wordToCheck.charAt(i)), "").length();
            if(count > 1){
                newStr += ")";
            }
            else{
                newStr += "(";
            }
        }
        return newStr;
    }

    public static int romanToInt(String str){
        ArrayList<String> arrOfNumerals = new ArrayList<>(Arrays.asList("CM","CD","XC","XL","IX","IV","M","D","C","L","X","V","I"));
        ArrayList<Integer> arrOfVals = new ArrayList<>(Arrays.asList(900,400,90,40,9,4,1000,500,100,50,10,5,1));
        int amtOfLetters = 0;
        int number = 0;

        for(int i = 0; i < arrOfNumerals.size(); i++){
            String numeralToCheck = arrOfNumerals.get(i);
            if(str.contains(numeralToCheck) && numeralToCheck.length() == 1){
                amtOfLetters = str.length() - str.replaceAll(numeralToCheck,"").length();
                number += arrOfVals.get(i) * amtOfLetters;
                str = str.replaceAll(numeralToCheck, "");
            }
            else if(str.contains(numeralToCheck) && numeralToCheck.length() == 2){
                number += arrOfVals.get(i);
                str = str.replaceAll(numeralToCheck, "");
            }
        }
        return number;
    }

    public static boolean isPalindrome(String str){
        String[] arr = str.split("");
        Collections.reverse(Arrays.asList(arr));
        String reversed = String.join("", arr);

        if(str.equals(reversed)){
            return true;
        }

        return false;
    }

    public static int numberOfSteps(int num){
        int count = 0;

        while(num > 0){
            if(num % 2 == 0){
                num /= 2;
                count++;
                continue;
            }
            num -= 1;
            count++;
        }

        return count;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        //worked for most test cases
        double median = 0;
        double total = 0;

        for(int x : nums1){
            total += x;
        }
        for(int x : nums2){
            total += x;
        }

        median = total / (nums1.length + nums2.length);

        return median;
    }

    public static int addDigits(int num){
        String[] arr = String.valueOf(num).split("");
        int length = Integer.toString(num).length();
        int newNum = 0;

        while(length > 1){
            for(int i = 0; i < arr.length; i++){
                newNum += parseInt(arr[i]);
            }
            if(Integer.toString(newNum).length() == 1){
                break;
            }
            arr = String.valueOf(newNum).split("");
            length = Integer.toString(newNum).length();
            newNum = 0;
        }

        return newNum;
    }

    public static boolean checkIfExists(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == 2 * arr[j] && i != j){
                    return true;
                }
            }
        }

        return false;
    }

//    public static char findTheDifference(String s, String t){
    // this solution does not work because it removes the first string from the second all at once instead of looping through individual characters
//        char character;
//        t = t.replaceFirst(s, "");
//        character = t.charAt(0);
//        return character;
//    }

    public static char findTheDifference(String s, String t){
        for(char c : s.toCharArray()){
            t = t.replaceFirst(c+"","");
        }
        return t.charAt(0);
    }

    public static int repeatedNTimes(int[] nums){
        int repeatedNum = 0;
        ArrayList<Integer> listOfNums = new ArrayList<>();
        for(int num : nums){
            listOfNums.add(num);
        }

        for(int i = 0; i <= listOfNums.size(); i++){
            int currentNum = listOfNums.get(0);
            listOfNums.remove(0);

            if(listOfNums.contains(currentNum)){
                repeatedNum = currentNum;
                break;
            }

        }

        return repeatedNum;
    }

    //method for taking 'LocalDateTime' object and returning how many days/months/years since the entered parameter
    public static String daysSincePosted(LocalDateTime LocalDateTime){
        String dateTime = LocalDateTime.toString();

        String[] seperatedDate = dateTime.substring(0,10).split("-");

        LocalDate postDate = LocalDate.of(Integer.parseInt(seperatedDate[0]),Integer.parseInt(seperatedDate[1]),Integer.parseInt(seperatedDate[2]));

        String daysSincePosted = postDate.until(LocalDate.now()).toString();
        System.out.println(daysSincePosted);

        if(daysSincePosted.contains("Y")){
            int index = daysSincePosted.indexOf("Y");
            String digit = daysSincePosted.substring(0, index).replaceAll("[A-Z]", "");
            return (Integer.parseInt(digit) > 1) ? (digit + " years ago") : (digit + " year ago");
        }
        else if(daysSincePosted.contains("M")){
            int index = daysSincePosted.indexOf("M");
            String digit = daysSincePosted.substring(0, index).replaceAll("[A-Z]", "");
            return (Integer.parseInt(digit) > 1) ? (digit + " months ago") : (digit + " month ago");
        }

        String digit = daysSincePosted.replaceAll("[A-Z]", "");
        return (Integer.parseInt(digit) > 1) ? (digit + " days ago") : (digit + " day ago");
    }

    public static boolean isCircularSentence(String sentence){
        boolean answer = false;
        ArrayList<String> sentenceList = new ArrayList<>(Arrays.asList(sentence.split(" ")));

        if(sentenceList.size() < 2) {
            if (sentence.startsWith(String.valueOf(sentence.charAt(sentence.length() - 1)))) {
                return true;
            }
        }

            for(int i = 1; i < sentenceList.size(); i++){
                String currentWord = sentenceList.get(i);
                String previousWord = sentenceList.get(i-1);

                if(currentWord.startsWith(String.valueOf(previousWord.charAt(previousWord.length() - 1)))){
                    answer = true;
                }
                else{
                    return false;
                }
            }

            if(sentence.startsWith(String.valueOf(sentence.charAt(sentence.length() - 1)))){
                answer = true;
            }
            else{
                answer = false;
            }

        return answer;
    }

    public static int[] arrayDiff(int[] a, int[] b){
        ArrayList<Integer> originalList = new ArrayList<>();
        for(int num : a){
            originalList.add(num);
        }
        ArrayList<Integer> intsToFilterOut = new ArrayList<>();
        for(int num : b){
            intsToFilterOut.add(num);
        }

        originalList.removeAll(intsToFilterOut);

        return originalList.stream().mapToInt(e -> e).toArray();
    }

    public static int countOdds(int low, int high){
        int count = 0;
        for(int i = low; i <= high; i++){
            if(i % 2 != 0){
                count++;
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
//        nums[0] = 1;
//        nums[1] = 6;
//        nums[2] = 2;
//        nums[3] = 16;
//        nums[4] = 5;
//
//        for(boolean i : solution(nums, 1, 3)){
//            System.out.println(i);
//        }
//----------------------------------------------------------------------

//        System.out.println(distinct("hellotl"));

//        System.out.println(findMissingInt(nums));

//        System.out.println(breakCamelCase("helloWorldThere"));

//        ------------------------------------------------------------------------
//        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(0,1,3,6,10));
//        sumParts(nums);
//        ----------------------------------------------------------------------------

//        System.out.println(readableTime(359999));


//        System.out.println(eval_algebraic("3 - x", 2));

//        System.out.println(containsSameLetters("katas", "steak"));

//        System.out.println(pigLatin("look in the bag"));

//        System.out.println(persistence(25));

//        int n = 99;
//        String num = String.valueOf(n);
//
//        ArrayList<String> numArr = new ArrayList<>(List.of(num.split("")));
//
//        int t = parseInt(numArr.get(0));
//
//        System.out.println("t = " + t);
//
//        for(String x : numArr){
//            System.out.println(x);
//        }
//
//        String nums = "899";
//
//        numArr = new ArrayList<>(List.of(nums.split("")));
//
//        for(String x : numArr){
//            System.out.println(x);
//        }
//
//        System.out.println(encode("Prespecialized"));

//        System.out.println(romanToInt("LVIII"));

//        System.out.println(isPalindrome("1221"));

//        System.out.println(numberOfSteps(1563465433));

//        System.out.println(findMedianSortedArrays(new int[]{1,3}, new int[]{2,7}));

//        System.out.println(addDigits(11));

//        System.out.println(checkIfExists(new int[]{0,0}));

//        System.out.println(findTheDifference("e", "ee"));

//        System.out.println(repeatedNTimes(new int[]{8,3,2,3}));

//        System.out.println(daysSincePosted("2009-06-02 02:23:56.833680"));

//        System.out.println(isCircularSentence("Leetcode is cool"));

//        for(int num : arrayDiff(new int[]{1,2,3}, new int[]{1,2})) {
//            System.out.println(num);
//        }

//            System.out.println(countOdds(327296043,769434803));


    }
}
