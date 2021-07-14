package senla.mikhalchenko.task6.console;

import senla.mikhalchenko.task6.service.PrintBigNumbersServiceImpl;
import senla.mikhalchenko.task6.service.PrintNumbersService;
import senla.mikhalchenko.task6.service.PrintUsualNumberServiceImpl;

import java.util.Scanner;

public class Menu {
    private final String startMessage =
            "1. Select to get the usual numbers from 0 to 9\n" +
                    "2. Select to get the big numbers from 0 to 9\n" +
                    "3. Exit";

    private final String messageForMenuPrintUsualNumber =
            "1. Input 1\n" +
                    "2. Input 2\n" +
                    "3. Input 3\n" +
                    "4. Input 4\n" +
                    "5. Input 5\n" +
                    "6. Input 6\n" +
                    "7. Input 7\n" +
                    "8. Input 8\n" +
                    "9. Input 9\n" +
                    "10. Input 0\n" +
                    "11. Input Big Number\n" +
                    "12. Exit";
    private final String messageForMenuToPrintBigNumbers =
            "2. Input 2\n" +
                    "3. Input 3\n" +
                    "4. Input 4\n" +
                    "5. Input 5\n" +
                    "6. Input 6\n" +
                    "7. Input 7\n" +
                    "8. Input 8\n" +
                    "9. Input 9\n" +
                    "10. Input 0\n" +
                    "11. Exit";
    private final Scanner scanner;
    private final PrintNumbersService printService1;
    private final PrintNumbersService printService2;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.printService1 = new PrintUsualNumberServiceImpl();
        this.printService2 = new PrintBigNumbersServiceImpl();
    }

    public void mainMenu() {
        int choice;
        while (true) {
            choice = getAnswerFromMenu(startMessage, 3);
            switch (choice) {
                case 1:
                    menuForPrintUsualNumber();
                    break;
                case 2:
                    menuForPrintBigNumbers();
                    break;
                case 3:
                    return;
            }
        }
    }

    private void menuForPrintUsualNumber() {
        int choice;
        while (true) {
            choice = getAnswerFromMenu(messageForMenuPrintUsualNumber, 12);

            switch (choice) {
                case 1:
                    printService1.printNumberOne();
                    break;
                case 2:
                    printService1.printNumberTwo();
                    break;
                case 3:
                    printService1.printNumberThree();
                    break;
                case 4:
                    printService1.printNumberFour();
                    break;
                case 5:
                    printService1.printNumberFive();
                    break;
                case 6:
                    printService1.printNumberSix();
                    break;
                case 7:
                    printService1.printNumberSeven();
                    break;
                case 8:
                    printService1.printNumberEight();
                    break;
                case 9:
                    printService1.printNumberNine();
                    break;
                case 10:
                    printService1.printNumberZero();
                    break;
                case 11:
                    menuForPrintBigNumbers();
                    break;
                case 12:
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

    private void menuForPrintBigNumbers() {
        int choice;
        while (true) {
            choice = getAnswerFromMenu(messageForMenuToPrintBigNumbers, 11);
            switch (choice) {
                case 1:
                    printService2.printNumberOne();
                    break;
                case 2:
                    printService2.printNumberTwo();
                    break;
                case 3:
                    printService2.printNumberThree();
                    break;
                case 4:
                    printService2.printNumberFour();
                    break;
                case 5:
                    printService2.printNumberFive();
                    break;
                case 6:
                    printService2.printNumberSix();
                    break;
                case 7:
                    printService2.printNumberSeven();
                    break;
                case 8:
                    printService2.printNumberEight();
                    break;
                case 9:
                    printService2.printNumberNine();
                    break;
                case 10:
                    printService2.printNumberZero();
                    break;
                case 11:
                    return;
            }
        }
    }
}
