
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        System.out.println("Este programa permite mostrar la multiplicacion a traves de sumas sucesivas de dos numeros");
        System.out.println("Por favor, ingrese dos numero entero cualquiera");
        Scanner num1 = new Scanner(System.in);
        int a = num1.nextInt();
        Scanner num2 = new Scanner(System.in);
        int b = num2.nextInt();
        int producto = 0;
        while (a != 0) {
            producto = producto + b;
            a = a - 1;
        }
        System.out.println("El producto de los numeros ingresado, a traves de la sumas sucesivas es igual a: "+ producto);
    }
}
