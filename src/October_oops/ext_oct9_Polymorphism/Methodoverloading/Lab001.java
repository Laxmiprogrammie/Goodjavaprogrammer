package October_oops.ext_oct9_Polymorphism.Methodoverloading;

public class Lab001 {
    public static void main(String[] args) {

        Mathoperation Additionoftwonumbers = new Mathoperation();

        //Additionoftwonumbers.add(9,10);

       // System.out.println(Additionoftwonumbers.add(9,10));
        Mathoperation  Additionoftwostrings = new Mathoperation();
        Additionoftwostrings.add("Lakshmi","Devi");
        System.out.println(Additionoftwostrings.add("Lakshmi","Devi"));





    }
}
