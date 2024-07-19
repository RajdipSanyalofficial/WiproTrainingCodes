package basics;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args){

        char init;
        String fullName,firstName;
        int id;
        float marks;
        double salary;

        Scanner scanner = new Scanner(System.in);

        System.out.println("******************** Enter Employee Details ***********************");
        System.out.println("Enter employee ID     :");
        id = scanner.nextInt();
        System.out.println("Enter Initials        :");
        init = scanner.next().charAt(0);
        System.out.println("Enter your first name :");
        firstName = scanner.next();
        scanner.nextLine();
        System.out.println("Enter your full name  :");
        fullName = scanner.nextLine();
        System.out.println("Enter your marks      :");
        marks = scanner.nextFloat();
        System.out.println("Enter your salary :");
        salary = scanner.nextDouble();
        scanner.close();

        salary = salary + (salary * .10);

        System.out.println("******************** Wipro Employee Details **************************");
        System.out.println("Employee Id : "+id);
        System.out.println("Full name   : "+init+" "+fullName);
        System.out.println("First name  : "+firstName);
        System.out.println("Marks       : "+marks);
        System.out.println("Salary      : "+salary);
        System.out.println("************************************************************************");
    }
}
