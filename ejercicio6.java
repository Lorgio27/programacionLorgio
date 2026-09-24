import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);
        System.out.println("Cuanto te va a costar a compra")
    double compraTotal =   Lector.nextDouble();
        System.out.println("Cuanto IVA")
        int iva = Lector.nextInt();
        double comprasinIVA = compraTotal * (1 - ((double)iva)/100);
        double pagoIva = compraTotal - comprasinIVA;
        System.out.println("Pago IVA : " + pagoIva);
    }
}
