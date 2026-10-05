import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Valor compra entre 0 - 500$");
        double valorcompra = lector.nextDouble();
        System.out.println("Valor valor IVA");
        int IVA = 100 + lector.nextInt();
        double IVAapagar = valorcompra * IVA / 100;
        double ComprasinIVA = valorcompra - IVAapagar;
        System.out.printf("Valor compra sin IVA %.2f%n", ComprasinIVA);
        System.out.printf("Valor IVA %.2f%n", IVA);
        System.out.println(valorcompra);










    }
}
