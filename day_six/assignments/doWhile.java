package day_six.assignments;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int val;

        do {
            System.out.println("Enter a number within the range of 1 and 10: ");
            val = scannerObj.nextInt();
        } while (val < 1 || val > 10);

        System.out.println("You entered " + val + ".");
        scannerObj.close();
    }
}
