package basics;

public class NestedLoopDemo {

    public static void main(String[] args)
    {
        //Outer Loop
        for(int i=1;i<=5;i++) // 1 2 3 4 5 =5
        {
            //Nested Loop/Inner Loop
            for(int j=1;j<=5;j++) // 5 5 5 5 5 =25
            {
                System.out.println(j+"\t");
                System.out.println("*"+"\t");
            }
            System.out.println();
        }
    }
}
