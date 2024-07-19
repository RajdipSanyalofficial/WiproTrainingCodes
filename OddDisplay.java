/**
 * Program to display Odd Numbers from 1 to 10.
 */

package basics;

public class OddDisplay {
    public static void main(String[] args)
    {
        int i=1; //Loop initialization

        System.out.println("******Odd Numbers from 1 to n ******");
        while(i<=10){ //Set Condition
            if(i%2==1) {
                System.out.println(i);
            }
            i=i+1; //Step-Increment the Loop
        }
        System.out.println("Loop Terminated");

    }
}
