import java.util.Scanner;

public class ejercicio11b {
    public static void main(String[] args) {
        /* Hágase una aplicación que permita comprobar
   si puedo comprarme una serie de artículos. Para ello,
 el sistema pedirá por consola la cantidad de dinero en euros que tengo,
 el IVA que se aplica en este momento y el precio de dos articulos (sin IVA). El sistema indicará:
- Si puedo comprar el primer artículo solo
- Si puedo comprar el segundo artículo solo
- Si puedo comprar ámbos artículos juntos*/
   Scanner lector=new Scanner(System.in);
   System.out.println("Ingrese el dinero que tiene");
   double dineroDISP=lector.nextDouble();
     int play5sinIVA = 500;
     System.out.println("precio sin iva play5"+play5sinIVA);
     int vaquerossinIVA = 70;
     System.out.println("precio sin iva vaqueros"+vaquerossinIVA);
     double play5conIVA = double.nextdouble()* IVA;
    System.out.println("precio con IVA play5"+play5conIVA);
     double vaquerossconIVA = 70* 21/100;
    System.out.println("precio con IVA vaquerossconIVA");
   int preciototal = vaquerossconIVA +  play5conIVA;
   boolean mealcanzaplay5 = dineroDISP>=play5sinIVA
   boolean mealcanvaqueros = dineroDISP>=play5sinIVA
   boolean mealcanzaplay5 = dineroDISP>=play5sinIVA




    }
}
