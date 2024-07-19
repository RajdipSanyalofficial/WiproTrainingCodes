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
