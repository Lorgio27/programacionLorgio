import java.util.Scanner;

public class EjerciciosBASES {
    public static void main(String[] args) {
        System.out.println("Indica un numero binario");
        Scanner lector = new Scanner(System.in);
        String Hexadecimal = lector.nextLine();
        int numeroDecimal = 0;
        lector.close();
        for (int i = 0; i < Hexadecimal.length(); i++) {
            char letra = Hexadecimal.charAt(i);
            int numeroconversion = 0;
            switch (letra) {
                case 'A' -> numeroconversion = 10;
                case 'B' -> numeroconversion = 11;
                case 'C' -> numeroconversion = 12;
                case 'D' -> numeroconversion = 13;
                case 'E' -> numeroconversion = 14;
                case 'F' -> numeroconversion = 15;
                default -> numeroconversion = Integer.parseInt(String.valueOf(letra));
            }
            numeroDecimal += numeroconversion * Math.pow(16,Hexadecimal.length() - 1 - i);
        }

    }

}
