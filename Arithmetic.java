
package basics;


import java.util.Scanner;

/**
 * Java Program to perform Arithmetic Operations using Scanner
 * from Java.util.Scanner for Dynamic Input from user at Runtime
 */
public class Arithmetic

{
    public static void main(String[] args) {
        int num1, num2, sum, diff, mul;
        float div;
        String name;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        name = scanner.next();

        System.out.println("Enter 2 numbers :");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        //process

        sum = num1 + num2;
        diff=num1-num2;
        mul=num1*num2;
        div=(float)num1/num2;

        System.out.println("********* Arithmetic Operations ***********");
        System.out.println("The addition of : "+num1+" and "+num2+" is :" +sum );
        System.out.println("The difference of : "+num1+" and "+num2+" is :" +diff );
        System.out.println("The multiplication of : "+num1+" and "+num2+" is :" +mul );
        System.out.println("The division of : "+num1+" and "+num2+" is :" +div );
        System.out.println("Myself "+name+" from Wipro Training");
        System.out.println("**********************************************************");

    }


}
