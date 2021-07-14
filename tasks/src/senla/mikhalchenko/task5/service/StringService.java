package senla.mikhalchenko.task5.service;

public class StringService {

    final static String[] vowels = {"a", "A", "o", "O", "i", "I", "y", "Y", "u", "U", "e", "E",
            "у", "У", "е", "Е", "ы", "Ы", "А", "а", "о", "О", "я", "Я", "и", "И", "ю", "Ю", "Э", "э"};

    public String[] getArrayByDelimiter(String text) {
        String[] textSplit = text.split("\\s");
        for (int i = 0; i < textSplit.length; i++) {
        }
        return textSplit;
    }

    public int[] countTheNumberOfVowelsInWords(String[] words) {

        int count = 0;
        int[] numberOfVowelsInAWord = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (words[i].contains(vowels[j])) {
                    count++;
                    numberOfVowelsInAWord[i] = count;
                }
            }
            count = 0;
        }
        return numberOfVowelsInAWord;
    }

    public void printTheWordsAndTheNumberOfVowels(String[] words, int[] numberOfVowels) {
        for (int i = 0; i < words.length; i++) {
            System.out.println("In the word " + "{" + words[i] + "} -  {"
                    + numberOfVowels[i] + "} vowels");
        }
    }

    public void printWordsSortedByNumberOfVowels(String[] words, int[] numberOfVowels) {

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < numberOfVowels.length; j++) {
                int itmp = 0;
                String stmp = null;
                if (numberOfVowels[i] > numberOfVowels[j]) {
                    itmp = numberOfVowels[i];
                    numberOfVowels[i] = numberOfVowels[j];
                    numberOfVowels[j] = itmp;
                    stmp = words[i];
                    words[i] = words[j];
                    words[j] = stmp;
                }
            }
        }
        System.out.println("Sorting by the number of vowel letters is:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i] + " - " + numberOfVowels[i]);
        }
    }

    public int[] indexOfVowelsForUpperCase(String[] words) {

        int index;
        int[] indexOfFirstVowelsInAWord = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if ("AEIOUYaeiouyУуЕеЫыАаОоЯяЭэИиЮю".indexOf(words[i].charAt(j)) > -1) {
                    index = j;
                    indexOfFirstVowelsInAWord[i] = index;
                    break;
                }
            }

        }
        return indexOfFirstVowelsInAWord;
    }

    public void toUpperCaseForFirstVowelLetter(String[] words, int[] indexOfFirstVowel) {

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].substring(0, indexOfFirstVowel[i]) +
                    words[i].substring(indexOfFirstVowel[i], indexOfFirstVowel[i] + 1).toUpperCase() +
                    words[i].substring(indexOfFirstVowel[i] + 1, words[i].length()) + " ");
        }
    }
}
