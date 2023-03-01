public class Teacher {
    private Name name;
    private String ic;
    private String address;
    private int yearsOfExperience;
    private String qualifications;
    private StudentBatch studentBatch;

    public Teacher(Name name, String ic, String address, int yearsOfExperience, String qualifications) {
        this.name = name;
        this.ic = ic;
        this.address = address;
        this.yearsOfExperience = yearsOfExperience;
        this.qualifications = qualifications;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public void setStudentBatch(StudentBatch studentBatch) {
        this.studentBatch = studentBatch;
    }

    public StudentBatch getStudentBatch() {
        return studentBatch;
    }
}
