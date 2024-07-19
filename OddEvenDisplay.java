/**
 *
 *  Program to display Odd & Even Numbers between 1-10
 *  *
 *  * ODD     EVEN
 *  * ---     ----
 *  * 1       2
 *  * 3       4
 *  * 5       6
 *  * 7       8
 *  * 9       10
 *  */



package basics;

public class OddEvenDisplay {

    public static void main(String[] args){

        int i=1; //Loop initialization

        System.out.println("******Odd Even Numbers from 1 to n ******");
        System.out.println("Odd\tEven");
        System.out.println("-----\t------");

        while(i<=10) { //Set Condition
            if (i % 2 != 0){
                System.out.println(i+"\t\t");
        }

            else {
                System.out.println(i);
            }
            i=i+1; //Step-Increment the Loop

    }


}
}
