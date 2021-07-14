package senla.mikhalchenko.task7.console;

import senla.mikhalchenko.task7.bean.Safe;
import senla.mikhalchenko.task7.service.ItemService;
import java.util.Scanner;

public class Menu {

    private final String startMessage =
            "\n1. Get a set of items\n" +
                    "2. Sort items by price\n" +
                    "3. Put the items with the maximum price in the safe\n" +
                    "4. Exit\n";

    private final Scanner scanner;
    private final Safe safe;
    private final ItemService service;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.safe = new Safe();
        this.service = new ItemService();
    }

    public void mainMenu() throws Exception {
        int choice;
        while (true) {
            choice = getAnswerFromMenu(startMessage, 4);
            switch (choice) {
                case 1:
                    service.printItemList();
                    break;
                case 2:
                    service.printSortedListByPrice(service.sortByPrice());
                    break;
                case 3:

                    setAModelOfTheSafe();
                    service.printItemInTheSafeWithMaxPrice(service.putItemInTheSafeWithMaxPrice
                            (service.sortByPrice()));
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

    private void setAModelOfTheSafe() {
        System.out.println("Input the Safe Model: ");
        String model = scanner.nextLine();
    }
}
