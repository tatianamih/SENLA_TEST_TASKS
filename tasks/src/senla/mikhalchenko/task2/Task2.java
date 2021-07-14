package senla.mikhalchenko.task2;

import java.util.Scanner;

/*Напишите программу, которая возвращает сумму цифр, присутствующих в данной строке.
Если цифр нет, возвращаемая сумма равна 0.*/

public class Task2 {
    private int sumInTheString(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                String tmp = str.substring(i, i + 1);
                sum += Integer.parseInt(tmp);

            } else {
                sum += 0;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println("Input string");
        Task2 task2 = new Task2();
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println("You input string is: " + str);

        System.out.println("The sum of the numbers in a string is "
                + task2.sumInTheString(str));
    }
}
