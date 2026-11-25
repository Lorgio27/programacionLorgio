import java.util.Scanner;

public class Estructurascontrol {
    public static void main(String[] args) {
        // realiza un programa que indique la nota de un alumnno pedida por consola,
        // 0-3 muy suspenso, 4 suspenso justo, 5-6 aprobado justo, 7-8 notable, 9-sobre, 10 perfecto.
        Scanner lector = new Scanner(System.in);
        System.out.println("introduce la nota");
        int nota = lector.nextInt();
        boolean notamuysuspensa = nota <= 3;
        boolean suspensojusto = nota == 4;
        boolean aprobadojusto = nota >= 5;
        boolean aprobadojusto2 = nota <= 6;
        boolean sobre = nota == 9;
        boolean perfect = nota == 10;
        boolean imposible = nota > 10;
        if (notamuysuspensa) {
            System.out.println("muy Suspenso");
        }
        if (suspensojusto) {
            System.out.println("Suspenso justo ");
        }


    }
}
