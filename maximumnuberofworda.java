class Solution {
    public int countWords(String sentence) {
        int n = sentence.length();
        if (n == 0) {
            return 0;
        }
        int countEmptySpace = 0;
        for (int i = 0; i < n; i++) {
            if (sentence.charAt(i) == ' ') {
                countEmptySpace++;
            }
        }
        return countEmptySpace + 1;
    }
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (int i = 0; i < sentences.length; i++) {
            int x = countWords(sentences[i]);
            if (x > maxWords) {
                maxWords = x;
            }
        }
        return maxWords;
    }
}
