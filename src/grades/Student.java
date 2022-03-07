package grades;
import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    String name;
    ArrayList<Integer> grades;
    HashMap<String,String> attendance;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    //adds attendance record to student
    public void recordAttendance(String date, String value){
        this.attendance.put(date,value);
    }

    //gets attendance average
    public double attendAverage(){
        int totalDays = this.attendance.size();
        int absences = 0;
        for(String val : this.attendance.values()){
            if(val.equalsIgnoreCase("A")){
                System.out.println(absences);
                absences++;
                System.out.println(absences);
            }else;
        }
        double average = (totalDays - absences) / totalDays;
        return average;
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public static double getGradeAverage(Student x){
        Integer gradeTotal = 0;
        for(Integer grade : x.grades){
            gradeTotal += grade;
        }
        return gradeTotal / x.grades.size();
    }

    public static void main(String[] args) {
        Student Ant = new Student("Anthony");

        Ant.addGrade(91);
        Ant.addGrade(25);
        Ant.addGrade(89);

        System.out.println(Ant.getName());

        System.out.println(getGradeAverage(Ant));

        System.out.println(Ant.grades);
    }

}
