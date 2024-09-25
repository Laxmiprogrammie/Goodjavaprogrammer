package sept.switchcode;

public class Testingclasses{
    public static void main(String[] Args){
        String day="friday";
        switch(day){
            case "monday":
                System.out.println("Tstin academy calss is available on this day");
                break;
            case"tuesday":
                System.out.println("Testin class is not available on this day");
            case"wednesday":
                System.out.println("Testin class is available on this day");
            default:
               System.out.println("We dont have class on these days never");
               break;
        }
        
    }
}
