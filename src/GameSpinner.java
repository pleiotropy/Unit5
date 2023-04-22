public class GameSpinner {
    // instance variables
    private int sectors, currentRun, prevSpin;

    // constructor(s)
    public GameSpinner(int s) {
        sectors = s;
        currentRun = 0;
        prevSpin = 0;
    }

    // method(s)
    public int spin() {
        int currentSpin = (int) ((Math.random() * sectors) + 1);
        if (currentRun == 0 || currentSpin == prevSpin) {
            currentRun++;
        }
        else {
            currentRun = 1;
        }
        prevSpin = currentSpin;
        return currentSpin;
    }
    public int currentRun() {
        return currentRun;
    }
}
