package day12_if_statements;

public class Biggest {

    public static void main(String[] args) {

        int num1 = 13;
        int num2 = 18;
        int num3 = 28;

        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1);
        }else if (num2 >= num1 && num2 >= num3 ){
            System.out.println(num2);
                    }else{
            System.out.println(num3);
        }

    }
}
