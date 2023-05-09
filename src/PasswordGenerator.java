public class PasswordGenerator {
    // instance variables
    public static int pwCount = 0;
    public int digits;
    public String prefix;

    // constructors
    // two parameters
    public PasswordGenerator(int d, String p) {
        digits = d;
        prefix = p;
    }

    // one parameter
    public PasswordGenerator(int d) {
        this(d, "A");
    }

    // methods
    public static int pwCount() {
        return pwCount;
    }
    public String pwGen() {
        String random = "";

        for (int i = 0; i < digits; i++) {
            // choose a random digit
            int newDigit = (int) (Math.random() * 10);
            // add it to the random string
            random += Integer.toString(newDigit);
        }

        pwCount++;
        return prefix + "." + random;
    }
}