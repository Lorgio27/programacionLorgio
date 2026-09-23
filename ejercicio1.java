import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Ejercicio1");
        Scanner teclado = new Scanner(System.in);
        int numero1;
        int numero2;
        int resultado;
        double resultadoreal;
        double resultadoreal2;
        System.out.println("Introduce un numero");
        numero1 = teclado.nextInt();
        numero2 = teclado.nextInt();
        resultado = numero1 + numero2;
        System.out.println(resultado);
        resultado = numero1 - numero2;
        System.out.println(resultado);
        resultado = numero1 * numero2;
        System.out.println(resultado);
        resultadoreal = (double)numero1 / numero2;
        System.out.println(resultadoreal);
        resultadoreal2= (double)numero1 % numero2;
        System.out.println(resultadoreal2);




    }
}
