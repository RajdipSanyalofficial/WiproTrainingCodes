/*
*Program to find sum of positive numbers

 */

package basics;

import java.util.Scanner;
public class SumPositive {

    public static void main(String[] args)
    {
        int sum=0,number=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number :");
        number=sc.nextInt();

        if(number>0)
        {
            sum=sum+number;
        }
        while (number>0);

        System.out.println("The sum of Positive numbers entered by user is :"+sum);
        sc.close();
    }

}
