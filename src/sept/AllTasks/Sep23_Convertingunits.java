package sept.AllTasks;

import java.util.Scanner;

public class Sep23_Convertingunits {
    public static void main(String[] Args)
    {
        //Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
            //Input. -
            //choice - 1 - km → m, km → 1km
        //choice - 2 - f → c, f → c

        Scanner units= new Scanner(System.in);
        System.out.println("Enter the number to conver Kms to Meters");
        int Conertingnumber=units.nextInt();

        int f = Conertingnumber*1000;
        System.out.println("value of number in meters:"+ f);

    }
}
