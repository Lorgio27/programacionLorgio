import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Hágase un programa que convierta segundos en horas,
        //minutos y segundos.(Segundos)
        //
        //*ENTRADA/SALIDA*
        //
        //Número de segundos: **24973**
        //
        //Horas: 6
        //
        //Minutos: 56
        //
        //Segundos:
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indica la cantidad de segundos que quieres intoducir");
        int segundostraducir = teclado.nextInt();
        int horas = segundostraducir / 3600;
        int segundosrestantes =  segundostraducir % 3600;
        int minutos = segundosrestantes / 60;
        segundosrestantes = segundosrestantes % 60;
        System.out.println(" horas "+ horas );
        System.out.println("Minutos" + minutos);
        System.out.println("Segundos" + segundosrestantes);

    }
}
