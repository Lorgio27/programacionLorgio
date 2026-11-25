import java.util.Scanner;

public class WHILEejercicio3 {
    public static void main(String[] args) {
        /*
        Generar números enteros aleatorios entre 0 y 100 hasta obtener el 0.
        El programa mostrará cada uno de los datos generados
        y obtendrá el mayor de los números generados.(MayorNumero)
         */
    Scanner lector = new Scanner(System.in);
    int numero=(int) (Math.random()*101);
        System.out.println(numero);
    int numeromayor= 0;
        while(numero!=0){
            numero=(int)  (Math.random()*101);
            System.out.println(numero);
    if (numero > numeromayor){
        numeromayor=numero;
    }
        }System.out.println("El numero mayor es"+numeromayor);

    }
}
