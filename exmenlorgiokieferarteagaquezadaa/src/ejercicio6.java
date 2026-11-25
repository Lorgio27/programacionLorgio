import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
/*
6. (2 puntos) Desarrolla un programa en Java que permita registrar, calcular e
informar las notas de varios alumnos utilizando arrays.
a. Declara un array de tipo double para almacenar las notas de 10 alumnos.
b. Solicita al usuario que introduzca las 10 notas. En caso de introducir una
nota inferior a 0 y superior a 10 volverá a pedirla hasta que se introduzca
una válida.
c. Una vez hecho esto, calcula y muestra:
i. La nota media de la clase.
ii. La nota más alta y la más baja.
iii. Cuántos alumnos han aprobado (nota igual o mayor a 5) y cuántos han
suspendido.
 */
        Scanner lector = new Scanner(System.in);
        double[] notas = new double[0];
        System.out.print("Introduce las notas: ");
        for (int i = 0; i < 10; i++) {
            notas[i] = lector.nextDouble();
            boolean valido = false;
            do {
                for (int j = 0; j < i; j++) {
                    if (notas[i] > 0 || notas[i] > 10) {
                        valido = true;
                    }
                }
            } while (true);
        }
        int notaAlta = 0;
        int notaBaja = 10;
        int numeroSuspensos=0;
        double notaMedia = 0;
        for (int j = 0; j <notas.length; j++) {
            if (notas[j] > notaAlta) {
                notaAlta = j;
            } else if (notas[j] < notaBaja) {
                notaBaja = j;
            }
            notaMedia += notas[j];
            if (notas[j]<5) {
                numeroSuspensos++;
            } double notaMediaclase= notaMedia/10;
        }System.out.println("La nota mas alta es "+notaAlta+"la mas baja es "+notaBaja+"la nota media de la clase es "+notaMedia);
    }
}


