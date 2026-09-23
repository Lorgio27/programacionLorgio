import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        //Unos amigos entra en un bar que ofrece las bebidas a 1,25€ y los bocadillos a 2,05€. El camarero les pregunta cuántas bebidas
        //y bocadillos quieren. Calcula el coste de la consumición, mostrando primero el coste de las bebidas y de los bocadillos. (Bar)
        //ENTRADA/SALIDA
        //Número de bebidas: 3
        //Número de bocadillos: 5
        //Coste de las bebidas: 3.75
        //Coste de los bocadillos: 10.25
        //Coste consumición: 14.0
        Scanner teclad = new Scanner(System.in);
        double preciobocadillos;
        double preciobebidas;
        preciobocadillos = 2.05;
        preciobebidas = 1.25;
        int numerobocadillos;
        System.out.println("Introduce el numero de bocadillos");
        numerobocadillos = teclado.nextint();
        int numerobebidas;
        System.out.println("Introduce el numero de bebidas");
        numerobebidas = teclado.nextint();
        resultado preciobebidastotal = 1,25 * numerobebidas;
        System.out.println(resultado preciobebidastotal);
        resultado preciobocadillostotal = 2,05 * numerobocadillos;
        System.out.println(preciobocadillostotal);
        Resultado total = resultado preciobebidastotal + resultado preciobocadillostotal;
System.out.println(resultado total);
}
