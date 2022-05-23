






import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        List<String> datos = new ArrayList<>();
        minuscula(datos);
        System.out.println("Este programa convierte un texto de minuscula a totalmente mayuscula");
        System.out.println("Por favor, ingrese un texto en minuscula");
        Scanner leer = new Scanner(System.in);
        String texto = leer.nextLine();
   }
    public static void minuscula(List<String> datos){
            datos.add("a");
            datos.add("b");
            datos.add("c");
            datos.add("d");
            datos.add("e");
            datos.add("f");
            datos.add("g");
            datos.add("h");
            datos.add("i");
            datos.add("j");
            datos.add("k");
            datos.add("l");
            datos.add("m");
            datos.add("n");
            datos.add("ñ");
            datos.add("o");
            datos.add("p");
            datos.add("q");
            datos.add("r");
            datos.add("s");
            datos.add("t");
            datos.add("u");
            datos.add("v");
            datos.add("w");
            datos.add("x");
            datos.add("y");
            datos.add("z");
        }
 
}