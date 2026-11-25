import java.util.Scanner;

public class FORejercicio10 {
    public static void main(String[] args) {
/*

 */
        int aprobados=0;
        int suspensos=0;
        int condicionados=0;
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i <6 ; i++) {
            System.out.println("Ingrese la nota");
           int nota = lector.nextInt();
            if (nota>=5){
                aprobados++;
            } else if (nota==4) {
                condicionados++;
            }else{
                suspensos++;
            }
        }
        System.out.println("Alumnos aprobados "+aprobados);
        System.out.println("Alumnos condicionados "+condicionados);
        System.out.println("Alumnos suspensos "+suspensos);
        }
    }
