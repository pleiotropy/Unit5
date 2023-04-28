public class RaceUtility {
    // A static milesToKm method that converts a double value
    // representing miles to its equivalent distance in kilometers,
    // returning the equivalent distance in km.
    public static double milesToKm(double mi) {
        return mi * 1.609344;
    }

    // A static kmToMiles method that converts a double value
    // representing kilometers to its equivalent distance in miles,
    // returning the equivalent distance in miles.
    public static double kmToMiles(double km) {
        return km / 1.609344;
    }

    // A static makeProper method that accepts a String, makes
    // every character lowercase except the first letter of
    // every word (they will be using this in their race
    // advertisement web pages)!
    public static String makeProper(String str) {
        String properString = "";
        // loop through each character in the string
        // if it's the first char, or the first char after a space -> uppercase
        // if not -> lowercase
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.substring(i-1,i).equals(" ")) {
                properString += str.substring(i,i+1).toUpperCase();
            }
            else if (i == str.length()-1){
                properString += str.substring(i).toLowerCase();
            }
            else {
                properString += str.substring(i,i+1).toLowerCase();
            }
        }
        return properString;
    }
}
