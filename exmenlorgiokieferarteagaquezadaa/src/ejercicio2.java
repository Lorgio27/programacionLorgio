import java.util.Arrays;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
/*
2. (2 puntos)Desarrolla un programa que simule el juego de la Bonoloto siguiendo
estos pasos:
a. El programa debe generar automáticamente 6 números aleatorios distintos
entre 1 y 49 (no se pueden repetir), que serán la combinación ganadora.
b. El usuario debe introducir su apuesta: 6 números distintos entre 1 y 49 por
teclado.
c. Compara la apuesta del usuario con la combinación ganadora.
d. Al finalizar, el programa indica:
i. Cuántos números ha acertado el usuario.
ii. Cuáles son los números acertados.
iii. Muestra la combinación ganadora y la apuesta del usuario como
resultado final.
 */
        Scanner lector =  new Scanner(System.in);
        int cantidad = 6;
        int []correcto = new int[cantidad];
        int [] apuestas = new int [cantidad];
        for(int i=0;i<cantidad;i++){
            correcto[i] =(int)(Math.random()*49+1);

        }
        System.out.println("Ingrese su apuesta de 2 digitos desde el 1 al 49 ambos incluidos");
        for(int i=0;i<cantidad;i++){
            apuestas[i]=lector.nextInt();
        }
        int acertados=0;
        String numeroCorrecto="";
        for(int i=0;i<cantidad;i++){
            if(apuestas[i]==correcto[i]){
                numeroCorrecto+=apuestas[i];
                acertados++;
            }
        }System.out.println("Has acertado "+acertados);
        System.out.println("los numeros acertados son "+numeroCorrecto);
        System.out.println("los numeros correctos son "+ Arrays.toString(correcto));
    }
}
