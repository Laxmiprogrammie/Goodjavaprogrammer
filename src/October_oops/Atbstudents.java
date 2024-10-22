package October_oops;

public class Atbstudents {
    //classname is Atb student
    //State:-
    //..int age; String name; string colour

    //Behaviour:

    //talk,walk,hear
    int age;

    void talk()
    {

    }
    void walk()

    {
     System.out.println("I can walk");
    }

    public static void main(String[] args)
    {
        Atbstudents Lakshmi = new Atbstudents();
        Lakshmi.age = 25;
        Atbstudents  Vindhya = new Atbstudents();
        Vindhya.age=23;
        System.out.println("Lakshmi age is"+ Lakshmi.age);
        Lakshmi.walk();

    }



}
