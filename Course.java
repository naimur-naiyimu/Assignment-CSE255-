import java.util.ArrayList;

public class Course {
    private String name;
    private String courseCode;
    public static int enrolledCount = 0;
    private static ArrayList<Course> enrolledList = new ArrayList<>();

    public Course(String name, String courseCode) {
        this.name = name;
        this.courseCode = courseCode;
        enrolledCount++;
        enrolledList.add(this);
    }

    public String getInfo() {
        return "Name: " + name + "\n" +
               "Course: " + courseCode;
    }

    public static void showEnrolledList() {
        for (int i = 0; i < enrolledList.size(); i++) {
            Course c = enrolledList.get(i);
            System.out.println("Student " + (i + 1) + ":");
            System.out.println(c.getInfo());
        }
    }
} 