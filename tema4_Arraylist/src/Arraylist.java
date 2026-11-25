import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void mostrarMenu() {
        System.out.println("Introducir temperaturas");
        System.out.println("2. Mostrar temperaturas");
        System.out.println("3. Ordenar temperaturas");
        System.out.println("4. Buscar coincidencias");
        System.out.println("5. Mostrar máximo y mínimo");
        System.out.println("6. Mostrar media");
        System.out.println("7. Eliminar negativos");
        System.out.println("8. Salir");
    }
    public static void IntroducirTemperaturas() {
        Scanner lector = new Scanner(System.in);
        int temperatura=lector.nextInt();
        temperaturas.add(temperatura);
    }

    public static void ordenarTemperaturas() {
        int temperaturaMenor=0;
        int temperaturaMayor=0;
        for (int i = 0; i < temperaturas.size(); i++) {
            
        }
    }
    static ArrayList<Integer> temperaturas = new ArrayList<>();
    public static void main(String[] args) {
        //realizar un grstor de tmeperaturas
        //para ello el sistema medianre un menu permitira:
        /*
        1 introducir la temperatura
        2 mostrar la temepreatura: mostrar todas las temepraturas de la lista. get
        3 ordenar las temepraturas: ordenar de menos a mas
        4 buscar conincidentes: eke sistema pide uin numeri, muestra el n de coincidencias.foreach + if
        5 moastrar mas / min: sort + getlast + getfirst
        6 mostrar media : foreach + acumulador + / size
        7 limopiar datos (eliminar negativos): for + if + remove
        8 salir
        TODO SE REALZIA CON METODOS + VAIRABLES DE CLASE
         */
        mostrarMenu();

        }
    }

