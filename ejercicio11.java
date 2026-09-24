import java.util.Scanner;

public class ejercicio11 {
    /*Hágase una aplicación que lea un entero entre 0 y 100.
     Compruébese (mostrándose verdadero o falso) las siguientes condiciones:
     a) Es par

b) Es mayor que 50

(CompararEntero)

*ENTRADA/SALIDA*

Escribe un entero entre 0 y 100: **55**

Par: false

Mayor que 50: true*/
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int numero = lector.nextInt();
        boolean condicionMayor = numero >50;
        boolean condicionPar = numero%2 == 0;
        System.out.println("El numero es: "+condicionPar);
        System.out.println("El numero es mayor de 50 "+condicionMayor);
        System.out.println("El dos condiciones se cumplen"+(condicionMayor + condicionPar));

    }}

