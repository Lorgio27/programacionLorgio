public class FORejercicio6 {
    public static void main(String[] args) {
        /*
        Mostrar todos los números pares comprendidos entre dos dados.
         (ParesEntreDosDados)
         */
        int Mayor;
        int Menor;
        int numero1 = (int) (Math.random() * 6) + 1;
        int numero2 = (int) (Math.random() * 6) + 1;

        if (numero1 > numero2) {
            Mayor = numero1;
            Menor = numero2;
        } else if (numero1 < numero2) {
            Menor= numero1;
            Mayor= numero2;
            for (int i = Menor; i <= Mayor; i++) {
                if (i % 2 == 0) {
                    System.out.println("los numeros pares comprendidos son " + i);

                }
            }
        }

    }

}


