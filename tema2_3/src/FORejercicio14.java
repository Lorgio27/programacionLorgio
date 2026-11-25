import java.util.Scanner;

public class FORejercicio14 {
    public static void main(String[] args) {
        /*Pedir una palabra por teclado y comprobar si es o no palindromo.
         Una palabra es palíndromo cuando se lee igual de izquierda a derecha que de derecha a izquierda.
          Por ejemplo ana, oro, radar. Para poder hacer la comprobación no se tendrán en cuenta mayusculas ni acentos (CapicuaPalabra)
         */
        Scanner lector = new Scanner(System.in);
        System.out.println("indtroduce la palabra");
        String palabra = lector.nextLine();
        palabra = palabra.toLowerCase();
        char primeraLetra = palabra.charAt(0);
        char segundaLetra = palabra.charAt(palabra.length() - 1);
        if (primeraLetra == segundaLetra) {
            System.out.println("Las letras coinciden");
        } else {
            System.out.println("Las letras no coinciden");
        }
        boolean esPalindromo = true;
        for (int i = 0; i < palabra.length() / 2; i++) {
            char izquierdaLetra = palabra.charAt(i);
            char derechaletraLetra = palabra.charAt(palabra.length() - i - 1);
            if (izquierdaLetra != derechaletraLetra) {
                esPalindromo = false;
                break;
            }
        }
        if (esPalindromo) {
            System.out.println("Es palíndroma");
        } else {
            System.out.println("La palabra no es palindroma");
        }
    }
}
