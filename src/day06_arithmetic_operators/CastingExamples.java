package day06_arithmetic_operators;

public class CastingExamples {
    public static void main(String[] args) {

//        Type casting
//        changing the datatype from one to another
//        order:  [SMALL] byte -> short -> int -> long -> float ->
//        double [LARGE]
//        Smaller datatype --> Larger datatype
//        Widening convention happens automatically
//        int --> double
//        Larger datatype --> Smaller
//        Narrowing convention happens manually
//        double --> int
//        Formula to cast:
//        datatype variable = (datatype you are casting
//        to) variable/value
//        Data loss: sometimes when going from a bigger
//        number to a smaller number or a decimal number to a whole number there can
//        be data loss, which means the value is changed
//        char <> int

        short numOne = 40;
        float numTwo = numOne;  // short is smaller than float, so casting is needed from us

        System.out.println(numOne);
        System.out.println(numTwo);

        float num3 = 100.5F;
        short num4 = (short) num3; // float is bigger, so we cast down to short

        System.out.println(num3);
        System.out.println(num4);

        float num5 = 300;  // 300 is int default, at it automatically goes up to float
        byte num6 = (byte) num5;

        System.out.println(num5);
        System.out.println(num6);

        char latter = 'A';
        int latter2 = latter;

        System.out.println(latter);
        System.out.println(latter2);
        System.out.println((int)latter);
        System.out.println((char)66);
        System.out.println((int)'&');




    }


}
