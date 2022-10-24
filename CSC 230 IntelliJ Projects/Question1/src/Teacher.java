import java.util.ArrayList;

public class Teacher extends Person {
    private int numCourses = 0;
    private ArrayList<String> courses = new ArrayList<>();

    public Teacher() {

    }

    public Teacher(String name, String address) {
        super(name, address);
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }

    public boolean addCourse(String course) {
        if (courses.contains(course) == false && numCourses <= 4) {
            courses.add(course);
            numCourses++;
            return true;
        }

        return false;
    }

    public boolean removeCourse(String course) {

        if (courses.contains(course) == true) {
            courses.remove(course);
            return true;
        }

        return false;
    }


}
