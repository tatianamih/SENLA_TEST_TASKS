package senla.mikhalchenko.task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Напишите программу, которая возвращает количество "троек" в заданной строке.
Тройка - это символ, появляющийся три раза подряд в строке.*/
public class Task1 {
    private void getRepeatedCharactersInARowXTimes(String text, int numberOfDuplicateElements) {
        int count = 0;
        Matcher matcher = Pattern.compile("(.)\\1+").matcher(text);
        while (matcher.find()) {
            String subString = matcher.group();
            if (subString.length() == numberOfDuplicateElements) {
                count++;
            } else {
                count += 0;
            }
        }
        System.out.println("\n" + "The number of consecutive repeating " + numberOfDuplicateElements +
                " identical elements in the string is equal to " + count);
    }

    public static void main(String[] args) {
        System.out.println("Input string");
        Task1 task1 = new Task1();

        Scanner input = new Scanner(System.in);
        String str = input.next();

        System.out.println("You input string is: " + str);
        task1.getRepeatedCharactersInARowXTimes(str, 3);
    }
}
