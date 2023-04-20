public class Student
{
    private String name;
    private int gradeLevel;
    private String school;

    /* Write the two constructors here, as described above */
    public Student(String n, int g, String s) {
        name = n;
        gradeLevel = g;
        school = s;
    }

    public Student(String n, int g) {
        name = n;
        gradeLevel = g;
        if (gradeLevel >= 9) {
            school = "high school";
        }
        else if (gradeLevel >= 6) {
            school = "middle school";
        }
        else {
            school = "elementary school";
        }
    }

    public String toString()
    {
        /* implement me, as described above */
        return name + " is in grade " + gradeLevel + " and goes to " + school;
    }
}
