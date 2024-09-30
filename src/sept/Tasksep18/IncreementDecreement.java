package sept.Tasksep18;

public class IncreementDecreement {
    //int a = 10;
    //System.out.println(  --a + a --  + a-); System.out.println(a);
    //
    //int a = 10;
    //System.out.println(  --a + a++ + a—); System.out.println(a);
    //
    //int a = 10;
    //System.out.println(  a- - + a --  + a --); System.out.println(a);

    public static void main(String[] Args)
    {
        int a=10;
        System.out.println(--a + a++ + a--); // 9+9+10=28   // 9
        System.out.println(a); //9

        System.out.println(  --a + a++ + a--); //8+8+9 =25,
        System.out.println(a);//8

    }
}
