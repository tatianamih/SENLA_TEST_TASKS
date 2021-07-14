package senla.mikhalchenko.task1;

import java.util.Scanner;

public class Test {
    private int findTheNumberOfTriples(String str) {

        int count = 0;
        for (int i = 0 ; i < str.length() - 2; i++) {
            char tmp = str.charAt(i);
            if (tmp == str.charAt(i + 1) && tmp == str.charAt(i + 2)){

                count++;

            }
        }
        return count;
    }
    public int findTheNumberOfTriples1(String str) {

        char [] chars = str.toCharArray();

        int ctr = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            //
            char tmp = chars[i];
            if (tmp == chars[i + 1] && tmp == chars[i + 2]) {


                ctr++;
                System.out.println(ctr);


            }
        }

        return ctr;

    }
    private static void count_multiples(String str,int size) {
        int count = 0;
        for (int i = 0; i < str.length() - (size - 1); i++) {
            char tmp = str.charAt(i);
            if (tmp == str.charAt(i + size - 2) && tmp == str.charAt( i + size - 1)) {
                count ++;
                //    return count;

            }
        }System.out.println(count);
    }
//def count_multiples(string,size):
//    multiple  =0
//    for i in range(0,len(string)-(size-1)):
//        if string[i]*(size-1)==string[i+1:i+size]:
//            multiple+=1
//    return multiple
//
//print(count_multiples("abbbbcccd",3))


    public static void main (String[] args) {
        System.out.println("Input string");

        Test test= new Test();

        Scanner input = new Scanner(System.in);
        String str = input.next();

        System.out.println("You input string is: "+ str);
        System.out.println("The number of triples in the string is: "+  test.findTheNumberOfTriples(str));
        // count_multiples("abbbbcccd",3);
    }
}

