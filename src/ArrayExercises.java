import java.util.Arrays;


public class ArrayExercises {
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

        Person man = new Person("ant");

        System.out.println(addPerson(users, man));




    }

    public static Person[] addPerson(Person[] arr, Person obj){
        Person[] newarr = Arrays.copyOf(arr, arr.length + 1);
        newarr[newarr.length -1] = obj;
        return newarr;
    }
}
