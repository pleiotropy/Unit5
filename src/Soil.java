public class Soil {
    // instance variable(s)
    private int maximumPotency;
    private int treatmentsNeeded;

    // constructor(s)
    public Soil(int p, int t) {
        maximumPotency = p;
        treatmentsNeeded = t;
    }

    // method(s)
    public int treatmentsNeeded() {
        return treatmentsNeeded;
    }

    public boolean isDangerous() {
        if (treatmentsNeeded > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void treat(int potency) {
        if (potency <= maximumPotency) {
            // treatment successful
            if (treatmentsNeeded > 0) {
                treatmentsNeeded -= 1;
            }
        }
        else {
            // treatment failed
            treatmentsNeeded += 1;
        }
    }
}
