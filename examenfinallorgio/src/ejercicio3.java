import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
/*
3. La organización de un torneo de videojuegos te encarga desarrollar un programa para
la gestión del mismo, consultar los resultados y realizar algunas estadísticas. Para ello el
programa necesita la siguiente funcionalidad:
a. Pedir al usuario cuantos jugadores 8ene el torneo
b. Pedir el nombre de los n jugadores del torneo
c. Puntuar a cada jugador con un random entre 1-10
d. Mostrar el jugador con más puntos y con menos puntos
e. Mostrar la can8dad media de puntos
*/
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce el numero de jugadores");
        int cantidad = lector.nextInt();
        int[] numero = new int[cantidad];
        String[] nombre = new String[cantidad];
        int puntuacionMasalta = 0;
        int puntuacionMasbaja = 0;
        int mejorposicion = 0;
        int peorposicion = 0;
        int notamedia = 0;
        System.out.println("Introduce el nombre de los jugadores");
        for (int i = 0; i < cantidad; i++) {
            nombre[i] = lector.nextLine();
            numero[i] = (int) (Math.random() * 10 + 1);
            for (int j = 0; j < i; j++) {
                if (numero[i] > puntuacionMasalta) {
                    puntuacionMasalta = numero[i];
                    mejorposicion = i;
                }
                if (numero[i] < puntuacionMasbaja) {
                    puntuacionMasbaja = numero[i];
                    peorposicion = i;
                }
                notamedia += numero[i] / cantidad;
            }
        }
        System.out.println("El jugador con la puntuacion mas alta es =\t" + nombre[mejorposicion] + "con un= " + puntuacionMasalta);
        System.out.println("El jugador con la puntuacion mas baja es =\t" + nombre[peorposicion] + "con un= " + puntuacionMasbaja);
        System.out.println("puntuacion media es=\t " + notamedia);

    }
}
