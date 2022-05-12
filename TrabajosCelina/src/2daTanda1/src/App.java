import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        int A, B, C;
        System.out.println("Ingrese el primer valor");
        A = sc.nextInt(); 
        System.out.println("Igrese el segundo valor");
        B = sc.nextInt();
        System.out.println("Los valores ingresados son: " + A + B);
        C = A + B;
        B = C - B;
        A = C - A;
        System.out.println("Los valores intercambiados de A serian: " + A + " Y los valores de B serian: " + B);
    

    }
}
