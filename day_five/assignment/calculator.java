package day_five.assignment;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int numOne;
        int numTwo;
        int result;
        char operator;

        System.out.print("Enter your First Number: ");
        numOne = scannerObj.nextInt();
        scannerObj.nextLine();

        System.out.print("Enter your Second Number: ");
        numTwo = scannerObj.nextInt();
        scannerObj.nextLine();

        System.out.print("Pick an operatior (-) / (+) / (*) / (/): ");
        operator = scannerObj.next().charAt(0);

        result = 0;
        switch (operator) {
            case '-':
                result = numOne - numTwo;
                break;

            case '+':
                result = numOne + numTwo;
                break;

            case '*':
                result = numOne * numTwo;
                break;

            case '/':
                result = numOne / numTwo;
                break;

            default:
                System.out.print("Operator enetered is invalid");
                break;
        }

        System.out.print("The result of your operation is: " + result);
        scannerObj.close();
    }
}
