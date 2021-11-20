package first;

public class UnirayOperators {
    public static void main(String[] args) {



        /*
        * increment --> It will increase the value by 1
        * pre-increment -->  It will increase the value by 1 before using It
        *      * post-increment -->  It will increase the value by 1 after using It
        decrement --> It will decrease the value by 1
         * pre-decrement -->  It will decrease the value by 1 before using It
         * post-decrement -->  It will decrease the value by 1 after using It
        * */

        int studentNumber = 25;

  /*      studentNumber++  //Post -Increment ==> after this line studentNumber is 26;
        ++studentNumber //--> pre-increment --> studentNumber is 27 on this line*/

        studentNumber = studentNumber++;
        System.out.println(studentNumber);


        studentNumber = studentNumber++;
        System.out.println(studentNumber); // Its post-crement and gives only 25

        studentNumber = studentNumber++;  // Its post-crement and gives only 25
        System.out.println(studentNumber);

        studentNumber = ++studentNumber;
        System.out.println(studentNumber);

        studentNumber = ++studentNumber;
        System.out.println(studentNumber);

         int count =5;

        System.out.println(count++);  //5   ==> we are not reassigning like in the example with studentName
        System.out.println(++count);    //7


        int numberOfStudents = 30;

/*        System.out.println("NUMBER THIRTY ONE STUDENT: " + ++numberOfStudents);  //
        System.out.println("NUMBER THIRTY TWO STUDENT: " + ++numberOfStudents);
        System.out.println("NUMBER THIRTY THREE STUDENT: " + ++numberOfStudents);*/

        System.out.println("NUMBER THIRTY  STUDENT: " + numberOfStudents++); //SHOWS THIRTY BUT IS 31
        System.out.println("NUMBER THIRTY ONE STUDENT: " + numberOfStudents++);
        System.out.println("NUMBER THIRTY TWO STUDENT: " + numberOfStudents++); // Shows 32, but it is 33

        int newNum = numberOfStudents + 2;
        System.out.println(newNum);  //numberOfStudents was actually 33 as in the line , so +2 is = to 35



        int cowQ = 20;
        System.out.println("Quantity of cows: #" + cowQ++);// shows 20 but it is 21 ---Post-increment
      //  System.out.println( cowQ);   // Shows actual value from  line 60

        //----------------------------------------------


        int number =8;


        System.out.println(number--); //shows 8 but it is 7
        System.out.println(number--); //shows 7 but it is 6

        System.out.println(--number); //shows 5 and it is 5


        number++; // 6       7          8
        System.out.println(number++ + number++); // shows 13 and number becomes 8

        System.out.println(number);

        //              7            6              6 --------> next time when we use it will be =7 --see line 84
        int result =  --number + --number +2 - number++ *2;
        System.out.println(result);

        System.out.println(number);



        int a = ++number;

        System.out.println(number);

        System.out.println(number);










    }
}
