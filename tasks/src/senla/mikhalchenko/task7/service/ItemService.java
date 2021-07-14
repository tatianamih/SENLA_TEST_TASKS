package senla.mikhalchenko.task7.service;

import senla.mikhalchenko.task7.bean.Item;
import senla.mikhalchenko.task7.bean.Safe;
import senla.mikhalchenko.task7.exceptions.ExistingNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static senla.mikhalchenko.task7.util.ItemDatabase.createItemDatabase;

public class ItemService {

    Safe safe = new Safe();
    private final List<Item> items;
    private final Scanner scanner;

    {
        items = createItemDatabase();
        scanner = new Scanner(System.in);
    }

    public void printItemList() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public List<Item> sortByPrice() {
        return items.stream()
                .sorted((o1, o2) -> o2.getPrice() - o1.getPrice())
                .collect(Collectors.toList());
    }

    public void printSortedListByPrice(List<Item> sortedListByPrice) {
        sortedListByPrice.forEach(System.out::println);
    }

    private int findMinVolumeFromItemList() {
        return items.stream()
                .sorted((o1, o2) -> o1.getVolume() - o2.getVolume())
                .collect(Collectors.toList()).get(0).getVolume();
    }

    public List<Item> putItemInTheSafeWithMaxPrice(List<Item> sortedList) {
        List<Item> resultList = new ArrayList<>();
        System.out.println("Input the Safe Volume: ");

        int volume;
        try {
            volume = scanner.nextInt();
            safe.setVolume(volume);
        } catch (Exception e) {
            System.err.println("Incorrect volume. Do your choice in menu again.\n" +
                    " The volume is whole number.");
        }

        printNumberException();

        for (int i = 0; i < sortedList.size(); i++) {
            int sumVolume = sortedList.get(i).getVolume() * sortedList.get(i).getNumber();
            if (safe.getVolume() >= sumVolume) {
                resultList.add(new Item(sortedList.get(i).getName(), sortedList.get(i).getNumber(),
                        sortedList.get(i).getVolume(), sortedList.get(i).getPrice()));
                safe.setVolume(safe.getVolume() - sumVolume);
            } else {
                int newNumber = safe.getVolume() / sortedList.get(i).getVolume();
                if (newNumber > 0) {
                    resultList.add(new Item(sortedList.get(i).getName(), newNumber,
                            sortedList.get(i).getVolume(), sortedList.get(i).getPrice()));
                    break;
                }
            }
        }
        return resultList;
    }

    public void printItemInTheSafeWithMaxPrice(List<Item> resultList) {

        resultList.forEach(System.out::println);
    }


    private void compareTheVolumeOfTheSafeAndMinVolume1(int volume) throws ExistingNumber {
        if (volume < findMinVolumeFromItemList()) {
            throw new ExistingNumber("You input incorrect volume. Input a volume of the safe more than " +
                    +findMinVolumeFromItemList());
        }
    }

    private void printNumberException() {
        try {
            compareTheVolumeOfTheSafeAndMinVolume1(safe.getVolume());
        } catch (ExistingNumber e) {
            System.out.println(e.getMessage());
        }
    }
}
