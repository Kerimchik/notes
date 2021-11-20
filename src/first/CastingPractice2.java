package first;

public class CastingPractice2 {

    public static void main(String[] args) {

        double number =3.45;
        float fl1 =(float) number; // without casting it won't work because it cannot store larger data type in smaller without CASTING
        long l1 = (long)fl1;
        int i1= (int)l1;
        short sh1 = (short)i1;
        byte by1 = (byte)sh1;
        System.out.println(by1);
      System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        int count =129; //It will continue cycle from 127 to -128;

        byte count2 = (byte)count;
        System.out.println("MEEE"+count2);





    }
}
