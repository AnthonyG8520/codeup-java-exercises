import java.util.Arrays;


public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] users = new Person[3];
        users[0] = new Person("p1");
        users[1] = new Person("p2");
        users[2] = new Person("p3");

        for(Person user : users){
            System.out.println(user.getName());
        }


        Person man = new Person("p4");
        System.out.println(Arrays.toString(addPerson(users, man)));




    }//end of main method

    public static Person[] addPerson(Person[] arr, Person obj){
        String names = "";
        Person[] newarr = Arrays.copyOf(arr, arr.length + 1);
        newarr[newarr.length -1] = obj;
        for(Person person : newarr){
            names += "\n" + person.getName();
        }
        System.out.println(names);
        return newarr;
    }


}
