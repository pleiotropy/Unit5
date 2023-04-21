public class StepTracker {
    // instance variables
    private int steps, minSteps, activeDays, totalDays;

    // constructor
    public StepTracker(int min) {
        steps = 0;
        minSteps = min;
        activeDays = 0;
        totalDays = 0;
    }

    // methods
    public void addDailySteps(int s) {
        steps += s;
        totalDays++;
        if (s >= minSteps) {
            activeDays++;
        }
    }

    public int activeDays() {
        return activeDays;
    }

    public double averageSteps() {
        if (totalDays != 0) {
            return (double) steps / totalDays;
        }
        else {
            return 0.0;
        }
    }
}