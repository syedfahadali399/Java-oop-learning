package labsession4;

class Courses {

    private String courseName;
    private int courseId;
    protected int credits;
    
    public Courses(String courseName, int courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.credits = 0;
    }
    
    public Courses(String courseName, int courseId, int credits) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.credits = courseId;
    }

    public String getCourseName() {
        return courseName;
    }
    
    public int getCourseID() {
        return courseId;
    }
    
    public int getCredits() {
        return credits;
    }

    public String getDetails() {
        return "Course Name: " + courseName + ", ID: " + courseId;
    }
}

class Instructor extends Courses {

    private String instructorName;
    protected String department;

    public Instructor(String instructorName, String deparment) {
        super("", 0);
        this.instructorName = instructorName;
        this.department = deparment;
    }

    public Instructor(String instructorName, String deparment, Courses course) {
        super(course.getCourseName(), course.getCourseID(), course.getCredits());
        this.instructorName = instructorName;
        this.department = deparment;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getDetails() {
        return "Instructor: " + instructorName + ", Department: " + department;
    }
}

public class task3 {
    public static void main(String[] args) {
        
        Courses course1 = new Courses("Mathematics", 101);
        Courses course2 = new Courses("Physics", 102, 3);

        Instructor instructor1 = new Instructor("Dr. Smith", "Math Department");
        Instructor instructor2 = new Instructor("Dr. Johnson", "Physics Department");
        
        System.out.println(course1.getDetails());
        System.out.println(course2.getDetails());
        System.out.println(instructor1.getDetails());
        System.out.println(instructor2.getDetails());

    }
}