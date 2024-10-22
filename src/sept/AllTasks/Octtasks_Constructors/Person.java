package sept.AllTasks.Octtasks_Constructors;

public class Person {

    //Create a Person Class with 10 A, 5 Behavr( All types of Methods) and use the DC and PC to set the values, Create 5 Objects.
    //Atributes
    String name;
    int age;
    int height;
    int fingers;
    String colour;
    String eyeshape;
    String haircolour;
    Boolean  ismale;
    int fee;
    //Behaviours:
    void walk()
    {
        System.out.println("Person can walk and no returntype no arguement");
    }
    String talk()
    {
        System.out.println("Person can talk and Yes return type and no arguement");
        return "wecantalk";
    }
    int hear(int k ,String name)
    {
       System.out.println("person can hear and yes return type yes arguement");
       return 1;

    }
    void sleep(String shape)
    {
        System.out.println("person can sleep and no return type yes arguement");
        sleep("round");
        return;
    }

    // Constructors we are righting here
    Person()
    {
        System.out.println("i am a default constructor");
    }
    Person(String name,int age,int height,String eyeshape)
    {
        System.out.println("i am a parametrised constructor");
        this.name=name;
        this.age=age;
        this.height=height;
        this.eyeshape=eyeshape;
    }
    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    //creating objects here so we start main method
    public static void main(String[] args)
    {
        Person Lakshmi= new Person();

        Person Vindya = new Person("Vindyarani",23,5,"Round");


        Person Deepika =new Person("Deepikaa",25);

        System.out.println(Vindya.name);
        System.out.println(Deepika.age);
    }





}





