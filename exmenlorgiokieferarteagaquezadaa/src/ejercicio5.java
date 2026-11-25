import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
/*
5. (2 puntos) Desarrolla un programa en java que simule el funcionamiento de un
amigo invisible. Para ello el sistema realizará los siguientes pasos:
a. Se pedirá cuantos amigos van a participar: En caso de ser impar, se indica
que es imposible y continuará pidiendo el número hasta introducir un par
b. Se pedirán los nombres de los amigos. En caso de meter un nombre que ya
esté, lo volverá a pedir.
c. Una vez llegado a este punto, el sistema hará parejas, mostrándolas por
pantalla. Ten en cuenta que no puede salir dos veces el mismo nombre.
 */
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el numero de amigos");
        int cantidadAmigos = lector.nextInt();
        String[] amigos = new String[cantidadAmigos];
        for(int i=0;i<cantidadAmigos;i++){
            amigos[i]=lector.next();

        do{System.out.println("Imposilbe jugar siedno impares, introduce un numero de amigos par");
            for(int j=0;i<amigos.length;i++){

            }
        }while(cantidadAmigos%2==0);
        }
    }
    }

