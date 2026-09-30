import java.util.Scanner;

public class ejercicio4 {
    static void main() {
        //Crea una clase llamada Ejercicio4 la cual tenga un main con la siguiente
        //funcionalidad: debes ayudar a decidir si un candidato es válido para un
        //puesto de trabajo. Para ello se seguirán las ejecuciones que se indican:
        //:
        //a. Pide al usuario que introduzca su nombre y apellido
        //b. Pide al usuario que introduzca el sueldo que espera recibir
        //c. Pide al usuario que introduzca su edad
        //d. Pide al usuario que introduzca el día de su cumpleaños
        //e. Pide al usuario que introduzca si tiene o no carné de conducir
        //f. Una vez introducido todo, el sistema deberá indicar si es o no un
        //candidato válido, mostrando el siguiente mensaje:
        //i. Con los datos introducidos, el candidato cuyo nombre es XXX
        //tiene como resolución: false o true
        Scanner lector = new Scanner(System.in);
        System.out.println("Inrtroducec tu nombre y tu apellido");
        String nombre = lector.nextLine();
        String apellido = lector.nextLine();
        System.out.println("Salario que piensas recibir");
        double salario = lector.nextDouble();
        System.out.println("Edad");
        int edad = lector.nextInt();
        System.out.println("dia que cumples");
        int fecha = lector.nextInt();
        System.out.println("Carnet Si/no");
        String carnet = lector.next();
        boolean Valido1 = edad < 50 && salario < 40000 && carnet.equals("Si")
                || edad < 45 && salario < 20000 && fecha % 2 == 0;
        System.out.printf("Con los dos introducidos el candidato %s %b tiene como resloucion %c" , nombre, apellido, Valido1);
        lector.close();
    }
}
