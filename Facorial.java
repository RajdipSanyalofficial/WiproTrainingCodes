/**
 * Java program to find Factorial of a number.
 */

package basics;

import java.util.Scanner;

public class Facorial {

    public static void main(String[] args)
    {
        int num,fact=0,i=1;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a Number :");
        num=scanner.nextInt();

        //Loop to find Factorial

        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }

        System.out.println("The Factorial of "+num+" is :"+fact);
        scanner.close();
    }
}
