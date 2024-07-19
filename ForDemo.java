package basics;

public class ForDemo {

    public static void main(String[] args) {
        int i, j;

        System.out.println("********** Display numbers from 1 to 10 **************");

        for (i = 1; i <= 10; i++) {
            System.out.println(i + ".Java\t");
        }
        System.out.println();


        System.out.println("********** Display numbers from 50 to 25 **************");

        for (j = 50; j >= 25; j--) {
            System.out.println(j + "\t");
        }
        System.out.println();


        System.out.println("********** Display Even numbers from 1 to 10 **************");

        for (i = 1; i <= 10; i++) {
            if (i % 2 == 0)
                System.out.println(i + "\t");
        }
        System.out.print(i+"\t");
    }
}

