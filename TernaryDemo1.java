/**
 *  Program to find max of 2 Numbers using Ternary  Operator
 */



package basics;

import java.util.Scanner;
public class TernaryDemo1 {

    public static void main(String[] args){


        int num1,num2,result;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter 2 Numbers :");
        num1=scanner.nextInt();
        num2=scanner.nextInt();

        String msg=(num1>num2) ? "num1 is greatest":"num2 is greatest";
        System.out.println(msg);

        result=(num1>num2)?num1:num2;
        System.out.println("The maximum of 2 number is :"+result);
    }




}
