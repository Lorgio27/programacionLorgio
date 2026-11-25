import java.util.Scanner;

public class FORejercicio11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el numero de la dimension del cuadrado");
        int Veces = lector.nextInt();
        for (int i = 0; i < Veces; i++) {
            for (int j = 0; j <Veces ; j++) {
                System.out.print("+");
            }
        System.out.println();
        }
    }
}



