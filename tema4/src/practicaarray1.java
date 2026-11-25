import java.util.Scanner;

public class practicaarray1 {
    public static void main(String[] args) {
/*
Crea una aplicación que simule el funcionamiento del wordle. Para
ello realiza las siguientes acciones:
a. Crea un array de 10 palabras distintas con una longitud de 5 letras.
b. El programa debe seleccionar aleatoriamente una palabra del array y
almacenarla como la palabra secreta.
c. El usuario tiene 5 intentos como máximo para adivinar la palabra secreta.
d. En cada intento, el usuario introduce una palabra por teclado.
e. Tras cada intento, el programa debe indicar al usuario:
i. Aciertos: cuántas letras tiene en la misma posición que la palabra
secreta.
ii. Aproximaciones: cuántas letras están en la palabra secreta, pero en una
posición diferente.
iii. Fallos: cuántas letras no están presentes en la palabra secreta.
 */
        String[] palabras = new String[5];
        Scanner lector = new Scanner(System.in);
        System.out.println("introduce 5 palabras distintas de 5 letras");
        for (int i = 0; i < palabras.length; i++) {
            boolean repetido;
            boolean noCumple;
            do {
                noCumple = false;
                repetido = false;
                palabras[i] = lector.nextLine();
                for (int j = 0; j < i; j++) {
                    if (palabras[i].equals(palabras[j])) {
                        repetido = true;
                        System.out.println("Pon una palabra que no este repetida");
                    }
                }
                int numero = 5;
                if (palabras[i].length() > numero || palabras[i].length() < numero) {
                    noCumple = true;
                    System.out.println("Pon una palabra con 5 letras");
                }
            }
            while (repetido || noCumple);

        }
        int indice = (int) (Math.random() * palabras.length);
        String palabraAleatoria = palabras[indice];
        int numeroIntentos = 0;
        int aproximaciones = 0;
        int errores = 0;
        String palabraSuerte;
        boolean acertado;
        do {System.out.println("Introduce el intento de palabra");
            acertado = false;
            palabraSuerte = lector.nextLine();
            if (palabraSuerte.equals(palabraAleatoria)) {
                acertado = true;
            }
            for (int i = 0; i <palabraAleatoria.length() ; i++) {
                    if(palabraAleatoria.charAt(i)==palabraSuerte.charAt(i)){
                        aproximaciones++;
                    }else if (palabraAleatoria.charAt(i)!=palabraSuerte.charAt(i)){
                        errores++;
                    }
            }
            numeroIntentos++;
        } while (!acertado && numeroIntentos < 5);
    }
}

