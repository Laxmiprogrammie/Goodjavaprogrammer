package October_oops.ext_oct4_Constructors;

public class Dog {
    String name;//here created instance variables for the class
    int Legs;
    int Age;
    String colour;
//here created actions or methods or behaviour of the class
    void walk()
    {
        System.out.println("Dogs can wal");
    }
    void eyes()
    {
        System.out.println("Dogs can watch");
    }
//constructors we are creating
    Dog()//--it is default constructor
    {
        System.out.println("It is a default constructor");
    }
    Dog(String name,int Legs,int Age,String colour)
    {
        System.out.println("It is a parameterised constructor");
        this.name=name;
        this.Age= Age;
        this.Legs=Legs;
        this.colour=colour;
    }





    public static void main(String[] args)
    {
         Dog Streetdog =new Dog();
         Streetdog.name="Puppy";
         System.out.println(Streetdog.name);
         Dog Breeddog = new Dog("Candy",4,9,"White");
         System.out.println(Breeddog.name);
         System.out.println(Breeddog.Legs);
         System.out.println(Breeddog.Age);



    }
}
