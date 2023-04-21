public class RandomWord {
    // instance variables
    private String word1, word2, newWord;

    // constructor
    public RandomWord(String w1, String w2) {
        word1 = w1;
        word2 = w2;
        newWord = "";
    }

    // methods
    public String randomLetter(int n) {
        int randomIndex;
        String randomLetter;
        if (n == 1) {
            randomIndex = (int) (Math.random() * word1.length());
            randomLetter = word1.substring(randomIndex,randomIndex+1);
        }
        else {
            randomIndex = (int) (Math.random() * word2.length());
            randomLetter = word2.substring(randomIndex,randomIndex+1);
        }
        newWord += randomLetter;
        return randomLetter;
    }

    public String getNewWord() {
        return newWord;
    }

    public void resetWord() {
        newWord = "";
    }
}
