package Notes;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, String> authorsBooks = new java.util.HashMap<>();

        authorsBooks.put("Kurt Vonnegut", "Cat's Cradle");
        authorsBooks.put("J.D. Salinger", "Franny and Zooey");

        //So - let's .get some keys and see their values
        System.out.println("authorsBooks.get(\"Kurt Vonnegut\") = " + authorsBooks.get("Kurt Vonnegut"));
        System.out.println("authorsBooks.get(\"Isaac Asimov\") = " + authorsBooks.get("Isaac Asimov"));

        //What if I didn't WANT null
        System.out.println("authorsBooks.getOrDefault(\"Isaac Asimov\", \"No book found for author\") = " + authorsBooks.getOrDefault("Isaac Asimov", "No book found for author"));

        //Well, how do I find if the key is in my HashMap?
        System.out.println("authorsBooks.containsKey(\"Isaac Asimov\") = " + authorsBooks.containsKey("Isaac Asimov"));
        System.out.println("authorsBooks.containsKey(\"Kurt Vonnegut\") = " + authorsBooks.containsKey("Kurt Vonnegut"));

        //Mo' methods, mo' problems
        //The situation: What if I don't want to override the key-value pair?
        authorsBooks.put("Kurt Vonnegut", "Slaughterhouse Five");
        //Instead of put - let's use PUT IF ABSENT
        authorsBooks.putIfAbsent("Kurt Vonnegut", "Welcome to The Monkey House");


        //Woops - someone added a controversial book :O Yikes! Let's use remove to avoid any problems. . .
        authorsBooks.put("Karl Marx", "The Communist Manifesto");
        authorsBooks.remove("Karl Marx");



        //Aight - that's ALL GRAVY, what if I wanted to just replace something without having to go through the entire put method?
        authorsBooks.replace("J.D. Salinger", "Nine Stories");

        System.out.println("authorsBooks = " + authorsBooks);
        System.out.println("Let's empty this HashMap Out!");
        authorsBooks.clear();
        System.out.println("authorsBooks = " + authorsBooks);
        System.out.println("authorsBooks.isEmpty() = " + authorsBooks.isEmpty());

    }


}