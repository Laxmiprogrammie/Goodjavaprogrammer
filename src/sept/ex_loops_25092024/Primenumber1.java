package sept.ex_loops_25092024;

public class Primenumber1 {
    public static void main(String[] args){
        int number=6;
        int count=0;
        for(int i=1;i<=7;i++)
        {
            if(number%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("number is prime "+number);
        }
        else
        {
            System.out.println("not prime");
        }
    }
}
