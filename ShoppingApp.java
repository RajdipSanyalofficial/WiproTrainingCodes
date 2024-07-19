/**
 *  Code to create Simple Online Shopping App .
 *  Use do-while loop to repeatedly prompt the user for actions until they choose to exit
 */


package basics;

import java.util.Scanner;
public class ShoppingApp {

    public static void main(String[] args)
    {
        String userInput=null;
        Scanner sc=new Scanner(System.in);

        do{

            //Display Shopping Items
            System.out.println("Welcome To Our Online Shopping App");
            System.out.println("1. View Products");
            System.out.println("2. Add Products");
            System.out.println("3. Check Out");
            System.out.println("4. Exit");

            System.out.println("Enter Your Choice :");
            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Displaying Products ....."); break;
                case 2:
                    System.out.println("Adding Products ....."); break;
                case 3:
                    System.out.println("Checking Out .....");
                    break; //exit switch-case
                case 4:
                    System.out.println("Exiting Application. Good Bye!!!");
                    return;  //exit the main method
                default:
                    System.out.println("Invalid Choice. Please Try Again");
            }
            System.out.println("Do you Want to Continue Shopping ? (Yes/No) :");
            userInput=sc.next();

        }while(userInput.equalsIgnoreCase("Yes"));

        System.out.println("Thanks for Shopping with us !!!");
        sc.close();
    }
}
