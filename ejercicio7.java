import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce valor radio");
        int valorradio = lector.nextInt();
        double longitudcircunferencia = 2* Math.PI*valorradio;
        System.out.println("longitudcircunferencia %.2f%n"+longitudcircunferencia);
        Double areacircunferencia = Math.PI* Math.pow(valorradio,2);
        System.out.printf("Area del circulo %.2f%n",areacircunferencia);



    }
}
