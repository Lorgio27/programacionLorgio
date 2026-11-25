import java.util.Scanner;

public class entradaswitch {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduze el operando");
        System.out.println("Introduze el operando2");
        int num1 = lector.nextInt();
        int num2 = lector.nextInt();
        double resultado = 0.0;

        System.out.println("Tipo de operación");
        String operacion = lector.next();
        switch (operacion.toLowerCase()) {
            case "sumar":
                System.out.println(num1 + num2);
                break;
            case "restar":
                System.out.println(num1 - num2);
                break;
            case "multiplicar":
                System.out.println(num1 * num2);
                break;
            case "dividir":
                if (num2 == 0) {
                    System.out.println("Introduce un valor valido");
                }
                if (num1 % num2 != 0) {
                    System.out.println("Quieres el resultado con decimales o sin decimales(si/no)");
                    String decision = lector.next();
                    switch ("decision") {
                        case "si":
                            System.out.printf("Resultado %.2f", (double) num1 / num2);
                            break;
                        case "no":
                            System.out.println("Resultado" + num1 / num2);
                    }
                }
                break;
            case "modulo":
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("La operacion no existe");
        }
        System.out.println("El resultado es: " + resultado);


    }
}

