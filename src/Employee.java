public class Employee {
    // instance variable(s)
    private String firstName, lastName;
    private int id;
    private static int idCounter = 101;

    // constructor(s)
    public Employee(String f, String l) {
        firstName = f;
        lastName = l;
        id = idCounter;
        idCounter++;
    }

    // method(s)
    public int getId() {
        return id;
    }
    public String fullName() {
        return firstName + " " + lastName;
    }
    public static int getMostRecentIDAssigned() {
        return idCounter - 1;
    }
    public static int getNumberOfEmployees() {
        return idCounter - 101;
    }

}
