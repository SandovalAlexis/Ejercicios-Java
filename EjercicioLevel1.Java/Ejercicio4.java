
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        System.out.println("Este programa permite obtener el factorial de un numero entero");
        System.out.println("Por favor, ingrese un numero entero cualquiera");
        Scanner leer = new Scanner(System.in);
        int numero = leer.nextInt();
        int factorial = 1;

        while(numero != 0) {
            factorial *= numero;
            numero = numero - 1;
        }
        System.out.println("El factorial del numero ingresado es: " + factorial);
    }
}
