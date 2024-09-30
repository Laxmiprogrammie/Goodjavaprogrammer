package sept.switchcode;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] Args)
    {
        char a='e';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int i= sc.nextInt();
        if(i>=18)
        {
            System.out.println("eligible to vote");
        }
        else
        {
            System.out.println("Not eligible for vote");
        }
        switch(a)
        {
            case 'i':
                System.out.println("vowel");
                break;
            case 'a':
                System.out.println("vowels");
                break;
            case 'e':
                System.out.println("vowels");
                break;
            case 'o':
                System.out.println("vowels");
                break;
            default:
                System.out.println("consonants");
                break;


        }
    }
}
