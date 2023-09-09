package day_three.assignment;

import java.util.Scanner;

public class userInputValidation {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in); // creates scanner object

        System.out.print("What is your age? "); // user prompt
        int age = scannerObj.nextInt(); // creates variable using user input
        scannerObj.nextLine(); // stores user input

        if (age <= 0) {
            System.out.println("The age provided is invalid!");
        } else {
            System.out.print("What is your first name? "); // user prompt
            String name = scannerObj.nextLine(); // store user input in variable 'name'

            System.out.println("Hello, " + name + "! You are " + age + " years old.");
            scannerObj.close();
        }
    }
}
