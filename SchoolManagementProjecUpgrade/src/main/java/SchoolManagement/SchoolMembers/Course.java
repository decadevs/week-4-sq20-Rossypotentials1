package SchoolManagement.SchoolMembers;

public class Course {
    private String name;
    private  int creditUnit;
    private int score;

    public Course(String name, int creditUnit, int score) {
        this.name = name;
        this.creditUnit = creditUnit;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditUnit() {
        return creditUnit;
    }

    public void setCreditUnit(int creditUnit) {
        this.creditUnit = creditUnit;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
