package senla.mikhalchenko.task6.service;

import static senla.mikhalchenko.task6.util.DataBaseOfNumbers.*;

public class PrintBigNumbersServiceImpl implements PrintNumbersService {
    private final int n = 21;
    char[][] number = new char[n][n];

    private final char symbol0 = '0';
    private final char symbol1 = '1';
    private final char symbol2 = '2';
    private final char symbol3 = '3';
    private final char symbol4 = '4';
    private final char symbol5 = '5';
    private final char symbol6 = '6';
    private final char symbol7 = '7';
    private final char symbol8 = '8';
    private final char symbol9 = '9';
    private final char symbol_split = ' ';

    @Override
    public void printNumberOne() {
       createNumberOne(number, symbol_split, symbol1);
    }

    @Override
    public void printNumberTwo() {
     createNumberTwo(number, symbol_split, symbol2);
    }
    @Override
    public void printNumberThree() {
        createNumberThree(number, symbol_split, symbol3);
    }

    @Override
    public void printNumberFour() {
        createNumberFour(number, symbol_split, symbol4);
    }

    @Override
    public void printNumberFive() {
        createNumberFive(number, symbol_split, symbol5);
    }
    @Override
    public void printNumberSix() {
        createNumberSix(number, symbol_split, symbol6);
    }


    @Override
    public void printNumberSeven() {
        createNumberSeven(number, symbol_split, symbol7);
    }

    @Override
    public void printNumberEight() {
        createNumberEight(number, symbol_split, symbol8);
    }

    @Override
    public void printNumberNine() {
        createNumberNine(number, symbol_split, symbol9);
    }

    @Override
    public void printNumberZero() {
        createNumberZero(number, symbol_split, symbol0);
    }
}
