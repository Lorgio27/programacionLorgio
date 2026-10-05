import java.util.Scanner;

public class ejercicio13 {
   //Lea dos números entre 0 y 9, ambos inclusive. Compruébese (mostrándose verdadero o falso)
    // las siguientes condiciones e indíquese cómo se evalúan:
    //a) El primero es par y el segundo impar
    //
    //b) El primero es superior al doble del segundo e inferior a 8
    //
    //c) Son iguales o la diferencia entre el primero y el segundo es menor que 2{
    public static void entradapalabras(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca número del 0-9");
        int numero1 = lector.nextInt();
        System.out.println("Introduzca un numero del 0-9");
        int numero2 = lector.nextInt();
        boolean comprobacioon1 = numero1%2==0 && numero2%2!=0;
        boolean comprobación2 = numero1> numero2*2 && numero1<8;
        boolean comprobacion3 = numero1


    }
   }}
}
