package Methodtypes;

public class AlltypeofMethod_Profile {
    //no return type no arguement
    //here we are not passing any arguemnet.and return also not passing
    public static void display()
    {
        System.out.println("Your profile details");
        return;
    }

    //No returntype with arguements
    public static void eyes(String colour,  String shape)
    {
        System.out.println("colour of eye is"+colour +"shape of eye is"+shape);
    }
    //with return type and with arguement
    public static int Age(int ageoflaxmi)
    {

        System.out.println("Giving your age details is");
       return ageoflaxmi;
    }
    //with returntype no arguemnts
    public static String Gender()
    {
        System.out.println("Your gender is");
        return "Female";

    }


    public static void main(String[] Args)
    {
        AlltypeofMethod_Profile profiledata=new AlltypeofMethod_Profile();
        display();
        profiledata.display();
        eyes("Black" ,"Round");
        //if we give sopln it automatically print return value also
        System.out.println(Age(25));
        System.out.println(Gender());
    }
}
