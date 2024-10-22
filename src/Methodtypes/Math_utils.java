package Methodtypes;

public class Math_utils {
    public static String Addition(int a,int b)
    {

        System.out.println("Sum of a and b is"+ (a+b));
        return "We added two numbers";
    }

    public static void main(String[] args) {
        Addition(3,5);
        System.out.println((Addition(6,4)));
    }
}
