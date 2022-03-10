package Notes.fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fileIONotes {

    public static void printPoem(Path filePath) throws IOException {
        System.out.println();
        List<String> fileContents = Files.readAllLines(filePath); //We need List as .readAllLines returns List datatype
        for (int i = 0; i < fileContents.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
        }
    }

    public static void main(String[] args) throws IOException {
        //Paths class = static methods to obtain filepaths (Path class)
        //Path interface = abstracts away differences between Win && MacOS [vs. trying to do everything with strings]
        //Files class - Files.methods() for manipulating / interacting with files ^ utilizing paths above
        //File class object{} representation of a file

        //Okay - so I've seen an absolute path and a relative path, how do I start working with them in this File IO concept we're discussing?
        //Let's go declare and initialize a 'Path' datatype for the first time:
        //We've declared and initialized thing before . .
        String myString = "This string";

        //Now we're doing it with a 'Path' datatype and the result of Paths.get :D
        Path pathToPoem = Paths.get("src/Notes/fileIO/wcw.txt");

        System.out.println("pathToPoem = " + pathToPoem);

        //We can call the Files helper class - we ask it "Hey, Files class, at this PATH did you find a file that exists? True or false"
        System.out.println("Files.exists(pathToPoem) = " + Files.exists(pathToPoem));

        printPoem(pathToPoem);

        //Alright - looks good, I can get to an existing file with some of these new classes in interesting ways. What if I wanted to create a file and a directory/path to that file?
        //First: A string representing where I want a directory to go
        String directory = "./src/Notes/fileIO/data";
        //Second: how a about a string representing the name of the file as I would like it?
        String fileName = "groceryList.txt";

        Path dataDirectory = Paths.get(directory); //Path-ify that String with the directory!
        Path dataDirectoryAndFile = Paths.get(directory, fileName); //Combining both Strings into one 'Path'!

        System.out.println();
//        System.out.println("dataDirectory = " + dataDirectory);
//        System.out.println("dataDirectoryAndFile = " + dataDirectoryAndFile);

//        if(Files.notExists(dataDirectory)){
//            Files.createDirectories(dataDirectory);
//        }

        if (Files.notExists(dataDirectoryAndFile)) {
            Files.createDirectories(dataDirectory);

            Files.createFile(dataDirectoryAndFile);
        }

        //File IO part 3 - okay, I've gotten to something that exists, I've created directories and files that did not exist, now how do I manipulate what is INSIDE of a file?
        System.out.println("dataDirectoryAndFile = " + dataDirectoryAndFile);

        //First let's set up something we want to WRITE into our text file - how about some groceries we need?
        List<String> groceryList = Arrays.asList("coffee", "cat food", "roast beef", "carrots", "potatoes", "onions", "bread");

        System.out.println("groceryList = " + groceryList);

        Files.write(dataDirectoryAndFile, groceryList);

        //Okay - let's do one that's just an UPDATE
        List<String> forgotAGrocery = Arrays.asList("muenster cheese", "gouda cheese", "colby jack cheese");

        Files.write(dataDirectoryAndFile, forgotAGrocery, StandardOpenOption.APPEND);

        //Alright - we've updated the text file with various Strings of information - how do I get that back out of the text file??
        List<String> printGroceryList = Files.readAllLines(dataDirectoryAndFile);

        System.out.println();
        System.out.println("printGroceryList = " + printGroceryList);
        for (int i = 0; i < printGroceryList.size(); i++) {
            System.out.println((i + 1) + " : " + printGroceryList.get(i));

        }
//Let's do a more complicated example - replacing a found element with a new element!
        //First: Let's get the grocery list from the text file as it exists now
        List<String> printGroceryList2 = Files.readAllLines(dataDirectoryAndFile);
        //Second: Let's set up a second array list to hold the updated list we want to write to the text file
        List<String> newList = new ArrayList<>();


        //In English : Look inside of ONE LINE from ALL OF THESE LINES I got from my text file
        for (String line : printGroceryList2) {

            if (line.equalsIgnoreCase("gouda cheese")) {
                newList.add("vegan cheese");
                continue;
            }

            newList.add(line);

        }

        System.out.println("printGroceryList2 = " + printGroceryList2);
        System.out.println("newList = " + newList);
        printGroceryList2 = newList;
        System.out.println("printGroceryList2 (overwrite experiment) = " + printGroceryList2);

        Files.write(dataDirectoryAndFile, newList);
    }
}