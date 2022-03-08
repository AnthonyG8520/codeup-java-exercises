package groceries;

import java.util.*;

public class GroceryApp {
    public static Scanner scan = new Scanner(System.in);
    public static ArrayList<String> categories = new ArrayList<>();
    public static ArrayList<String> options = new ArrayList<>();
    public static GroceryList Beverages = new GroceryList();
    public static GroceryList Dairy = new GroceryList();
    public static GroceryList FrozenFoods = new GroceryList();
    public static GroceryList Produce = new GroceryList();

    public static void renderAll(){
        ArrayList<String> bevList = new ArrayList<>();
        ArrayList<String> dairyList = new ArrayList<>();
        ArrayList<String> ffList = new ArrayList<>();
        ArrayList<String> produceList = new ArrayList<>();

        System.out.println("Beverages:");
        for (Map.Entry<String, Integer> entry : Beverages.groceries.entrySet()) {
            bevList.add(entry.getKey() + ":" + entry.getValue());
        }Collections.sort(bevList);
        for(String item : bevList){
            System.out.println(item);
        }System.out.println();

        System.out.println("Dairy products:");
        for (Map.Entry<String, Integer> entry : Dairy.groceries.entrySet()) {
            dairyList.add(entry.getKey() + ":" + entry.getValue());
        }Collections.sort(dairyList);
        for(String item : dairyList){
            System.out.println(item);
        }System.out.println();

        System.out.println("Frozen foods:");
        for (Map.Entry<String, Integer> entry : FrozenFoods.groceries.entrySet()) {
            ffList.add(entry.getKey() + ":" + entry.getValue());
        }Collections.sort(ffList);
        for(String item : ffList){
            System.out.println(item);
        }System.out.println();

        System.out.println("Produce:");
        for (Map.Entry<String, Integer> entry : Produce.groceries.entrySet()) {
            produceList.add(entry.getKey() + ":" + entry.getValue());
        }Collections.sort(produceList);
        for(String item : produceList){
            System.out.println(item);
        }System.out.println();
    }


    public static void runGroceries(){
        System.out.print("Would you like to create a grocery list? [Y/N]");
        String answer = scan.next();
        String loopanswer = "";
        if(answer.equalsIgnoreCase("Y")){
            do {
                System.out.println("Select the number for the category you would like to add to.");
                for(String category : categories){
                    System.out.println((categories.indexOf(category) + 1) + "." + category);
                }String categorySelection = scan.next();
                switch (categorySelection) {
                    case "1":
                        Beverages.addGroceries();
                        break;
                    case "2":
                        Dairy.addGroceries();
                        break;
                    case "3":
                        FrozenFoods.addGroceries();
                        break;
                    case "4":
                        Produce.addGroceries();
                        break;
                    default:System.out.println("That entry doesn't match. Try again.");
                            runGroceries();
                }System.out.print("Add another or finish list? [Y/N]");
                loopanswer = scan.next();
            }while(loopanswer.equalsIgnoreCase("Y"));
        }else return;
        String listAnswer = "";
        do {
            System.out.println("Select the number for the option you want.");
            for (String option : options) {
                System.out.println((options.indexOf(option) + 1) + "." + option);
            }
            String optionAnswer = scan.next();
            switch (optionAnswer) {
                case "1":
                    renderAll();
                    break;
                case "2":
                    Beverages.renderList();
                    break;
                case "3":
                    Dairy.renderList();
                    break;
                case "4":
                    FrozenFoods.renderList();
                    break;
                case "5":
                    Produce.renderList();
                    break;
            }System.out.print("Would you like to see another list? [Y/N]");
            listAnswer = scan.next();
        }while(listAnswer.equalsIgnoreCase("Y"));
    }

    public static void main(String[] args) {
        categories.addAll(Arrays.asList("Beverages", "Dairy", "Frozen Foods", "Produce"));
        options.addAll(Arrays.asList("See full grocery list", "See beverages list", "See dairy list", "See frozen food list", "See produce list"));




        runGroceries();







    }
}
