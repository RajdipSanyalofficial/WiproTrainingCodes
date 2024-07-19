/**
 * Debugging code refers to the process of identifying and fixing errors or bugs in a written code.
 *  * It is an essential step in the software development cycle to ensure that the code runs seamlessly and produces the desired output.
 *  * Debugging involves examining the code line by line, identifying the problematic sections, and making the necessary corrections.
 *  * This can be done using various tools and techniques, such as print statements, debuggers, and logging tools.
 *  * Effective debugging requires attention to detail, analytical skills, and a solid understanding of programming concepts and languages.
 *  *____________________________________________________________________________________________________
 *  * Steps to Debug a Code:
 *  * 1) Apply breakpoint  by clicking on line number in gutter area
 *  * 2) Click Debug icon & give inputs - program execution stops at Breakpoint
 *  * 3) In Debug window click StepOver Icon & examine code
 */


package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greatest2 {
    public static void main(String[] args) throws IOException {

        int num1,num2;

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        System.out.println("Enter 2 numbers :");
        num1 = Integer.parseInt(br.readLine());
        num2 = Integer.parseInt(br.readLine());

        if(num1 > num2)
            System.out.println(num1 + " is Greatest");
        else
            System.out.println(num2 + " is Greatest");

        br.close();
    }
}
