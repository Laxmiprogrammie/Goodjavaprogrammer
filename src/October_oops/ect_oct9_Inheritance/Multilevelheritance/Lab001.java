package October_oops.ect_oct9_Inheritance.Multilevelheritance;

public class Lab001 {
    public static void main(String[] args) {
        Child_MLH Lakshmi =  new Child_MLH();
        Lakshmi.car();

        Father_MLH Ram = new Father_MLH();
        Ram.fields();
        System.out.println(Ram.surname);
    }
}
