public class Bus {
    // instance variables
    int currentStop, numberOfStops;
    boolean movingForward;

    // constructors
    public Bus(int s) {
        numberOfStops = s;
        currentStop = 1;
        movingForward = true;
    }

    // methods
    public int getCurrentStop() {
        return currentStop;
    }
    public void move() {
        if (currentStop == numberOfStops) {
            movingForward = false;
        }
        if (currentStop == 1) {
            movingForward = true;
        }

        if (movingForward) {
            currentStop++;
        }
        else {
            currentStop--;
        }
    }
}
