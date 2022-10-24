public class main {
    public static void main(String[] args) {
        Student s1 = new Student("Pamela Buckley", "12 Main Street Greensboro, NC 27358 ");
        s1.addCourseGrade("CSC 120 is", 97);
        s1.addCourseGrade("CSC 230 is", 86);
        s1.printGrades();
        System.out.printf("Average is %.2f\n" , s1.getAverageGrade());
        System.out.println();

        Student s2 = new Student("Harumi Kaneda", "101 Park Lane, Apt. 203 High Point, NC 27265 ");
        s2.addCourseGrade("CSC 230 is", 71);
        s2.addCourseGrade("CSC 330 is", 74);
        s2.addCourseGrade("CSC 407 is", 84);
        s2.addCourseGrade("CSC 420 is", 77);
        s2.printGrades();
        System.out.printf("Average is %.2f\n" , s2.getAverageGrade());
        System.out.println();

        Teacher t1 = new Teacher("Mike Jones", "219 Day Break Drive, Kernersville, NC, 27284");
        System.out.println(t1);
        System.out.println("\nCourse add");
        String[] courses = {"CSC 339", "CSC 362", "CSC 362", "CSC 425"};
        for (String course: courses) {
            if (t1.addCourse(course)) {
                System.out.println(course + " added");
            } else {
                System.out.println(course + " is a duplicate");
            }
        }

        System.out.println("\nCourse remove");
        for (String course: courses) {
            if (t1.removeCourse(course)) {
                System.out.println(course + " removed");
            } else {
                System.out.println(course + " cannot be removed");
            }
        }

    }
}
