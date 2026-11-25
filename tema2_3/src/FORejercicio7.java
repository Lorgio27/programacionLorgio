import java.util.Scanner;

public class FORejercicio7 {
    public static void main(String[] args) {
        /*
        Simúlese el lanzamiento de un dado.
        Se introducirá el número de veces que se lanza el dado (de no ser positivo, se establecerá a 100)
        y se mostrará el resumen de los lanzamientos.
        Se mostraán cuantas veces ha salido cada número. (Dado)
         */
        Scanner lector =new Scanner(System.in);
        System.out.println("Introduce el numero de veces que tiras el dado");
        int numeroVeces=lector.nextInt();
        int n1=0, n2=0, n3=0, n4=0, n5=0, n6=0;
        if(numeroVeces<0){
            numeroVeces=100;
        }else {
            for(int i=0;i<numeroVeces;i++){
                int numero = (int)(Math.random()*6)+1;
                n1 = numero == 1 ? n1+=1: n1;
                n2 = numero == 2 ? n2+=1: n2;
                n3 = numero == 3 ? n3+=1: n3;
                n4 = numero == 4 ? n4+=1: n4;
                n5 = numero == 5 ? n5+=1: n5;
                n6 = numero == 6 ? n6+=1: n6;

            }
        }
        System.out.println("El numero de veces que ha salido el 1 es"+n1);
        System.out.println("El numero de veces que ha salido el 2 es"+n2);
        System.out.println("El numero de veces que ha salido el 3 es"+n3);
        System.out.println("El numero de veces que ha salido el 4 es"+n4);
        System.out.println("El numero de veces que ha salido el 5 es"+n5);
        System.out.println("El numero de veces que ha salido el 6 es"+n6);
    }
}
