package senla.mikhalchenko.task6.service;

import static senla.mikhalchenko.task6.util.DataBaseOfNumbers.*;

public class PrintUsualNumberServiceImpl implements PrintNumbersService {
    private final int n = 7;
    char[][] number = new char[n][n];
    private final char symbol = '*';
    private final char symbol_split = ' ';

    @Override
    public void printNumberOne() {
        createNumberOne(number, symbol_split, symbol);
    }

    @Override
    public void printNumberTwo() {
        createNumberTwo(number, symbol_split, symbol);
    }

    @Override
    public void printNumberThree() {
        createNumberThree(number, symbol_split, symbol);

    }

    @Override
    public void printNumberFour() {
        createNumberFour(number, symbol_split, symbol);
    }

    @Override
    public void printNumberFive() {
        createNumberFive(number, symbol_split, symbol);
    }

    @Override
    public void printNumberSix() {
        createNumberSix(number, symbol_split, symbol);
    }

    @Override
    public void printNumberSeven() {
        createNumberSeven(number, symbol_split, symbol);
    }

    @Override
    public void printNumberEight() {
     createNumberEight(number, symbol_split, symbol);
    }

    @Override
    public void printNumberNine() {
        createNumberNine(number, symbol_split, symbol);
    }

    @Override
    public void printNumberZero() {
        createNumberZero(number, symbol_split, symbol);
    }
}
