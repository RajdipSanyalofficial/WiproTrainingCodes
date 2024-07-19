package basics;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args)
    {
        char init;
        String fullname, firstname;
        int id;
        float marks;
        double salary;
        Scanner sc =new Scanner(System.in);

        System.out.println("************ Enter Employee Details **************");

        System.out.println("Enter Employee id:  ");
        id=sc.nextInt();

        System.out.println("Enter Initials:  ");
        init=sc.next().charAt(0);

        System.out.println("Enter Your Firstname:  ");
        firstname=sc.nextLine();

        System.out.println("Enter Your Fullname:  ");
        fullname=sc.nextLine();

        System.out.println("Enter Your Marks:  ");
        marks=sc.nextFloat();

        System.out.println("Enter Your Salary:  ");
        salary=sc.nextDouble();

        sc.close();



        salary=salary+(salary*0.10);


        System.out.println("************ Wipro Employee Details *************8");

        System.out.println("Employee id  "+ id);


        System.out.println("Enter Initials:  "+init);


        System.out.println("Enter Your Firstname  :"+firstname);


        System.out.println("Enter Your Fullname:  "+fullname);


        System.out.println("Enter Your Marks:  "+marks);


        System.out.println("Enter Your Salary:  "+salary);


    }
}
