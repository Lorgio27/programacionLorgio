import java.util.Scanner;

public class WHILEejercicio9 {
    public static void main(String[] args) {
/*
Modifica el ejercicio anterior para hacer una calculadora de cambios de base. Nada más ejecutar se mostrarán las opciones disponibles

- Bienvenido a la aplicación de cambios de base
    - Introduce el número que quieres cambiar de base:
    - Pasar a base2
    - Pasar a base8
    - Pasar a base16
    - Salir
    - Selecciona la base a la que quieres pasar

Al introducir un número el sistema comprobará que es mayor que 0.
En caso de no serlo mostrará el mensaje "No válido, introduce otro", esperando una nueva introducción de datos.
Una vez introducido, al seleccionar una de las opciones el sistema realizará la conversión correspondiente
y mostrará el resultado por pantalla de la siguiente forma "El número XX en base10 es igual que XX en baseXX".
Una vez terminada la operación volverá a mostrar el menú y pedir un número. (MenuBases)
 */
    Scanner lector = new Scanner(System.in);
    int opcion;
    do {System.out.println("Bienvenido a la aplicación de cambios de base\nIngrese el numero que quieres cambiar de base");
        int numero = lector.nextInt();
        int original=numero;
        System.out.println("Selecciona la base a la que quieres pasar\n1.pasar a base2\n2.pasar a base8\n3.pasar a base16\n4.Salir\n");
        opcion=lector.nextInt();
        switch(opcion){
        case 1->{
            int resto;
            String binario="";
            while(numero>0){
                resto= numero%2;
                numero =numero/2;
                binario= resto + binario;
            }
                System.out.println("El "+original+" en base 10 es = "+binario+" en binario");
        }
        case 2->{
            int resto;
            String octal="";
            while(numero>0){
                resto = numero%8;
                numero =numero/8;
                octal= resto+octal;
            }System.out.println("El "+original+" en base 10 es = "+octal+" en octal");
        }
        case 3->{
            int resto;
            String hexadecimal="";
            while(numero>0){
                resto=numero%16;
                numero=numero/16;
                hexadecimal = resto+hexadecimal;
            }System.out.println("El numero original "+original+" es = "+hexadecimal+"en hexadecimal");
        }
        case 4->{
            System.out.println("Saliendo");
        }
        default ->{
            System.out.println("Opcion no valida");
        }
    }
    }while(opcion!=4);

    }
}
