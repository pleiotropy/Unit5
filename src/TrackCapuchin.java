public class TrackCapuchin {
    // instance variables
    private int xMonkey, yMonkey, xFood, yFood;

    // constructor
    public TrackCapuchin(int x, int y) {
        xMonkey = 0;
        yMonkey = 0;
        xFood = x;
        yFood = y;
    }

    // methods
    public int getXMonkey() {
        return xMonkey;
    }
    public int getYMonkey() {
        return yMonkey;
    }
    public int getXFood() {
        return xFood;
    }
    public int getYFood() {
        return yFood;
    }
    public void moveMonkey(int xMovement, int yMovement) {
        xMonkey += xMovement;
        yMonkey += yMovement;
    }
    public double calcFoodDistance() {
        double xDiffSq = (xMonkey-xFood) * (xMonkey-xFood);
        double yDiffSq = (yMonkey-yFood) * (yMonkey-yFood);
        return Math.sqrt(xDiffSq + yDiffSq);
    }
    public boolean isCloserThan(TrackCapuchin other) {
        return calcFoodDistance() < other.calcFoodDistance();
    }

}
