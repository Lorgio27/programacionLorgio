import java.util.Scanner;

public class Whileejercicio5 {
    public static void main(String[] args) {
/*
Crea un programa que genere un número aleatorio (entre 0 y 20) de entrada y lo guarde en una variable.
El sistema irá pidiendo números al usuario hasta que coincida con el aleatorio generado
(en caso de no coincidir mostrará el mensaje "Lo siento, intentalo de nuevo").
Cuando coincida el sistema deberá mostar el mensaje "Enhorabuena, has acertado el número en 5 intentos" (Adivina)
 */
        int numeroVeces=1;
        int numero = (int) (Math.random()*21);
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int numeroAdivino= lector.nextInt();

        while(numeroAdivino!=numero){
            System.out.println("Losiento intentelo de nuevo");
            numeroAdivino= lector.nextInt();
             numeroVeces++;
        }
        System.out.println("Enhorabunea has acertado el numero en "+numeroVeces+" intentos");
    }
}
