package sept.ex_loops_25092024;
//prime number value greater than 1 undali
// factors are 1 and slef divisible ahvali so only two factors undali

public class Primenumber {
    public static void main(String[] Args) {
        //number divisible by 1 and itslef those are prime
        for (int i = 1; i <= 100; i++)  //i=1
        {
            int count = 0;
            for (int j=1; j<=i; j++) //j=1
            {
                if(i%j==0)   //1%1==0
                {
                    count++;
                }
            }
            if (count == 2)
            {
                System.out.print(i + ",");

            }
        }


    }
}
