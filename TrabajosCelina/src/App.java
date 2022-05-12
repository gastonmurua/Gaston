import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el primer numero a sumar");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero a sumar");
        int num2 = sc.nextInt();
        int resultado = num1 + num2;
        System.out.println("El resultado de su suma es:" + resultado);

        
    } 
}