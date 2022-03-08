package groceries;

import java.util.*;

public class GroceryList {
    HashMap<String, Integer> groceries;
    Scanner scan = new Scanner(System.in);

    public GroceryList(){
        groceries = new HashMap<>();
    }

    public void addGroceries(){
        System.out.print("What would you like to add?");
        String item = scan.nextLine();
        System.out.print("How many?");
        int amount = scan.nextInt(); scan.nextLine();
        this.groceries.put(item,amount);
    }

    public void renderList(){
        for (Map.Entry<String, Integer> entry : this.groceries.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }



}
