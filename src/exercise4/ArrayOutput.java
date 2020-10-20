package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[5];
        int space = 0;

        System.out.println("Enter numbers: ");
        for (int index = 0; index < a.length; index++) {
          for (iny j = 0; j < space; j++){
            System.out.print(" ");
          }
          space++;
          System.out.println(a[i])
        }

        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Numbers: " + numbersAsString);
    }

}
