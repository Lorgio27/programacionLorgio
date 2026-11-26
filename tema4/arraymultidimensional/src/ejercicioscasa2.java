import java.util.Scanner;

public class ejercicioscasa2 {
    public static void main(String[] args) {
/*
Desarrolla un programa en Java que cumpla los siguientes requisitos:
- Solicitar 12 números enteros al usuario. ->FORIS Y SCANNER
- Almacenarlos en una matriz de 3 filas y 4 columnas. TAMAÑO ARRAYMULTIDIEMSIONAL
- Mostrar la matriz completa. MOSTRAR CON EL LOS FORIS
- Mostrar el número mayor y su posición.
- Mostrar el número menor y su posición.
- Contar cuántos números son pares e impares.
 */
        Scanner lector = new Scanner(System.in);
        int[][] numeros = new int[3][4];
        int numeroMayor = 0;
        int numeroMenor = 0;
        int numeroImpar = 0;
        int numeroPar = 0;
        int filaMayor = 0;
        int columnaMenor = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = lector.nextInt();
                if (i == 0 && j == 0) {
                    numeroMayor = numeros[i][j];
                    numeroMenor = numeros[i][j];
                }
                if (numeros[i][j] > numeroMayor) {
                    numeroMayor = numeros[i][j];
                    filaMayor = i;
                    columnaMenor = j;
                }
                if (numeros[i][j] < numeroMenor) {
                    numeroMenor = numeros[i][j];
                    filaMayor = i;
                    columnaMenor = j;
                }
                    if (numeros[i][j] % 2 == 0) {
                        numeroPar++;
                    }else{numeroImpar++;}
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
    }
}
