public class Temperature
{
    private double highTemp;
    private double lowTemp;
    private String tempScale;


    // Precondition: scale must be: "F" or "C"; anything else will default to "F"
    public Temperature(double high, double low, String scale)
    {
        highTemp = high;
        lowTemp = low;


        if (scale.equals("F") || scale.equals("C"))
        {
            tempScale = scale;
        }
        else
        {
            tempScale = "F";
        }
    }

    // 1. Add your two static methods here:
    // Takes a double Celsius temperature, converts it to an
    // equivalent Fahrenheit temperature, and returns the
    // Fahrenheit equivalent as a double
    public static double convertCtoF(double temp) {
        return temp * ((double) 9 / 5) + 32;
    }
    // Takes a double Fahrenheit temperature, converts it to
    // an equivalent Celsius temperature, and returns the
    // Celsius equivalent as a double:
    public static double convertFtoC(double temp) {
        return (temp - 32) * ((double) 5 / 9);
    }

    // 2. Add your two instance methods here:
    // If  tempScale is “F”, then convert both highTemp
    // and lowTemp to C using your new static method, and
    // change tempScale to “C”; if the tempScale is
    // already “C”, then no need to convert so do nothing.
    // This method returns no value.
    public void changeToC() {
        if (tempScale.equals("F")) {
            highTemp = convertFtoC(highTemp);
            lowTemp = convertFtoC(lowTemp);
            tempScale = "C";
        }
    }
    public void changeToF() {
        if (tempScale.equals("C")) {
            highTemp = convertCtoF(highTemp);
            lowTemp = convertCtoF(lowTemp);
            tempScale = "F";
        }
    }

    // 3. Add your private static helper rounding
    // "utility" method here:
    private static double roundToNearestTenth(double num) {
        double roundedNum = Math.round(num * 10);
        roundedNum /= 10;
        return roundedNum;
    }

    // 4. Complete the toString method below (using your static helper method)
    //    so it returns a String that prints like:
    //    High Temperature: 67.4 F (or C)
    //    Low Temperature: 58.3 F (or C)
    public String toString()
    {
        String str = "High Temperature: " + roundToNearestTenth(highTemp) + " " + tempScale;
        str += "\nLow Temperature: " + roundToNearestTenth(lowTemp) + " " + tempScale;
        return str;
    }
}
