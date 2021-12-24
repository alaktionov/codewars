package codewars.level3;

class HighestScoringWord {

    public static String high(String s) {
        int highestScore = 0;
        String wordWithHighestScore = "";
        String currentWord;
        String[] arrayOfWords = s.split(" ");
        for (int i = 0; i < arrayOfWords.length; i++) {
            currentWord = arrayOfWords[i];
            int currentScore = 0;
            for (int j = 0; j < currentWord.length(); j++) {
                currentScore += currentWord.charAt(j) - 96;
            }
            if (currentScore > highestScore) {
                wordWithHighestScore = currentWord;
                highestScore = currentScore;
            }
        }
        return wordWithHighestScore;
    }
}