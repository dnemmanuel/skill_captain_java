package day_three.assignment;
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = scannerObj.nextInt();
        scannerObj.nextLine();
        
        System.out.print("What is your first name? ");
        String name = scannerObj.nextLine();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        scannerObj.close();
    }
}
