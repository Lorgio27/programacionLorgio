import java.util.Arrays;

public class practicasarray {
    public static void main(String[] args) {
        //Crea un programa que recorra el array y muestre cuántos números son positivos, negativos y cuántos son cero.
        /*int[] numeros = {5, -3, 8, -1, 0, 12, -7};
        int positivos=0;
        int negativos=0;
        int numeroCeros=0;
        for (int i = 0; i <numeros.length ; i++) {
            positivos = numeros[i]>0 ? positivos+1 : positivos;
            negativos = numeros[i]<0 ? negativos+1 : negativos;
            numeroCeros = numeros[i]==0  ? numeroCeros+1 : numeroCeros;
            }
        System.out.println(positivos+"\t"+negativos+"\t"+numeroCeros);
         */
        int[] numeros = {4, 7, 4, 9, 2, 7, 5, 9, 3, 2};
        //Objetivo: crear un segundo array que contenga únicamente los números que aparecen, sin repetir ninguno.
        int numeroRepetidos=0;
        for (int i = 0; i <numeros.length ; i++) {
            boolean repetido =false;
            for (int j = 0; j <i ; j++) {
                if(numeros[j]==numeros[i]){
                        repetido=true;
                        break;
                    }
            }if(!repetido){
                numeroRepetidos++;
            }
        }
        int []numerosNO = new int[numeroRepetidos];
        for (int numerosNo :numerosNO){
        System.out.println(numerosNo);
        }

        }

    }

