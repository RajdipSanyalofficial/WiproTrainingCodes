/**
 * Program to display Names of Days using Switch-Case
 */


package basics;

import java.util.Scanner;

public class SwitchDemo2 {

    public static void main(String[] args)
    {

        float num1,num2,result;
        String operator;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter 2 Numbers :");
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        System.out.println("Enter Arithmetic Operator (+,-,*,/) :");
        operator=scanner.next();

        switch (operator)
        {
            case "+":
                result=num1+num2;
                System.out.println("The addition of 2 number is :"+result);
                break;

            case "-":
                result=num1-num2;
                System.out.println("The subtraction of 2number is :"+result);
                break;

            case "*":
                result=num1*num2;
                System.out.println("The multiplication of 2 number is :"+result);
                break;

            case "/":
                result=num1/num2;
                System.out.println("The division of 2 number is :"+result);
                break;


            default:
                System.out.println("Invalid Operator");
                break;

        }


    }


}
