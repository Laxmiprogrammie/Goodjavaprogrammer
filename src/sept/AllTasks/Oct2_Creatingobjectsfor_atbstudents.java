package sept.AllTasks;

import com.sun.tools.javac.Main;

public class Oct2_Creatingobjectsfor_atbstudents {
    //states:
    int age;
    String name;
    String colour;
    String Haircolour;
    Boolean isfeepaid;
    int experience;

    //behaviour:
    void listen()
    {
        System.out.println("They can listen carefully");

    }
    void talk()
    {
        System.out.println("They can talk");
    }
    void  eye()
    {
        System.out.println("They can see");
    }


    public static void main(String[] args) {
        Oct2_Creatingobjectsfor_atbstudents Lakshmi = new Oct2_Creatingobjectsfor_atbstudents();
        Lakshmi.age = 25;
        System.out.println(Lakshmi.age);
        Oct2_Creatingobjectsfor_atbstudents Vindhya = new Oct2_Creatingobjectsfor_atbstudents();
        Vindhya.colour = "White";
        Oct2_Creatingobjectsfor_atbstudents Jyoo = new Oct2_Creatingobjectsfor_atbstudents();
        Jyoo.Haircolour ="Black";
        Oct2_Creatingobjectsfor_atbstudents Priya = new Oct2_Creatingobjectsfor_atbstudents();
        Priya.eye();
        Oct2_Creatingobjectsfor_atbstudents Deepika = new Oct2_Creatingobjectsfor_atbstudents();
        Deepika.listen();



    }
}
