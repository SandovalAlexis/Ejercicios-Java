import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Este programa permite realizar la operacion de potencia");
        System.out.println("Por favor, ingrese un numero entero");
        Scanner valor1 = new Scanner(System.in);
        int num1 = valor1.nextInt();
        System.out.println("A hora ingrese otro valor entero que sera la potencia,\n a la que quiera elevar el numero anterior");
        Scanner valor2 = new Scanner(System.in);
        int num2 = valor2.nextInt();
        int potencia = 1;
        while (num2 != 0) {
            potencia = potencia * num1;
            num2 --;
        }
        System.out.println("La potencia del numero ingresado es : " + potencia);
    }
}
