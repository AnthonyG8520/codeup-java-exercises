package Notes;

public class StringsNotes {
    public static void main(String[] args) {
        //STRINGS
//        //object
//        String myName = "Ant";
//        String otherName = "Ant";
        // use .equals() when comparing strings not (==) -> this compares objects not string values
//        if(myName.equals(otherName)){
//            System.out.println("names match");
//        }
        // immutable --> the value cannot change
//            String greeting = "Hello";
        //reassignment of greeting
//            greeting = greeting + " there!";
//        System.out.println(greeting); // prints "Hello there!"
        //value of greeting is not changing but a new string object is actually being created

        //String manipulation
        String sentence = "The quick brown fox jumped over the lazy dog.";
        //CharAt(int index) --> find a character at a given index
//        System.out.println(sentence.charAt(0)); //returns "T"
//        char findingChar = sentence.charAt(8); // returns "k"
//        System.out.println(findingChar);

        //.indexOf(String substring) --> returns the index at which the substring entered starts
//        System.out.println(sentence.indexOf("quick")); //returns 4
//        int indOf = sentence.indexOf("j"); // must use int because the method returns an int
//        System.out.println(indOf);

        //.lastIndexOf() returns an int of the last index of the entered character
//        System.out.println(sentence.lastIndexOf("a"));

        //.length return the length of the string STARTING AT 1 NOT 0 -- doesn't accept parameters and returns an int
//        System.out.println(sentence.length());

        //.replace(String to be replaced, string replacement) --> replaces
//        System.out.println(sentence.replace("quick", "quik"));

        //.substring(int begin index, int end index) --> returns a substring when given an index to start and end
//        System.out.println(sentence.substring(5,10)); //includes char at first index but excludes char at last index


    }
}
