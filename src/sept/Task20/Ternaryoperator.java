package sept.Task20;

public class Ternaryoperator {
    //By using Ternary Operators max between 3 numbers.
    //
    //// Input int - a,b,c - a = 10, b = 20, c = 45
    //
    //// Max → a,b,c → c
    public static void main(String[] Args)
    {
        int a=10;
        int b=-20;
        int c=-30;
        int max;

        max = a>b?(a>c?a:c):(b>c?b:c);
        System.out.println(max);




    }
}

