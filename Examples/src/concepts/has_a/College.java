package concepts.has_a;

public class College {
   private String collegeName;
   private  String CollegeLocation;

    public College(String collegeName, String collegeLocation) {
        this.collegeName = collegeName;
        this.CollegeLocation = collegeLocation;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getCollegeLocation() {
        return CollegeLocation;
    }
}
