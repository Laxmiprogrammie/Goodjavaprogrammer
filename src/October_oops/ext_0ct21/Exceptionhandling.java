package October_oops.ext_0ct21;

import java.sql.SQLOutput;

public class Exceptionhandling {
    public static void main(String[] args) {
        int a=0;
        System.out.println("Start program");
        try {
            int c=10/a;


            System.out.println(c);
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e);
        }

        try {
            String s1=null;
            s1.trim();
        } catch (Exception e) {

            System.out.println(e);
        }


        System.out.println("ENd");
    }
}
