package Primitives;

public class NewRemainder {

    public static void main(String[] args) {

        int fNum = 456;

        int dig3 = fNum%10;
        fNum=fNum/10;
        int dig2 = fNum%10;
        fNum=fNum/10;
        int dig1 = fNum%10;


        System.out.println(dig1);
        System.out.println(dig2);
        System.out.println(dig3);

        int product = dig1*dig2*dig3;
        System.out.println(product);



    }



}
