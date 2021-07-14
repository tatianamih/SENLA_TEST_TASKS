package senla.mikhalchenko.task4;


import java.util.InputMismatchException;
import java.util.Scanner;

/*Создать программу, которая будет вычислять и выводить
 на экран простые множители из которых состоит целое число,
 введенное пользователем. Если введено не целое число, то
  сообщать ему об ошибке.
 */
public class Task4 {

    private int[] findPrimeNumber(int number) {
        int[] numbers = new int[64];
        int size = 0;
        for (int i = 2; number > i && i * i <= number; i++) {
            if (number % i == 0) {
                numbers[size++] = i;
                while (number % i == 0) {
                    number /= i;
                }
            }
        }
        if (number > 1) {
            numbers[size++] = number;
        }
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = numbers[i];
        }
        return result;
    }

    private void printArrayOfPrimeNumber(int[] result) {
        System.out.println("The number consists of the following prime numbers");
        for (int element : result) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Input a number");
        Task4 task4 = new Task4();
        Scanner scanner = new Scanner(System.in);

        try {
            int number = scanner.nextInt();
            task4.printArrayOfPrimeNumber(task4.findPrimeNumber(number));
        } catch (InputMismatchException e) {
            System.out.println("----------------");
            System.err.println("Incorrect data entered, repeat the procedure again: ");
        }
    }
}
