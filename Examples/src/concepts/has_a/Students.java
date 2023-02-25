package concepts.has_a;

public class Students {

    private int studentId;
    private String studentName;
    private College college;

    public Students(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    public void displayStudent(){
        System.out.println("Student Id: "+ studentId);
        System.out.println("Student Name: "+ studentName);
        System.out.println("Student CollegeName: "+ college.collegeName);
        System.out.println("Student CollegeLocation: "+ college.CollegeLocation);
    }
}
