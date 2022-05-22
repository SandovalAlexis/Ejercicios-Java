import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        System.out.println("Este programa permite a traves de dos mumeros enteros ingresados por teclado");
        System.out.println("Ver la suma, resta, multiplicacion, division y modulo");
        Scanner num1 = new Scanner(System.in);
        System.out.println("Por favor, ingrese un numero entero cualquiera");
        int a = num1.nextInt();
        Scanner num2 = new Scanner(System.in);
        System.out.println("Por favor, ingrese otro numero entero cualquiera");
        int b = num2.nextInt();
        System.out.println("La suma es igual a: "+ (a + b));
        System.out.println("La resta es igual a: "+ (a - b));
        System.out.println("EL producto es igual a: "+ (a * b));
        System.out.println("La divion es igual a: "+ (a / b));
        System.out.println("El modulo es igual a: "+ (a % b));
    }
}
