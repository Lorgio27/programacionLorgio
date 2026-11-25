import java.util.Arrays;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
/*
3. (2 puntos) Crea un programa que permita sumar arrays unidimensionales.
Para ello siguiente estos pasos:
a. Pide al usuario el tamaño de los arrays
b. Se crearán automáticamente dos arrays con números aleatorios entre 0 y 50
c. Se crea una tercer array llamado sumaArrays donde se guarda la suma de
las celdas de las generadas en el punto anterior
d. Mostrar cada uno de los arrays generados
 */
        Scanner lector =  new Scanner(System.in);
        System.out.println("Introduce el tamaño de los arrays");
        int tamaño  = lector.nextInt();
        int [] randomArray = new int[tamaño];
        int [] randomArray2 = new int[tamaño];
        int [] sumaArrays = new int[tamaño];
        for (int i = 0; i <tamaño ; i++) {
            randomArray[i] = (int)(Math.random()*51);
            randomArray2[i] = (int)(Math.random()*51);
        }
        for (int i = 0; i <tamaño; i++) {
            sumaArrays[i] =  randomArray[i] + randomArray2[i];
        }
        System.out.println("Los arrays generados son"+ Arrays.toString(randomArray)+ Arrays.toString(randomArray2));
        System.out.println("La suma de los arrays generados es "+ Arrays.toString(sumaArrays));
        }
    }

