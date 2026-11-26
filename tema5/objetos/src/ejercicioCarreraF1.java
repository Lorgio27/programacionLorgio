import modelos.Coche;

import java.util.Scanner;

public class ejercicioCarreraF1 {
    public static void main(String[] args) {
        /*
        REALIZAR UNA CARRERA DE 2 COCHES. Para ello el sistema pedirá:

        1. Los datos de cada uno de los participantes
        2. Las vueltas de las que consta la carrera
            Cada vuelta los coches
                acelerar 2 veces un random entre 10 y 30
                frenan 1 vez un random entre 10 - 20
                Mostrando la velocidad y km de cada coche en cada vuelta
                Thread.sleep

        3. Comenzar la carrera
            En cada vuelta se mostrará la calificacion:
                Mostrando la velocidad de cada coche y los km

        4. Muestra el ganador de la carrera -> aquel que mas km tenga

         */
        Scanner lector = new Scanner(System.in);
        Coche participante1 = null;
        Coche participante2 = null;
        for (int i = 0; i <2 ; i++) {
            System.out.println(" Indica la marca del Participante " + (i+1));
            String marca = lector.next();
            System.out.println(" Indica el modelo del Participante " + (i+1));
            String modelo = lector.next();
            System.out.println(" Indica los cv del participante " + (i+1));
            int cv = lector.nextInt();
            if (i==0){
                participante1 = new Coche(marca,modelo,cv);
            }else if (i==1){
                participante2 = new Coche(marca,modelo,cv);
            }
        }
        System.out.println("Cuantas vueltas tiene la carrera");
        int vueltas = lector.nextInt();
        for (int i = 0; i <vueltas ; i++) {
            System.out.println("vuelta" + (i+1));
            participante1.acelerar((int)(Math.random()*41)+10)

        }
    }
}
