/**
 * Program to demonstrate break and continue statement
 */

package basics;

public class JumpDemo {

    public static void main(String[] args)
    {
        System.out.println("********** Break Statement ********");
        for (int i = 0; i < 10; i++) {
            if(i==5) break;
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println("********** Continue Statement ********");
        for (int i = 0; i < 10; i++) {
            if(i==5) continue; //skips current iteration and continues with the next iteration
            System.out.print(i+"\t");
        }
    }
}
