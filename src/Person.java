public class Person {
    private String name;

    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println(String.format("Hello from %s!", name));
    }

    public static void main(String[] args) {
        Person user = new Person();
        user.setName("Ant");
        System.out.println(user.name);

        System.out.println(user.getName());

        user.sayHello();
    }
}
