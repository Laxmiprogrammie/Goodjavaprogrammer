package October_oops.ext_oct4_Constructors;

public class Ahuman {

    String name;
    int age;
    int Height;
    String colour;


    Ahuman()
    {
        System.out.println("I am a default consturcyor");
    }
    Ahuman(String name)
    {
        System.out.println("I am a Pramaterised consturcyor");
        this.name=name;
    }

    Ahuman(String name,int age,int Height)
    {
        System.out.println("I am a paramaterised constructor consturcyor");
        this.name=name;
    }


    Void talk()
    {
        System.out.println("We are humans so we can talk and No returntype no arguement");
        return null;
    }
    String eat()
    {
        System.out.println("we can eat and Yes returntype and no arguements");
        return "humans can eat";
    }





}
