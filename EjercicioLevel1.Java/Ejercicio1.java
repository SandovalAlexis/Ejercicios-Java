import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args){
        Scanner nom = new Scanner(System.in);
        System.out.println("Este programa permite saludarte");
        System.out.println("Ingresa a continuacion tu nombre");
        String nombre = nom.nextLine();
        System.out.println("Hola "+ nombre);
    }
}