public class Main
{
    public static void main(String[] args)
    {
/* Test Temperature class
        double high = 78.5;
        double low = 54.6;

        // test constructors
        Temperature temp1 = new Temperature(high, low, "F");

        System.out.println(temp1);
        System.out.println("-----");

        Temperature temp2 = new Temperature(23.92, 14.95, "C");

        System.out.println(temp2);
        System.out.println("-----");

        // anything other than "C" or "F" defaults to "F"
        Temperature temp3 = new Temperature(57.53, 38.65, "K");

        System.out.println(temp3);
        System.out.println("-----");

        // --- test instance methods ---

        // change to C
        temp1.changeToC();
        System.out.println(temp1);

        // already C so do nothing:
        temp1.changeToC();
        System.out.println(temp1);
        System.out.println("-----");

        // change to F
        temp1.changeToF();
        System.out.println(temp1);

        // already F so do nothing:
        temp1.changeToF();
        System.out.println(temp1);
        System.out.println("-----");

        // --- test static methods ---
        double celciusTemp = Temperature.convertFtoC(78.5);
        System.out.println(celciusTemp);

        double fahrenheitTemp = Temperature.convertCtoF(12.6);
        System.out.println(fahrenheitTemp);
        */

/* Test RaceUtility class
        double miles1 = 13.85;
        double miles2 = 26.42;

        double km1 = 40;
        double km2 = 3.5;

        System.out.println(RaceUtility.milesToKm(miles1));
        System.out.println(RaceUtility.milesToKm(miles2));

        System.out.println(RaceUtility.kmToMiles(km1));
        System.out.println(RaceUtility.kmToMiles(km2));

        String title = "welcome to the marathon!";
        System.out.println(RaceUtility.makeProper(title));

        String title2 = "It's TIME for THE 5k!";
        System.out.println(RaceUtility.makeProper(title2));
        */

        // Test RaceUtility class after refactoring main with
        // static helper methods
        double miles1 = 13.85;
        double km1 = 40;
        printConversions(miles1,km1);

        double miles2 = 26.42;
        double km2 = 3.5;
        printConversions(miles2,km2);

        double miles3 = 5;
        double km3 = 20.50;
        printConversions(miles3,km3);

        double miles4 = 0;
        double km4 = 0;
        printConversions(miles4,km4);

        String title = "welcome to the marathon!";
        printProperTitle(title);

        title = "It's TIME for THE 5k!";
        printProperTitle(title);

        title = "runners, take your marks...";
        printProperTitle(title);

        title = "2 MILES TO GO!";
        printProperTitle(title);

        title = "water break in 0.5 miles";
        printProperTitle(title);

    }

    // print mi to km, and km to mi
    public static void printConversions(double mi, double km) {
        System.out.println(RaceUtility.milesToKm(mi));
        System.out.println(RaceUtility.kmToMiles(km));
    }

    // make title proper
    public static void printProperTitle(String title) {
        System.out.println(RaceUtility.makeProper(title));
    }

}
