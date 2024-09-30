package sept.AllTasks;

import java.util.Scanner;

public class Sep27_do_dowhile {
    public static void main(String[] args) {
        //Give me example of while vs do while loop in Lab ex.

        int i =17;
        do
        {
          System.out.println("Allow to vote");
          i++;
        }while(i<=18);

        Scanner Vote = new Scanner(System.in);
        System.out.println("Enter ur age");
        int enterage=Vote.nextInt();

        while(enterage<=18)
        {

            System.out.println("Eligible to see cartoon age is"+enterage);
            enterage++;
        }


    }
}
