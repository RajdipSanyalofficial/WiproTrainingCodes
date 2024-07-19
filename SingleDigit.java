package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SingleDigit {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num;

        System.out.println("Enter a number :");
        num = Integer.parseInt(br.readLine());

        /*Logical Operators are used to combine Multiple conditions
         * && - All conditions should be TRUE, || - Any one Condition Should be TRUE
         * ! - Negate the Condition */

        if(num < 10 && num > -10)
            System.out.println(num+" is a Single Digit");
        else
            System.out.println(num+" is not a Single Digit");
    }
}

