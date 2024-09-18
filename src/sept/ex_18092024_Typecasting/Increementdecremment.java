package sept.ex_18092024_Typecasting;

public class Increementdecremment {
    public static void main(String[] Args){
        int a = 10;
        System.out.println(  --a + a --  + a--); //9+9+8=26
        System.out.println(a);//7
        int a1 = 10;
        System.out.println(--a1 + a1++ + a1--); //9+9+10=28
        System.out.println(a1);//9
        int a2 = 10;
        System.out.println(a2-- + a2--  + a2--); //10+9+8=27
        System.out.println(a2);//7
    }
}
