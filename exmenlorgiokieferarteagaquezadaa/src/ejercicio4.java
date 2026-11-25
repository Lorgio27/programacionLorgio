import java.util.Arrays;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
/*
4. (2 puntos) Crea un array de 10 posiciones y rellénalo con números aleatorios
entre el 1 y el 20, pudiendo repetirse. Una vez rellenado, crear un menú para que
el usuario seleccione la acción que quiere realizar:
a. Imprimir array
b. Mover a izquierda
c. Mover a derecha
d. Invertir
 */
        Scanner lector = new Scanner(System.in);
        int cantidad = 10;
        int[] numeros = new int[cantidad];
        int[] arraynumeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            arraynumeros[i] = (int) (Math.random() * 19 + 1);
        }
        System.out.println("Elige una opción\n 1.Imprimir el array \n 2.Mover hacia la izquierda \n 3.Mover hacia la derecha \n 4.Invertir ");
        int opcion = lector.nextInt();
        switch (opcion) {
            case 1 -> {
                System.out.println(Arrays.toString(arraynumeros));
            }
            case 2 -> {
                int auxiliar;
                int numeroBueno = 0;
                int numeroGuardado =0;
                for (int i = 0; i-1 < arraynumeros.length; i++) {
                    numeroGuardado += arraynumeros[i+1];
                    auxiliar = arraynumeros[i];
                    numeroBueno =  arraynumeros[i] + auxiliar ;
                }System.out.println(numeroBueno);

            }
            case 3 -> {
            }
            case 4 -> {
                for (int i = 0; arraynumeros.length > i; i++) {
                    System.out.println(arraynumeros[i]);

                }
            }
        default -> {
            System.out.println("No existe el valor");}
        }
    }
        }

