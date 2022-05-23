
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        System.out.println("Este programa te permite mostrar por pantalla una secuencia numerica de un valor entero");
        Scanner valor = new Scanner(System.in);
        System.out.println("Por favor, ingrese un numero entero");
        int num = valor.nextInt();
        String mostrar = "";
        for(int i=1; i<=num; i= i+1){
            mostrar = mostrar + "" + i;
           System.out.println(mostrar);  
        }
        System.out.println("Fin de la sucuencia");
    }
    
}
