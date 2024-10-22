package October_oops.ext_oct9_Polymorphism.Methodoverloading;

public class Mathoperation {

    //Methodoverloading means same methodname but different arguements

    int a=9;
    int b=8;

    int add(int a,int b)
    {
        System.out.println("Adding two number");
        return a+b;
    }


    String add(String a,String b)
    {
        System.out.println("Adding two string values");
        return a+b;
    }

    //String add(int c,int d)
    {
     //return "Lakshmi";
    }



}
