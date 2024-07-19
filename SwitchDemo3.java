/**
 * Program to display Shirt size using Switch-case
 */

package basics;

import java.util.Scanner;

public class SwitchDemo3 {

    public static void main(String[] args){

        int number;
        String size;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Your Shirt Size :");
        number=scanner.nextInt();
        scanner.close();

        switch (number) {
            case 1:
            case 2:
            case 3:
                size = "Kids";
                break;

            case 38:
                size = "Small";
                break;
            case 40:
                size = "Medium";
                break;
            case 42:
                size = "Large";
                break;
            case 44:
                size = "Extra Large";
                break;
            case 46:
                size = "Extra Extra Large";
                break;
            default:
                size = "Unknown Size";
                break;
        }
        System.out.println("The size of shirt is :"+size);
        }
    }

