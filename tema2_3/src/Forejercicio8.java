import java.util.Scanner;

public class Forejercicio8 {
    public static void main(String[] args) {
        /*
        Pedir 10 números. Mostrar la media de los números positivos,
         la media de los números negativos y la cantidad de ceros (NumerosTipos)
         */
        Scanner lector = new Scanner(System.in);
        int sumatorioPositivos=0, sumatorioNegativos=0, numerosPositivos=0, numerosNegativos=0, numeroCeros=0;
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Intruce el numero");
            int numero = lector.nextInt();
            if(numero>0){
                sumatorioPositivos += numero;
                numerosPositivos++;
            } else if (numero<0) {
                sumatorioNegativos += numero;
                numerosNegativos++;
            }else{
                numeroCeros++;
            }
           }
        System.out.println("esta es la media de los numeros positivos "+ (double)sumatorioPositivos/numerosPositivos);
        System.out.println("Esta es la media de los numeros negativos "+ (double)sumatorioNegativos/numerosNegativos);
        System.out.println("Cantidad de veces que pusiste el 0 "+ numeroCeros);

    }
}
