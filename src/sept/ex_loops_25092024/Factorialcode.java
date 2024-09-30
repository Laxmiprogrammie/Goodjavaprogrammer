package sept.ex_loops_25092024;

import java.util.Scanner;

public class Factorialcode {
    public static void main(String[] Args){
        int n=5;
        int fact=1;
        System.out.println("printing factorial of 5");
        for(int i=1; i<=n;i++){

            fact=fact*i;
        }
        System.out.println("value of factorial:"+fact);

    }
}
