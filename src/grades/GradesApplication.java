package grades;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import static grades.Student.getGradeAverage;

public class GradesApplication {
    public static HashMap<String,Student> students = new HashMap<>();
    public static Scanner scan = new Scanner(System.in);
    public static String userInput;

    public static void getInfo(Student x){
        System.out.println("Name: " + x.name + " -- " + "Github username: " + userInput);
        System.out.println("Current average: " + getGradeAverage(x));
        x.attendAverage();
        x.daysAbsent();
    }

    public static void studentReport(){
        String cont = "";
        System.out.println("Welcome!\nStudents:");
        System.out.println(students.keySet());
        System.out.print("Choose a student to see more info.");
        userInput = scan.next();

//        this code block hardcodes the students that can be searched
//            switch(userInput){
//                case "mushy-bee":
//                    getInfo(students.get(userInput));
//                    break;
//                case "wicked-jar":
//                    getInfo(students.get(userInput));
//                    break;
//                case "groovy-bear":
//                    getInfo(students.get(userInput));
//                    break;
//                case "mushy-sponge":
//                    getInfo(students.get(userInput));
//                    break;
//                default:
//                    System.out.println("That entry doesn't match anyhing.");
//            }

//        This code block does not restrict to students only contained in the switch case
            if(students.containsKey(userInput)){
                getInfo(students.get(userInput));
            } else{
                System.out.println("That entry doesn't match anything");
            }

            System.out.print("Would you like to search another student? [Yes/No]");
            cont = scan.next();
            if(cont.equalsIgnoreCase("yes")){
                studentReport();
            }
    }





    public static void main(String[] args) {

        Student stu1 = new Student("Anthony");
        Student stu2 = new Student("Ant");
        Student stu3 = new Student("tony");
        Student stu4 = new Student("Anty");
        Student stu5 = new Student("antony");

        stu1.grades.addAll(Arrays.asList(30, 90, 70));
        stu2.grades.addAll(Arrays.asList(25, 68, 94));
        stu3.grades.addAll(Arrays.asList(93, 58, 80));
        stu4.grades.addAll(Arrays.asList(79, 53, 100));
        stu5.grades.addAll(Arrays.asList(80, 23, 89));

        students.put("mushy-bee", stu1);
        students.put("wicked-jar", stu2);
        students.put("groovy-bear", stu3);
        students.put("mushy-sponge", stu4);
        students.put("big-cheese", stu5);

        stu1.recordAttendance("12/20", "A");
        stu1.recordAttendance("12/21", "P");
        stu1.recordAttendance("12/24", "A");
        stu1.recordAttendance("12/27", "P");

        studentReport();








    }
}
