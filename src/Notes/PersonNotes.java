package Notes;

public class PersonNotes {
    //This blueprint has these PROPERTIES:
    //First: Two STRING datatypes representing names
    public String firstName;
    public String lastName;
    //Extra examples: More fields for a Person to have when instantiated (created)
    private int age;
    public String relationship;

    public int shareAge(){
        return this.age;
    }

    //Properties can also be METHODS, e.g.:
    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    //I don't have to just use the default constructor new Class(); - I can set up my OWN :D
//    public Person(){
//        System.out.println("A new person object has been instantiated");
//    }
    //Let's make that a more real-world-ish example: Users only provide us a firstName and lastName on registration, but not an age or relationship
    public PersonNotes(String firstName, String lastName){
        // Inside of our constructor. . default for age and relationship vs. taking it in as an argument
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
        this.relationship = "undefined";
    }
    //Now, our user has registered and we want to create an object with all of the potential fields

//    public Person(String firstName, String lastName, int age, String relationship){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//        this.relationship = relationship;
//    }

    //Refactor of above constructor: Utilizing the this() method constructor call
    public PersonNotes(String firstName, String lastName, int age, String relationship){
        this(firstName, lastName); //<<<
        this.age = age;
        this.relationship = relationship;
    }


    //That means, we could have a completely seperate constructor as a default:
    public PersonNotes(){
        //default things
    }

    public static void main(String[] args) {
//        //Created an INSTANCE of a person:
//        Person kenneth = new Person();
//        //Filled in the properties with values:
//        kenneth.firstName = "Kenneth";
//        kenneth.lastName = "Howell";
//        kenneth.age = 34;
//        kenneth.relationship = "taken";
//
//        //See the results from our object and our values that we put into the properties:
//        System.out.println("kenneth.firstName = " + kenneth.firstName);
//        System.out.println("kenneth.lastName = " + kenneth.lastName);
//        System.out.println("kenneth.age = " + kenneth.age);
//        System.out.println("kenneth.relationship = " + kenneth.relationship);
//        System.out.println(kenneth.sayHello());
//        //Adding in a new line of white space:
//        System.out.println();
//        //To close the conversation, let's make another instance of a Person:
//        Person cody = new Person();
//
//        cody.firstName = "Cody";
//        cody.lastName = "Hastings";
//
//        System.out.println("cody.firstName = " + cody.firstName);
//        System.out.println("cody.lastName = " + cody.lastName);
//        System.out.println(cody.sayHello());
//        System.out.println();
//
//        //Note: We did NOT try to spin off our own version of MATH. .
//        //No Math kennethMath = new Math(); instead we access the class.StaticField directly
//        System.out.println("Math.PI = " + Math.PI);
//
//        //Compare and contrast:
//        //Need to make an INSTANCE to use a Scanner.  .
//        Scanner mcScannerFace = new Scanner(System.in);
//
//        //Call the instance to use:
//        mcScannerFace.nextLine();

        //Constructor overloading:
        //Scenario 1: User registers with only 2 pieces of info
        //Before: We were using our default constructor and assigning all fields manually. . .
//        Person newUser = new Person();
//        newUser.firstName = "myName";
        //etc.

        //Now:
        PersonNotes newUser = new PersonNotes("Bugs", "Bunny");

        System.out.println(newUser.sayHello());
        System.out.println("newUser.age = " + newUser.age);
        System.out.println("newUser.relationship = " + newUser.relationship);

        //Example 2: User provides use all four pieces of information to instantiate a 'Person'
        PersonNotes newerUser = new PersonNotes("Daffy", "Duck", 90, "complicated");

        System.out.println();
        System.out.println(newerUser.sayHello());
        System.out.println("newerUser.age = " + newerUser.age);
        System.out.println("newerUser.relationship = " + newerUser.relationship);


    }



}