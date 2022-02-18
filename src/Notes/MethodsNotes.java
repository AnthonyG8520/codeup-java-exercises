//package Notes;
//
//import java.util.Scanner;
//
//public class MethodsNotes {
//    public static void main(String[] args) { //main method always run (entry to program)
////        sayHi();
////        System.out.println(sayHello("ant"));
////        System.out.println(addNums(1,4));
////        System.out.println(helloUser());
////        System.out.println(addNum());
//    }
//    //-----------------------------------------------------------------------------
//
//    public static void sayHi(){
//        System.out.println("Hi");
//    }
//    //sayHi - the name of our method
//    //public - the specific method can be accessed in other packages and classes
//    //static - not declaring specific primitive type
//    //void - return type - set by data type expecting to be returned- void means no return
//
//    public static String sayHello(String name){
//        return "Hello" + name;
//    }
//
//    public static int addNums(int num1, int num2){
//        int solution = num1 + num2;
//        return solution;
//    }
//    public static String helloUser(){
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter a name:");
//        String input = scan.next();
//        return "Hello, " + input;
//    }
//
////    public static int addNum(){
////        Scanner scan = new Scanner(System.in);
////        System.out.print("Enter 2 numbers:");
////        int input1 = scan.nextInt();
////        int input2 = scan.nextInt();
////        int solution = input1 + input2;
////        return solution;
////    }
//
//    //METHOD OVERLOADING
//    // version 1
//    public static void sayHello(int times) {
//        for (int i = 0; i < times; i += 1) {
//            sayHello();
//        }
//    }
//    // version 2
//    public static void sayHello() {
//        sayHello("Hello", "World");
//    }
//    // version 3
//    public static void sayHello(String name) {
//        sayHello("Hello", name);
//    }
//    // version 4
//    public static void sayHello(String greeting, String name) {
//        System.out.println(greeting + ", " + name + "!");
//    }
//    //------------------------------------------------------------
//
//    //addnum overloaded instead of 2 methods
//    public static int addNum(){
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter 2 numbers:");
//        int input1 = scan.nextInt();
//        int input2 = scan.nextInt();
//        int solution = input1 + input2;
//        return solution;
//    }
//    public static int addNum(int num1, int num2){
//        int solution = num1 + num2;
//        return solution;
//    }
//    //-------------------------------------------------------------------------
//
//    //RECURSION -- calling a method inside itself
//    // THIS WILL CAUSE INFINITE LOOP needs break/stopping point
//    public static void sayHello(){
//        sayHello();
//    }
//
//
//    public static void count(int n) {
//        if (n <= 0) {
//            System.out.println("All done!");
//            return; // exits
//        }
//        System.out.println(n); // prints 5
//        count(n - 1); // count decrementing and calling method (starting it over)
//    }




//}
