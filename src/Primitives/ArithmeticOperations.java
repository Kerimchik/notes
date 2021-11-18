package Primitives;

public class ArithmeticOperations {

    public static void main(String[] args) {

        // addition


        int num1 = 7;
        int num2 =4;

        int sum = num1+ num2; //

        System.out.println("Total is " + (num1+num2));
        System.out.println(sum);

        // subtraction

        int difference = sum - 4;

        System.out.println("I am a  " + difference);


        //multiplication *


        double product = difference *2;
        System.out.println(product);

        // division /

        long division = 32/2;

        System.out.println(division);


        float divsion = 58/3f;   //// To get decimal or fractional results we need to specify by adding "d" & "f";
        System.out.println(divsion);



        // remainder -->leftover ; % modulus

       int a = 18;
       int b = 5;

       int modulus =  a%b;
        System.out.println(modulus);


        int remainder = 13%5;
        System.out.println(remainder);


//        int result = a/b;
//        int res = result*b;

        System.out.println( a - (a/b)*b);




        int x = 6;
        int y = 8;

        System.out.println(x+y);

        int xy = 36;
        int i = 6;

        System.out.println(xy/i);











    }


}
