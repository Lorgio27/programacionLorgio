import java.util.Scanner;

public class ejercicio3 {
    static void main() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el numero de 3 digitos");
        int numerousuario = lector.nextInt();
        if (numerousuario > 99 && numerousuario < 1000) {
            int centenas = numerousuario / 100;
            int decenas = (numerousuario % 100) / 10;
            int unidades = (numerousuario % 100) % 10;
            boolean amstrongok = numerousuario == Math.pow(centenas, 3) + Math.pow(decenas, 3) + Math.pow(unidades, 3);
            if (amstrongok) {
                System.out.println("Es Amstrong");
            } else {
                System.out.println("No Amstrong");
            }
        } else {
            System.out.println("No Amstrong");
        }
        lector.close();

    }
}
