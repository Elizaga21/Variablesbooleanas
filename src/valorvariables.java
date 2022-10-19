import java.util.Scanner;


public class valorvariables {
    public static void main (String[] args) {
        boolean X , Y , Z ;
                Scanner leer = new Scanner(System.in);
        System.out.print("Introduce el valor de X (true or false):");
        X = leer.nextBoolean();
        System.out.print("Introduce el valor de Y (true or false):");
        Y = leer.nextBoolean();
        System.out.print("Introduce el valor de Z (true or false):");
        Z = leer.nextBoolean();

        System.out.print("Resultado:");
        System.out.println((X && Y) || (X && Z));


    }
}
