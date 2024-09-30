package sept.AllTasks;

public class Sep27_Evennumberpgrm {
    public static void main(String[] args) {


        //Create a Java program that prints the first 5 even numbers using a do-while loop.
        int i=1;
        int count=0;
        do {
            if (i % 2 == 0) {
            System.out.println("Evennumber valueis" + i);
            count++;
            }
            i++;
        }while(count<=10);




    }




}
