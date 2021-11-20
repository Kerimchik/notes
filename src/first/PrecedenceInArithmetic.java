package first;

public class PrecedenceInArithmetic {
    public static void main(String[] args) {
        // First multiplication

        ///from left to right when they have the same power in such cases like 6/3*5%3

     /*
     *  10+4*5=30;
     * 6/3 + 5%3=  2+2 =4;
      * 6/3 + 5%3 - (4+1*   (2*4 + 1)) ==>   6/3 + 5%3 - (4+1* 9) =  6/3 + 5%3 - 13 = 2 + 2 -13 = -9;
     */

        int num1 =5;
        int num2 =10;

        int result = num1 + num2*num2+num1/3-1;  // VIP num1*num1=100   2. 5/3= 1; ==> 5 + 100+ 0
        System.out.println( result);

        int count = 6/3 + 5%3 - (4+1* (5*2 - 1));
        System.out.println(count);

        //PEMDAS stands for Parentheses;  Exponents; Multiplication; Division --> Modulus; Addition; Subtraction;

        int cows =12;

        int chicken =23;

        int cowLegs=4;
        int chickenLegs = 2;

        int total = cows*cowLegs + chicken*chickenLegs;
        System.out.println(total);

        double cowPrice = 2345;
        double chickenPrice = 23.99;

        double totalWorth = cows*cowPrice + chicken*chickenPrice;
        System.out.println(totalWorth);

    }




}
