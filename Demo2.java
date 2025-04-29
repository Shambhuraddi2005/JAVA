class StudentCourse {
    String course;
    int marks;

    StudentCourse(String course, int marks) {
        this.course = course;
        this.marks = marks;
    }

    void display() {
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
    }

}

public class Demo2 {

    public static void main(String[] args) {

        StudentCourse s1 = new StudentCourse("DevOps", 100);
        s1.display();

    }

}