/**
 * Program to display name in 10 times
 */

package basics;

public class WhileDemo {
    public static void main(String[] args)
    {
        int i=1; //Loop initialization

        System.out.println("******Forward Loop******");
        while(i<=10){ //Set Condition
            System.out.println(i+".Rajdip Sanyal");
            i=i+1; //Step-Increment the Loop
        }
        System.out.println("Loop Terminated");


        System.out.println("******Reverse Loop******");

        int j=50;

        while(j>=10)
        {
            System.out.print(j+"\t");
            j=j-1; //Step - Decrement the Loop
        }
        System.out.println("Loop Terminated");
    }
}
