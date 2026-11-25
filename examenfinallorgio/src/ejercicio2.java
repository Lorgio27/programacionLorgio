import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
/*
2. El centro educativo ha instalado una máquina expendedora y necesita un programa en
Java que simule su funcionamiento. El usuario empezará con un saldo de 5 € y podrá
comprar productos, consultar su saldo o recargarlo. El programa seguirá funcionando
hasta que decida salir. El menú de la máquina y los precios de los artículos son los
siguientes
1. Comprar agua ........... 1 €
2. Comprar zumo ........... 2 €
3. Comprar bocadillo ...... 3 €
4. Consultar saldo
5. Recargar saldo
0. Salir
- En las opciones 1,2 3, el sistema pondrá los siguientes mensajes:
Has seleccionado un bocadillo.
Compra realizada.
Saldo restante: 2 €
En caso de no tener saldo suficiente se mostrará el mensaje de saldo insuficiente
- La opción 4 mostrará el saldo actual del usuario
- La opción 5 pedirá una cantidad a recargar. Si se realiza la recarga de forma correcta
mostrará el nuevo saldo y en caso de intentar cargar un saldo negativo mostrará un
aviso
 */
        Scanner lector = new Scanner(System.in);
        int opcion;
        do{int saldoInicial=5;
            int saldorestante=saldoInicial;
            int agua = 1;
            int zumo = 2;
            int bocadillo = 3;
            System.out.println("Elige una de las opciones\n1.Comprar agua\n2.Comprar zumo\n3.Comprar bocadillo" +
                    "\n4.Consultar Saldo\n5.Recargar saldo\n6.Salir");
            opcion = lector.nextInt();
            switch (opcion){
                case 1->{//comprar agua 1
                    saldorestante=saldoInicial-1;
                    if(saldoInicial<agua){
                        System.out.println("Saldo insuficiente");
                    }else{System.out.println("Has seleccionado el agua\n Compra realizada\nsaldo restante="+saldorestante);}
                }
                case 2->{//comprar zumo 2.
                    saldorestante=saldorestante-2;
                    if(saldorestante<zumo){
                        System.out.println("Saldo insuficiente");
                }else{System.out.println("Has seleccionado el agua\n Compra realizada\nsaldo restante="+saldorestante);}
                }
                case 3->{//comprar bocadillo 3.
                    saldorestante=saldoInicial-3;
                    if(saldorestante<agua){
                        System.out.println("Saldo insuficiente");
                    }else{System.out.println("Has seleccionado el bocadillo\n Compra realizada\nsaldo restante="+saldorestante);}
                }
                case 4->{System.out.println("Saldo restante =\t"+saldorestante);
                }
                case 5->{System.out.println("introduce la cantidad que deseas recargar");
                    int cantidadSaldo=lector.nextInt();
                    if(cantidadSaldo<0){
                       System.out.println("no hes posible cargar esa cantidad");
                    }else {
                        saldorestante+=cantidadSaldo;
                    }

                }
                case 6->{//salir
                    System.out.println("Saliendo");
                }
            }
        }while(opcion !=6);
    }}

