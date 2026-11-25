import java.util.Scanner;

public class entradafor {
    public static void main(String[] args) {
//Se leerá el número de temperaturas a introducir (de ser 0 o negativo se establecerá a 10).
// Obténgase la media con dos decimales de las temperaturas introducidas por consola. (TemperaturasIntroducidas)
// muestra la temperaturas mas grande y mas pequeña.
        Scanner lector = new Scanner(System.in);
        double sumatorio = 0.0;
        System.out.println("Introduce la temperatura");
        int nTemp = lector.nextInt();
        if (nTemp <= 0) {
            nTemp = 10;
        }
        for (int i = 0; i < nTemp; i++) {
            System.out.println("Introduce una temperatura");
            double temp = lector.nextDouble();
            double tempMax = 0.0;
            sumatorio = temp + sumatorio;
            if (temp > tempMax) {
            }
        }

        System.out.printf("las media de las temperaturas introducidas es de %2f", sumatorio / nTemp);
    }
}