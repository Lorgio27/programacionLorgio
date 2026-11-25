import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        //Hágase una aplicación que lea dos cadenas y las compare del siguiente modo:
        //a) Son iguales
        //b) La primerara es menor que la segunda
        //c) Son distintas
        //(CompararCadenas)
        //*ENTRADA/SALIDA*
        //Escribe una palabra: **hola**
        //Escribe una palabra: **adios**
        //Son iguales: false
        //La primera es menor que la segunda: false
        //Son distintas: true
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce la primera cadena de texto");
        String cadena1 = lector.nextLine();
        System.out.println("Introduce la segunda cadena de texto");
        String cadena2 = lector.nextLine();
        boolean iguales = cadena1.equals(cadena2);
        boolean menor = cadena1.length() < cadena2.length();
        boolean distintas = !iguales;
        System.out.println("Las cadenas son iguales" + iguales);
        System.out.println("Las cadenas son menores" + menor);
        System.out.println("Las cadenas son distintas" + distintas);


    }
}
