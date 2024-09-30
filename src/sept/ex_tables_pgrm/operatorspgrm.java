package sept.ex_tables_pgrm;

public class operatorspgrm {
    public static void main(String[] Args) {
        int a = 2;
        int b = 3;
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a-b);
        System.out.println(a/b);




      //100 natural numbers sum   // n=0/i=0 n=n+i=2
     // 1 to 10 primenumbers print 5

        for(int i=2;i<=20;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
               if(i%j==0)
               {
                   count++;
               }

            }
            if(count<=2)
            {
                System.out.println("Number is prime:"+i);
            }

        }




    }

}
