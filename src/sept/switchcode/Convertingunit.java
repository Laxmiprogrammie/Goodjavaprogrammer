package sept.switchcode;

public class Convertingunit {
    public static void main(String[] args) {
        double num = 3.6;
        int convert = 2;
        switch (convert) {
            case 1:
                System.out.println("covert number to meters to kms");
                System.out.println("conerting to meters"+(num*1000)+"meters");
            case 2:
                System.out.println("convertin number to Fahrenhit");
                System.out.println((num*1.8)+32 +"Celsius");


        }
    }
}

