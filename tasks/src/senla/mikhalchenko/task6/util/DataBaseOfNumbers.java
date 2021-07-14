package senla.mikhalchenko.task6.util;

public class DataBaseOfNumbers {
  public   static void createNumberOne(char[][] number, char symbol_split, char symbol) {
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                number[i][j] = symbol_split;
                number[i][number.length - 1] = symbol;
                if(j > number.length / 2 && i < number.length / 2
                        && number.length - 1 - i == j){
                    number[i][j] = symbol;
                }
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }


  public   static void createNumberTwo(char[][] number, char symbol_split, char symbol) {
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                number[i][j] = symbol_split;
                number[0][j] = symbol;
                number[(number.length - 1) / 2][j] = symbol;
                if(j == number.length - 1 && i > 0 && i < number.length / 2){
                    number[i][j] = symbol;
                }
                if(j == 0 && i > number.length / 2 && i < number.length  - 1){
                    number[i][j] = symbol;
                }
                number[number.length - 1][j] = symbol;
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }

   public static void createNumberThree(char[][] number, char symbol_split, char symbol) {
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                number[i][j] = symbol_split;//" "
                number[0][j] = symbol;
                number[number.length / 2][j] = symbol;
                number[i][number.length - 1] = symbol;
                number[number.length - 1][j] = symbol;
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }

   public static void createNumberFour(char[][] number, char symbol_split, char symbol) {
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                number[i][j] = symbol_split;
                number[i][number.length - 1] = symbol;
                number[(number.length - 1) / 2][j] = symbol;
                if(j == 0 && i < number.length / 2){
                    number[i][j] = symbol;
                }
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }

   public static void createNumberFive(char[][] number, char symbol_split, char symbol) {
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                number[i][j] = symbol_split;
                number[0][j] = symbol;
                number[(number.length - 1) / 2][j] = symbol;
                if(j == 0 && i > 0 && i < number.length / 2){
                    number[i][j] = symbol;
                }
                if(j == number.length - 1 && i > number.length / 2 && i < number.length - 1){
                    number[i][j] = symbol;
                }
                number[number.length - 1][j] = symbol;
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }

   public static void createNumberSix(char[][] number, char symbol_split, char symbol) {
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                number[i][j] = symbol_split;
                number[0][j] = symbol;
                number[number.length / 2][j] = symbol;
                number[number.length - 1][j] = symbol;
                number[i][0] = symbol;
                if(j == number.length - 1 && i > number.length / 2 && i < number.length - 1){
                    number[i][j] = symbol;
                }
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }

   public static void createNumberSeven(char[][] number, char symbol_split, char symbol) {
        for (int i = number.length - 1; i >= 0; i--) {
            for (int j = 0; j < number[i].length; j++) {
                number[i][j] = symbol_split;
                number[number.length - 1][j] = symbol;

                if (i == j) {
                    number[i][j] = symbol;
                }
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void createNumberEight(char[][] number, char symbol_split, char symbol) {
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                number[i][j] = symbol_split;//" "
                number[0][j] = symbol;
                number[number.length / 2][j] = symbol;
                number[i][number.length - 1] = symbol;
                number[number.length - 1][j] = symbol;
                number[i][0] = symbol;
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
   public static void createNumberNine(char[][] number, char symbol_split, char symbol) {
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                number[i][j] = symbol_split;
                number[0][j] = symbol;
                number[number.length / 2][j] = symbol;
                number[number.length - 1][j] = symbol;
                number[i][number.length - 1] = symbol;
                if(j == 0 && i > 0 && i < number.length / 2){
                    number[i][j] = symbol;
                }
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }

   public static void createNumberZero(char[][] number, char symbol_split, char symbol) {
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                number[i][j] = symbol_split;//" "
                number[0][j] = symbol;
                number[i][number.length - 1] = symbol;
                number[number.length - 1][j] = symbol;
                number[i][0] = symbol;
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}
