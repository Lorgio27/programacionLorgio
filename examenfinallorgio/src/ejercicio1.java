import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
/*
1. Un parque de atracciones necesita un programa que compruebe si un visitante
puede subir a una de sus atracciones y si tiene derecho a un descuento. Lee por
teclado y almacena en variables los siguientes datos:
a. Nombre
b. Edad
c. Altura en metros
d. Si va acompañado de un adulto
e. Si 8ene un pase VIP
f. Si 8ene un cupón de descuento
Una vez introducidos todos los datos en sistema mostrará los booleanos de las
siguientes condiciones
a. Mayor edad: El visitante tenga 18 años o más.
b. Altura mínima: Su altura esté entre 1,40 y 1,95 metros, ambos incluidos.
c. Edad mínima: Tenga 12 años o más, o vaya acompañado de un adulto.
d. Puede subir: Cumpla tanto el requisito de altura como el de edad.
e. Tiene descuento: Sea menor de 18 años o tenga un cupón de descuento.
f. Hace cola: No tenga un pase VIP.
g. Acceso prioritario: Pueda subir a la atracción y tenga un pase VIP.
 */
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = lector.nextLine();
        System.out.print("Introduce tu edad: ");
        int edad = lector.nextInt();
        System.out.print("Introduce tu altura en metros: ");
        double altura = lector.nextDouble();
        System.out.print("¿Vas acompañado de un adulto? (true/false): ");
        boolean acompanado = lector .nextBoolean();
        System.out.print("¿Tienes pase VIP? (true/false): ");
        boolean vip = lector.nextBoolean();
        System.out.print("¿Tienes un cupon de descuento? (true/false): ");
        boolean cupon = lector.nextBoolean();
        boolean mayorEdad = edad >= 18;
        boolean alturaMinima = altura >= 1.40 && altura <= 1.95;
        boolean edadMinima = edad >= 12 || acompanado;
        boolean puedeSubir = alturaMinima && edadMinima;
        boolean tieneDescuento = edad < 18 || cupon;
        boolean haceCola = !vip;
        boolean accesoPrioritario = puedeSubir && vip;
        System.out.println("Nombre: " + nombre);
        System.out.println("Mayor de edad: " + mayorEdad);
        System.out.println("Altura minima: " + alturaMinima);
        System.out.println("Edad minima: " + edadMinima);
        System.out.println("Puede subir: " + puedeSubir);
        System.out.println("Tiene descuento: " + tieneDescuento);
        System.out.println("Hace cola: " + haceCola);
        System.out.println("Acceso prioritario: " + accesoPrioritario);
        lector.close();
    }
}