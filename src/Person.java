public class Person
{
    // instance variables
    private String firstName, lastName, eMail;

    // constructors
    public Person(String f, String l, String e) {
        firstName = f;
        lastName = l;
        eMail = e;
    }

    public Person(String f, String l) {
        firstName = f;
        lastName = l;
        eMail = "None provided";
    }

    // getter methods
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEMail() {
        return eMail;
    }

    // setter methods
    public void setNewEMail(String newEMail) {
        eMail = newEMail;
    }

    // other public methods
    public void introduce() {
        System.out.println("Hello, my name is " + firstName + " " + lastName);
    }

    // private helper methods
}
