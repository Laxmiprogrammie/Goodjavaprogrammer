package sept.ex_loops_25092024;

public class Fcatorial {
    public static void main (String[] Args)
    {
        //6*5*4*3*2*1
        int num=6;
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i; //
        }
        System.out.println("factorial of "+ num +"is" + fact);
    }
}
