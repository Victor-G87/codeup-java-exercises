package grades;


import java.util.ArrayList;

public class Student {

    private String name;

    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public ArrayList<Integer> getGrades(){
        return this.grades;
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
    public double getGradeAverage(){
        double list = 0;
        for(int grade : grades){
            list+=grade;
        }
        return list/(grades.size());
    }

    public static void main(String[] args){

        Student jan = new Student("jan");

        Student victor = new Student("victor");

        Student eric = new Student("eric");

        Student sam = new Student("sam");

    }
}






