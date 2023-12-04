package day_4;
import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int numOne = scannerObj.nextInt();
        scannerObj.nextLine();

        System.out.print("Enter your second number: ");
        int numTwo = scannerObj.nextInt();
        scannerObj.nextLine();

        if(numOne > numTwo) {
            System.out.println("The larger number is: " + numOne);
        } else if(numOne < numTwo) {
            System.out.println("The larger number is: " + numTwo);
        } else {
            System.out.println("The numbers given are equal to each other.");
        }

        scannerObj.close();
    }
}
