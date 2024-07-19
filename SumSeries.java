/**
 * Java program to find Sum of Series from 1 to n.
 */

package basics;

import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args) {

        int num, sum =0;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a Number :");
        num=scanner.nextInt();

        while(num != 0){
            sum += num;
            num--;
        }
        System.out.println(num+"The sum of numbers till num is : "+sum);
    }
}



