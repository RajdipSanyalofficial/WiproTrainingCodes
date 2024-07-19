package basics;

public class DoWhileDemo {

    public static void main(String[] args)
    {
        int i=1;

        //Loop executes at least once
        do{
            System.out.println(i);
            i=i+1;
        }
        while (i<5);
    }
}
