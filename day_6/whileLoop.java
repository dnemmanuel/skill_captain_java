package day_6;

public class whileLoop {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("The even numbers between 1 and 20 (inclusive) are:");
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
