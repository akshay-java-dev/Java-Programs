import java.util.HashMap;

class Course {
    int id;
    String name;

    Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " - " + name);
    }
}

public class CourseManagement {
    public static void main(String[] args) {

        HashMap<Integer, Course> courses = new HashMap<>();

        courses.put(101, new Course(101, "Java"));
        courses.put(102, new Course(102, "Spring Boot"));
        courses.put(103, new Course(103, "Python"));

        for (Course course : courses.values()) {
            course.display();
        }
    }
}
