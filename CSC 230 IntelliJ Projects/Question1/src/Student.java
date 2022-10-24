import java.util.ArrayList;

public class Student extends Person {
    private int numCourses = 0;
    private ArrayList<String> courses = new ArrayList<>();
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student() {

    }

    public Student(String name, String address) {
        super(name, address);
        setAddress(address);

        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    public void addCourseGrade(String course, int grade) {
        if (courses.size() < 4) {
            courses.add(course);
            grades.add(grade);
        }
    }

    public void printGrades() {
        for (int i = 0; i < courses.size() && i < grades.size(); i++) {
            System.out.println(courses.get(i) + " " + grades.get(i));
        }

        System.out.println();
    }

    public double getAverageGrade() {
        double sum = 0;

        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }

        numCourses = grades.size();

        return sum / numCourses;
    }


}
