public class Spinner
{
    // instance variables
    private int numberOfSections;
    private int mostRecentSpin;
    private int spinCount;
    private int totalSpin;

    // constructors
    public Spinner(int n) {
        numberOfSections = n;
        mostRecentSpin = 0;
        spinCount = 0;
        totalSpin = 0;
    }

    // getter/setter methods
    public int getMostRecentSpin() {
        return mostRecentSpin;
    }

    // other public methods
    public void spin() {
        mostRecentSpin = (int) (Math.random() * (numberOfSections));
        spinCount++;
        totalSpin += mostRecentSpin;
    }

    public double averageSpin() {
        return (double) totalSpin / spinCount;
    }

    // private helper methods
}
