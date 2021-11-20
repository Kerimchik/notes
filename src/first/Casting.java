package first;

public class Casting {

    public static void main(String[] args) {
        //implicit casting short sh1 = 34;  long l1=sh1;


        //explicit casting

        int i1=23;
        short sh2 =(short)i1;
        System.out.println(sh2);

        ////////////////


        long l2 = 56;
        int i2 = (int)l2;

        ////////////////////////////////

        int i3 =(int)7.8;

       //------------------------------------


        double db1 = 4.5;
        double db2 = 2.5;

        int sum1 = (int)(db1+db2);
        System.out.println(sum1);



        int number1 =23;

        long l1 =number1; // implicit casting (happens by java)

        short sh1 = (short)number1; // explicit casting


        byte by1 =1;
        byte by2 =2;

        // short sum1 = by1+by2; compile time error( due to numeric promotion
        // java wants to store the data into larger data type(int). because of that it isn't compiling

        short sum2 =(short)(by1+by2);

        // short sum2 =(short)(by1) +(short)(by2); // this is individual casting but the result is NOT


        double price =(int) 750.99;
        int pruce = (int)7.5;

        System.out.println( price /pruce);




    }
}
