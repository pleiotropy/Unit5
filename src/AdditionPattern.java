public class AdditionPattern {
    // instance variables
    private int startingNumber, valueAdded, currentNumber;

    // constructor
    public AdditionPattern(int i, int j) {
        startingNumber = i;
        valueAdded = j;
        currentNumber = i;
    }

    // methods
    public int currentNumber() {
        return currentNumber;
    }

    public void next() {
        currentNumber += valueAdded;
    }

    public void prev() {
        if (currentNumber != startingNumber) {
            currentNumber -= valueAdded;
        }
    }
}
