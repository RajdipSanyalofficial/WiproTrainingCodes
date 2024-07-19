package basics;

import java.util.Scanner;

public class Area {


    public static void main(String[] args)
    {
        float r,a;
        final float PI = 3.14f;

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter value of r");

        r=sc.nextFloat();

        a=PI*r*r;

        System.out.println("The area of circle is:"+String.format("%.2f"));
    }
}
