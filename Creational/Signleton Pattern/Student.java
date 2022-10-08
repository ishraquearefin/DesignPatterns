public class Student {
    public static void main(String[] args) {
        CourseName course = CourseName.getInstance();
        course.setName("Biology");
        System.out.println("Course Name for First Instance "+course.getName());

        CourseName newCourse = CourseName.getInstance();
        System.out.println("Course Name for Second Instance "+course.getName());

    }

}
