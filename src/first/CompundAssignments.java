package first;

public class CompundAssignments {
    public static void main(String[] args) {
        // +=   -=  *=    /=     %=

        int number =5;
         int number1 = number +1;

         int number2 =10;
         number2 +=1; //<====> number2= number2+1;

         int number3 =number2;

         number3 -=number1; //5


        number3 *= number;

        System.out.println(number3);

        int num1 = 7;
        int num2 = num1+7;
        num1 +=num2;
        num2 -=8;
        System.out.println( num1);
        System.out.println( num2);


        int num3 =num1+num2;
        num2 +=num3;  // 27 += 6
        num1 +=num3;


        System.out.println(num3);//27
        System.out.println(num2);//33
        System.out.println(num1);//48



        // Compound assignment


        num1=4;
        num1 *=5;
        System.out.println(num1);//20


        num1 /=4;
        System.out.println(num1); //5


        //%


        num1 %= 2;
        System.out.println(num1);


        char ch1 = 'a';
        char ch2='m';
        char ch3='3';
        ch3 +='7';
        System.out.println("This is CH3 "  + ch3);

        ch2 *='3';
        System.out.println(ch2);

// Numeric values for char primitive data type will return


        ch1 %= 6;
        System.out.println("Thius "+ch1);  // It will give a 'A'. It takes numerical values from ASCII table, calculates a remainder, then goes to ASCII again and get the char for this remainder char value


        int remainder = ch1 % 5;
        System.out.println( "Heyl, any number/chaar I'll return you 1, okay "  +remainder);






    }


}
