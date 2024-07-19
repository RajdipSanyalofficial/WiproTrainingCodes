/**
 * BufferedReader is a class in the java.io package that provides a way to read input from a stream
 *  * in a buffered fashion.
 *  * This means that it reads data from the stream in chunks and stores it in memory,
 *  * allowing for more efficient reading of large amounts of data.
 *  * InputStreamReader is a class that converts an InputStream into a Reader.
 *  * It is used to read input from a stream of bytes into a stream of characters.
 *  * BufferedReader can work with InputStreamReader to read input of different data types.
 *  *
 *  * Java Program to demonstrate BufferReader methods for Taking Input at Runtime
 *  *
 *  * Calculate Simple Interest for a given Loan
 */


package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleInterest {
    public static void main(String[] args) throws IOException {

        String name;
        double loan,si;
        int term,rate;

        InputStreamReader reader = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(reader);

        System.out.println("Enter Customer Name        :");
        name = br.readLine();
        System.out.println("Enter loan amount          :");
        loan = Double.parseDouble(br.readLine());
        System.out.println("Enter loan term            :");
        term = Integer.parseInt(br.readLine());
        System.out.println("Enter the rate of interest :");
        rate = Integer.parseInt(br.readLine());

        si = (loan*rate*term)/100;

        System.out.println("***************** Simple Interest Calculation ********************");
        System.out.println("Customer Name          :"+name);
        System.out.println("Loan amount            :"+loan);
        System.out.println("Term                   :"+term);
        System.out.println("Rate of interest       :"+rate);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Simple Interest        :"+si);
        System.out.println("*******************************************************************");

        br.close();
    }
}

