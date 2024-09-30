package sept.Tasksep18;

public class Implicityexplicty {
    //Give some another example of Widening with Implicit and Explicit, Narrowing with implicit and explicit.
    public static void main(String[] Args)
    {
        int a=133;
        byte b=(byte)a;  // byte size is less then int but here we are forcefully entering a(int)value
                         // into b(byte) so due to this some loss happens after loss how much it store
        System.out.println(b);

    }
}
