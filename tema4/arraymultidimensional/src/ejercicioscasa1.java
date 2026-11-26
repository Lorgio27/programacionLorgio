import java.util.Scanner;

public class ejercicioscasa1 {
    public static void main(String[] args) {
    /*
        int [][] numeros = new int[3][4];
        for (int i = 0; i < numeros.length; i++) { ESTO SIRVE PARA RECORRER LAS FILAS EL NUMERO.LENGHT DA 3 PORQUE ES LA EXTENSION DEL ARRAY
            for (int j = 0; j < numeros[i].length; j++) { PARA RECORRER LAS COLUMNAS DE LAS FILAS. NUMEROS[I].LENGHT ES PARA RECORRER   ESA COLUMNA OSEA 4

                System.out.println(numeros[i][j]);  ME DA LA POSICION EXACTA DE EL ELEMENTO SITUADO EN ESAS POSICIONES

            }
        }

     */
      /*
      Crea un programa que cumpla los siguientes requisitos:
- Almacenar 12 números enteros en una matriz de 3 filas y 4 columnas.
- Solicitar al usuario los 12 números por teclado.
- Mostrar todos los números introducidos respetando su distribución en fila y columnas.
      Scanner lector =new Scanner(System.in);
        int [][]numeros = new int[3][4];
        for (int i = 0; i <numeros.length ; i++) {
            for (int j = 0; j <numeros[i].length ; j++) {
                numeros[i][j]=lector.nextInt();
                System.out.print(numeros  [i][j]+" ");

            }
        }
       */
    /*
    Crea un programa en Java que cumpla los siguientes requisitos:
- Almacenar 9 números enteros en una matriz de 3 filas y 3 columnas.
- Solicitar los números al usuario por teclado.
- Mostrar la matriz completa.
- Calcular la suma de todos sus números.
- Mostrar la suma de cada fila individualmente.
     */
        Scanner lector = new Scanner(System.in);//PIDE Y ALMACENA LOS NUMEROS
        int [][] numeros = new int [3][3];
        for (int i = 0; i < numeros.length ; i++) {//se encarga de las filas
            for (int j = 0; j <numeros[i].length ; j++) {//se encarga de las columnas
                numeros[i][j] = lector.nextInt();
            }
        }
        for (int i = 0; i <numeros.length ; i++) { //ESTO LOS IMPRIME.
            for (int j = 0; j < numeros[i].length ; j++) {
               System.out.print(numeros[i][j] + " ");//SE ENCARGA DE ESCRIBIR LOS NUMEROS DE FILA EN LA POSICION QUE MARCA [i] [j]
            }
            System.out.println();//CADA VEZQUE IMPRIME UNA FILA SALTA DE LINEA
        }
        for (int i = 0; i <numeros[0].length ; i++) {//COLUMNAS                 /*numeros.lenght=cantidas de filas, numeros[0].length=cantidas de columnas en matriz rectangular */
            int sumatorioColumnas =0;
            for (int j = 0; j <numeros.length ; j++) {//FILAS
                sumatorioColumnas+=numeros[j][i];
            }System.out.println("Columna"+i+"="+sumatorioColumnas);
        }

        int sumatorio=0;
        for (int i = 0; i < numeros.length ; i++) {
           int sumatorioFilas=0;
            for (int j = 0; j < numeros[i].length ; j++) {
                sumatorio+=numeros[i][j];       //ESTO += ES LO MISMO QUE [SUMATORIO = {SUMATORIO(EL VALOR QUE TENGA GUARDADO)}+NUMEROS] Y LE ESTAMOS DICINEDO CON EL = QUE LOS GUARDE
                sumatorioFilas+=numeros[i][j];  /*INICIAMOS EL SUMATORIOFILAS DENTRO DEL PRIMER FOR Y NO FUERA DE AMBOS PORQUE NOS INTERESAN
                                                LAS FILAS SOLO Y SI LO PONGO FUERA ESTARAI HACIENDO LO MISMO QUE CON SUMATORIO,PUESOT AHI CADA VEZ QUE SALTA DE FILA SE
                                              REINICIA A 0 PUDIENDO ASI SUNMAR LAS FILAS POR SEPARADO*/
            }
            System.out.println("Fila"+i+"="+sumatorioFilas);
        }
        System.out.println("total"+sumatorio);

        }
    }

