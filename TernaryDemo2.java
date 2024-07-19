/**
 *  Program to check whether the entered character is character or not  using Ternary  Operator
 */



package basics;

import java.util.Scanner;

public class TernaryDemo2 {

    public static void main(String[] args){


        char myChar;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a character :");
        myChar=scanner.next().charAt(0);
        String msg=(myChar>='a' && myChar <='z' || myChar>='A' && myChar <='Z') ?
         myChar+"is an Alphabet": myChar+"not an Alphabet";

        System.out.println(msg);
    }




}
