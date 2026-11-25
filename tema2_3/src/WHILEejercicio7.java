import java.util.Scanner;

public class WHILEejercicio7 {
    public static void main(String[] args) {
/*
Realizar un menú de 4 opciones, donde se mostrará por pantalla el siguiente formato

- Bienvenido a la aplicación del menú
-
    1. Opción1
-
    1. Opción2
-
    1. Opción3
-
    1. Opción4
-
    1. Salir
- Introduce la opción seleccionada

Una vez mostrado la última línea, el sistema esperará a que el usuario introduzca un dato.
 Dependiendo de la opción seleccionada aparecerá un mensaje por pantalla que ponga "La opción seleccionada es X".
  En el caso de meter una diferente pondrá "opción no contemplada". El programa se repetiría hasta que introduzca el 5 (MenuSimple)
 */
        Scanner lector = new Scanner(System.in);
        System.out.println("Elige una opción");
        System.out.println("opcion 1\nopcion 2\nopcion 3\nopcion 4\nopcion 5");
        int opcion = lector.nextInt();
        do {
            switch (opcion) {
                case 1 -> {
                    System.out.println("La opción seleccionada es la 1");
                }
                case 2 -> {
                    System.out.println("La opción seleccionada es la 2");
                }
                case 3 -> {
                    System.out.println("La opción seleccionada es la 3");
                }
                case 4 -> {
                    System.out.println("La opción seleccionada es la 4");
                }
                case 5 -> {
                    System.out.println("Saliendo");
                }
                default -> {
                    System.out.println("Opción no contemplada");
                }

            }
        }
        while (opcion != 5);
    }
}
