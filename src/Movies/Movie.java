package Movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

    public void changeName(String newName){
        this.name = newName;
    }

    public String getName(){
        return this.name;
    }

    public void changeCategory(String newcategory){
        this.category = newcategory;
    }

    public String getCategory(){
        return this.category;
    }

    public static void findMovie(){

    }

}
