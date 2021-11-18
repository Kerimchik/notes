package Primitives;

public class DataTypes {

    public static void main (String[] args){

        byte myAge= 23;

        // sout + tab will bring this ----->> System.out.println();

        System.out.println(myAge);

        myAge= 32;

        System.out.println(myAge);

        // byte yourAge=129 it won't work because it is too big. !!!Only till 127

        short number1 =1;
        System.out.println(number1);

        short number2 = 32657;

        int number3 = -679;
        System.out.println(number3);

        long number4 = 123343732736727L;  // If you give too big number, you should tell to Java by putting l/L in the end

        System.out.println(number4);


        float number5 = 1.5f;
        System.out.println(number5);

        float number7 = 7; // It will work because it will consider it like 7.0;
        System.out.println(number7);

        double number6 = 1.8;
        System.out.println(number6);


        double number87 = 8_7.9;
        System.out.println(number87);




    }



}
