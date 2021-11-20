package Primitives;

public class RemainderPractice1 {

    public static void main(String[] args){

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
        int number1 = 45;
        int number2 = 6;
        int remainder1 = 45%6;
        System.out.println(remainder1);


        // find the sum of digits from given number ====> sout(sum is >> <sum>)   123==> 1+2+3=6sum

/*        123%10 ===> 3
                12%10 ===>2
                1%10 ===>1*/

        int myNumber = 123;
        int digit3 = myNumber%10;
        myNumber=myNumber/10;
        int digit2 = myNumber%10;
        myNumber=myNumber/10;
        int digit1 = myNumber%10;
        System.out.println( digit2);
        System.out.println( digit3);
        int sum =  digit1+digit2+digit3;
        System.out.println(sum);

        int secNum = 3666;

        int dig4 = secNum%10;
        secNum=secNum/10; // 3666/10 = 366

        int dig3 = secNum%10;
        secNum=secNum/10; //366/10=36

        int dig2 = secNum%10;
        secNum=secNum/10; // 36/10=3

        int dig1 =secNum%10;

        System.out.println(dig1);
        System.out.println(dig2);
        System.out.println(dig3);
        System.out.println(dig4);

        System.out.println(dig1+dig2+dig3+dig4);







    }

}
