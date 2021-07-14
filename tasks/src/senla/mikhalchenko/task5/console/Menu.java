package senla.mikhalchenko.task5.console;

import senla.mikhalchenko.task5.service.StringService;

import java.util.Scanner;

public class Menu {
    private final String startMessage =
            "\n1. Count the number of vowels in words\n" +
                    "2. Output words sorted by the number of vowels\n" +
                    " (first those with more vowels)\n" +
                    "3. Make the first vowel letter in the word uppercases\n" +
                    "4. Exit\n";
    private final Scanner scanner;
    private final StringService service;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.service = new StringService();
    }

    public void mainMenu() {
        System.out.println("Input you string in Russian or English");
        String str = scanner.nextLine();
        String[] words = service.getArrayByDelimiter(str);
        int choice;
        while (true) {
            choice = getAnswerFromMenu(startMessage, 4);
            switch (choice) {
                case 1:
                    service.printTheWordsAndTheNumberOfVowels(words, service.countTheNumberOfVowelsInWords(words));
                    break;
                case 2:
                    service.printWordsSortedByNumberOfVowels(words, service.countTheNumberOfVowelsInWords(words));
                    break;
                case 3:
                    service.toUpperCaseForFirstVowelLetter(words, service.indexOfVowelsForUpperCase(words));
                    break;
                case 4:
                    return;
            }
        }
    }

    private int getAnswerFromMenu(String message, int menuSize) {
        String answer;
        int result;
        while (true) {
            System.out.println(message);
            if (scanner.hasNextLine()) {
                answer = scanner.nextLine();
                if (isNumber(answer)) {
                    result = Integer.parseInt(answer);
                    if (result <= menuSize && result > 0) {
                        return result;
                    } else {
                        errorMenu("Please input digits from 1 to "
                                + menuSize + "\npress any key to continue");

                    }
                } else {
                    errorMenu("Please input only digits "
                            + "\npress any key to continue");
                }
            }
        }
    }

    private boolean isNumber(String answer) {
        return true;
    }

    private void errorMenu(String errorMessage) {
        System.out.println(errorMessage);
        scanner.nextLine();
    }
}
