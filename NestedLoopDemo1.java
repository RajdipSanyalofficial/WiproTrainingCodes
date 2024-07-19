package basics;

public class NestedLoopDemo1 {

    public static void main(String[] args)
    {
        //Outer Loop
        for(int i=1;i<=5;i++) // 1 2 3 4 5 =5
        {
            //Nested Loop/Inner Loop executes based on value on i
            for(int j=1;j<=i;j++) // 1 2 3 4 5  = 15
            {
                System.out.println(j+"\t");
                System.out.println("*"+"\t");
            }
            System.out.println();
        }
    }
}
