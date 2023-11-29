 package day_seven.assignment;

 import java.util.Arrays;

 public class arrays {
    public static void main(String[] args) {
        //1. Create an array of five integer values

        int[] numArr = new int[5];
        numArr[0] = 3;
        numArr[1] = 10;
        numArr[2] = 34;
        numArr[3] = 15;
        numArr[4] = 5;

        System.out.println("The working Array is " + Arrays.toString(numArr));

        //2. Calculate the sum of all the values in the array

        int arrSum = 0;
        for (int i = 0; i < numArr.length; i++) {
            arrSum = arrSum + numArr[i];
        }
        System.out.println("The sum of values in this array is " + arrSum);

        //Calculate and print the average (mean) of the values in the array

        float arrMean = (float) arrSum / numArr.length;
        System.out.println("The Average of the values in this array is " + arrMean);

        //Find and print the maximum value among the elements in the array

        int maxVal = numArr[0];
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] > maxVal) {
                maxVal = numArr[i];
            } 
        }

        System.out.println("The maximun value in this array is " + maxVal);

        //Find and print the minimum value among the elements in the array

        int minVal = numArr[0];
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] < minVal) {
                minVal = numArr[i];
            } 
        }

        System.out.println("The minimum value in this array is " + minVal);
    }
 }