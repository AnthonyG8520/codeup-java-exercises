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




    public static void main(String[] args) {
//
//    fizzBuzz();
//
//    sumOfNums(20);




    }
}
