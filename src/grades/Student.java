package grades;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
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

    //shows the dates a student was absent
    public void daysAbsent(){
        String absences = "";
        for(String day : this.attendance.keySet()){
            if(attendance.get(day).equalsIgnoreCase("A")){
                absences += day + ", ";
            }
        }System.out.println("Absences:" + absences);
    }

    //adds attendance record to student
    public void recordAttendance(String date, String value){
        this.attendance.put(date,value);
    }

    //gets attendance average
    public void attendAverage(){
        double totalDays = this.attendance.size();
        double absences = 0;
        if(this.attendance.isEmpty()){
            System.out.println("Attendance average: No attendance info for this student.");
            return;
        }
        for(String val : this.attendance.values()){
            if(val.equalsIgnoreCase("A")) {
                absences++;
            }
        }double average = (totalDays - absences) / totalDays * 100;
        System.out.println("Attendance average: " + average + "%");
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
