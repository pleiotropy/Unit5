public class CodeWordChecker {
    // instance variables
    private int minLength;
    private int maxLength;
    private String forbiddenWord;

    // constructor(s)
    public CodeWordChecker(int min, int max, String f) {
        minLength = min;
        maxLength = max;
        forbiddenWord = f;
    }

    public CodeWordChecker(String f) {
        minLength = 6;
        maxLength = 20;
        forbiddenWord = f;
    }

    // methods
    public boolean isValid(String codeWord) {
        boolean noForbiddenWord;
        boolean justRight;

        if (codeWord.indexOf(forbiddenWord) == -1) {
            noForbiddenWord = true;
        }
        else {
            noForbiddenWord = false;
        }

        if (codeWord.length() < minLength || codeWord.length() > maxLength) {
            justRight = false;
        }
        else {
            justRight = true;
        }

        if (noForbiddenWord && justRight) {
            return true;
        }
        else {
            return false;
        }
    }
}