package sept.Tasksep13;

public class Task13thsep {


    //Write a program to print the table of number which user will give( int num 10)
    //output will be like this (by using the printf()
    //10 × 1 = 10
    //10 × 2 = 20
    //10 × 3 = 30….
    //10 × 10 = 100.

    public static void main(String[] Args)
    {
        int num=10;
        for(int i=1;i<=10;i++)
        {
            System.out.println(num + "*" + i + "="+ num*i);
        }
    }
}



