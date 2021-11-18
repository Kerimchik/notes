package Primitives;

public class BooleanPractice {

    public static void main(String[] args) {

     boolean isHungry = true;
        System.out.println(isHungry);


        boolean isHungryMe = false;
        System.out.println(isHungryMe);


        System.out.println(true);  // Just prints true


        System.out.println(isHungry == isHungryMe); // Will give false because isHungry =true; isHungryMe =false; ---> false

        boolean isHungryy = true;
        boolean isLightOn = false;

        System.out.println(isHungryy);
        System.out.println(isLightOn);


        isLightOn=isLightOn;
        isLightOn = false; //====> it will be false because JAva reads from top to bottom




    }



}
