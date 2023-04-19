public class FRQSolutions {
    public String longestStreak(String str) {
        String longestStreak = "";
        String testString = "";
        String leftLetter, rightLetter;

        for (int i = 0; i < str.length(); i++) {
            leftLetter = str.substring(i,i+1);
            if (i < str.length()-1) {
                rightLetter = str.substring(i+1,i+2);
            }
            else {
                rightLetter = str.substring(i+1);
            }
            testString += leftLetter;
            if (!leftLetter.equals(rightLetter) || (i == str.length()-1)) {
                if (testString.length() > longestStreak.length()) {
                    longestStreak = testString;
                }
                testString = "";
            }
        }
        return longestStreak.substring(0,1) + " " + longestStreak.length();
    }

}