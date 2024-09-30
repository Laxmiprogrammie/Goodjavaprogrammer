package sept.AllTasks;

import java.util.Scanner;

public class Sep23_Monthpgrm {

    public static void main(String[] Args)
    {
        //Write a program that takes an integer input (1-12) and prints the name of the corresponding month using a switch statement.
        //Input  - 12
        //Out - Dec.
       Scanner month= new Scanner(System.in);
       System.out.println("Enter month in the format of number:/n");
       int monthnumber=month.nextInt();
        //int month=1;
        switch(monthnumber)
        {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;

        }
    }
}
