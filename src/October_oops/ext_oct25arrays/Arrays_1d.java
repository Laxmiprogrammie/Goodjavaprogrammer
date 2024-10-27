package October_oops.ext_oct25arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Arrays_1d {
    public static void main(String[] args) {
        int[] mymarks = {99, 98, 97, 99};//fixed array elemnts declared
        System.out.println(mymarks[0]);
        System.out.println(mymarks.length);


        //first we are creating arrayslenght after we declare values

        int[] marks = new int[5];

        marks[0] = 100;
        marks[1] = 97;
        marks[2] = 98;
        marks[3] = 96;
        marks[4] = 99;
        Arrays.sort(marks);//it will rearragne the marks by ascending order


        for(int i=0;i<marks.length ;i++)
        {
          System.out.println(marks[i]);
        }
    }
}
