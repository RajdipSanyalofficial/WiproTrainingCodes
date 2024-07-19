package basics;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args){
        int num1,num2,num3;
        float avg;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        num1= scanner.nextInt();
        num2= scanner.nextInt();
        num3= scanner.nextInt();

        int sum = num2 + num1 + num3;

        avg = (float) sum /3;

        System.out.println("The sum of 3 numbers is :" + sum);
        System.out.println("The average of 3 numbers is :" + avg);
    }
}
