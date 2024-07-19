/**
 * Java program to display multiplication table of number
 */

package basics;

import java.util.Scanner;
public class Multiplication {

    public static void main(String[] args)
    {
        int num,mul,i=1;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a Number :");
        num=scanner.nextInt();

        while(i<=10){
            mul=num*i;
            System.out.println(num+" * " +i+" = "+mul);
            i=i+1;

        }
    }
}
