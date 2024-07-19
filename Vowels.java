/**
 * Program to count Vowels in a String
 */

package basics;

import java.util.Scanner;
public class Vowels {

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String sentence;

        System.out.println("Enter a String :");
        sentence=scanner.nextLine();

        String sentence1=sentence.toLowerCase();
        int count=0;
        scanner.close();

        for (int i=0;i<sentence.length();i++){

            if(sentence1.charAt(i)=='a' || sentence1.charAt(i)=='e' || sentence1.charAt(i)=='i' || sentence1.charAt(i)=='o'
                || sentence1.charAt(i)=='u'){
                count+=1;
            }
        }
        System.out.println("The total number of Vowels in \""+sentence+"\" is :"+count);
    }
}
