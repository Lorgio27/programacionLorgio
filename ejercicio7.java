import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner lector =  new Scanner(System.in);
        System.out.println("Indica el radio de la circunferencia: ");
        int radio = lector.nextInt();
        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * (radio * radio);
        //Math.PI * Math.pow *(radio,2)
    }
}
