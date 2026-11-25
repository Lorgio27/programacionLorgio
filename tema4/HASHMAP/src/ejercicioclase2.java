
/*Un bnaco pide un sistema de cuentas cuenta(id,numero,pin,titular,saldo)
1 abrir cuenta:
Pin:
Nombre:
Saldo:
ID incremental N cuenta Aletaroio 1000- 10000
Ciunado se crea avisa(si bien o mal)
2consultar Datos.
Pin, El titular, ncuenta, yo t doy los -> datos.
3ingresar saldo (cantidad) NO NEGATIVO ->Aviso
pin, titular,ncuenta,saldo
4 saacar dinero
pin, titular,numero cuenta,saldo que quiere sacar,(aviso)
si tienes menos mas -1000
5ver descubiertos
muestra todas la cuentas ssaldo negativo
6 elimina bloqueadas
co saldo -1000
 PSEUDO CODIGO:

 */

import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;

        public class ejercicioclase2 {


            public static void main(String[] args) {

                Scanner lector = new Scanner(System.in);
                Random random = new Random();

                // HashMap: ID de la cuenta -> datos de la cuenta
                HashMap<Integer, String[]> cuentas = new HashMap<>();

                // HashMap: ID de la cuenta -> saldo
                HashMap<Integer, Double> saldos = new HashMap<>();

                int siguienteId = 1;
                int opcion;

                do {
                    System.out.println("\n===== BANCO =====");
                    System.out.println("1. Abrir cuenta");
                    System.out.println("2. Consultar datos");
                    System.out.println("3. Ingresar dinero");
                    System.out.println("4. Sacar dinero");
                    System.out.println("5. Ver descubiertos");
                    System.out.println("6. Eliminar cuentas bloqueadas");
                    System.out.println("0. Salir");
                    System.out.print("Elige una opcion: ");

                    opcion = lector.nextInt();
                    lector.nextLine();

                    switch (opcion) {

                        case 1: {
                            // ABRIR CUENTA

                            System.out.print("Introduce el PIN: ");
                            String pin = lector.nextLine();

                            System.out.print("Nombre del titular: ");
                            String titular = lector.nextLine();

                            System.out.print("Saldo inicial: ");
                            double saldo = lector.nextDouble();
                            lector.nextLine();

                            if (saldo < 0) {
                                System.out.println("Error: el saldo inicial no puede ser negativo.");
                                break;
                            }

                            // Numero aleatorio entre 1000 y 10000
                            int numeroCuenta;
                            boolean existe;

                            do {
                                numeroCuenta = random.nextInt(9001) + 1000;
                                existe = false;

                                for (String[] datos : cuentas.values()) {
                                    if (Integer.parseInt(datos[2]) == numeroCuenta) {
                                        existe = true;
                                        break;
                                    }
                                }

                            } while (existe);

                            // Guardamos PIN, titular y numero de cuenta
                            String[] datos = {
                                    pin,
                                    titular,
                                    String.valueOf(numeroCuenta)
                            };

                            cuentas.put(siguienteId, datos);
                            saldos.put(siguienteId, saldo);

                            System.out.println("Cuenta creada correctamente.");
                            System.out.println("ID: " + siguienteId);
                            System.out.println("Numero de cuenta: " + numeroCuenta);

                            siguienteId++;
                            break;
                        }

                        case 2: {
                            // CONSULTAR DATOS

                            System.out.print("Introduce el ID: ");
                            int id = lector.nextInt();
                            lector.nextLine();

                            if (!cuentas.containsKey(id)) {
                                System.out.println("La cuenta no existe.");
                                break;
                            }

                            System.out.print("Introduce el PIN: ");
                            String pin = lector.nextLine();

                            String[] datos = cuentas.get(id);

                            if (datos[0].equals(pin)) {
                                System.out.println("Titular: " + datos[1]);
                                System.out.println("Numero de cuenta: " + datos[2]);
                                System.out.println("Saldo: " + saldos.get(id) + " euros");
                            } else {
                                System.out.println("PIN incorrecto.");
                            }

                            break;
                        }

                        case 3: {
                            // INGRESAR DINERO

                            System.out.print("Introduce el ID: ");
                            int id = lector.nextInt();
                            lector.nextLine();

                            if (!cuentas.containsKey(id)) {
                                System.out.println("La cuenta no existe.");
                                break;
                            }

                            System.out.print("Introduce el PIN: ");
                            String pin = lector.nextLine();

                            String[] datos = cuentas.get(id);

                            if (!datos[0].equals(pin)) {
                                System.out.println("PIN incorrecto.");
                                break;
                            }

                            System.out.print("Cantidad a ingresar: ");
                            double cantidad = lector.nextDouble();
                            lector.nextLine();

                            if (cantidad <= 0) {
                                System.out.println("La cantidad debe ser positiva.");
                            } else {
                                double nuevoSaldo = saldos.get(id) + cantidad;
                                saldos.put(id, nuevoSaldo);

                                System.out.println("Ingreso realizado correctamente.");
                                System.out.println("Saldo actual: " + nuevoSaldo);
                            }

                            break;
                        }

                        case 4: {
                            // SACAR DINERO

                            System.out.print("Introduce el ID: ");
                            int id = lector.nextInt();
                            lector.nextLine();

                            if (!cuentas.containsKey(id)) {
                                System.out.println("La cuenta no existe.");
                                break;
                            }

                            System.out.print("Introduce el PIN: ");
                            String pin = lector.nextLine();

                            String[] datos = cuentas.get(id);

                            if (!datos[0].equals(pin)) {
                                System.out.println("PIN incorrecto.");
                                break;
                            }

                            System.out.print("Cantidad a retirar: ");
                            double cantidad = lector.nextDouble();
                            lector.nextLine();

                            if (cantidad <= 0) {
                                System.out.println("La cantidad debe ser positiva.");
                                break;
                            }

                            double nuevoSaldo = saldos.get(id) - cantidad;

                            if (nuevoSaldo < -1000) {
                                System.out.println("Operacion denegada: no puedes superar los -1000 euros.");
                            } else {
                                saldos.put(id, nuevoSaldo);
                                System.out.println("Retirada realizada.");
                                System.out.println("Saldo actual: " + nuevoSaldo);
                            }

                            break;
                        }

                        case 5: {
                            // VER CUENTAS CON SALDO NEGATIVO

                            boolean hayDescubiertos = false;

                            for (Integer id : saldos.keySet()) {

                                if (saldos.get(id) < 0) {
                                    String[] datos = cuentas.get(id);

                                    System.out.println("ID: " + id);
                                    System.out.println("Titular: " + datos[1]);
                                    System.out.println("Saldo: " + saldos.get(id));
                                    System.out.println("-------------------");

                                    hayDescubiertos = true;
                                }
                            }

                            if (!hayDescubiertos) {
                                System.out.println("No hay cuentas en descubierto.");
                            }

                            break;
                        }

                        case 6: {
                            // ELIMINAR CUENTAS CON SALDO <= -1000

                            java.util.ArrayList<Integer> eliminar = new java.util.ArrayList<>();

                            for (Integer id : saldos.keySet()) {
                                if (saldos.get(id) <= -1000) {
                                    eliminar.add(id);
                                }
                            }

                            for (Integer id : eliminar) {
                                cuentas.remove(id);
                                saldos.remove(id);
                            }

                            System.out.println("Cuentas eliminadas: " + eliminar.size());
                            break;
                        }

                        case 0:
                            System.out.println("Saliendo del banco...");
                            break;

                        default:
                            System.out.println("Opcion no valida.");
                    }

                } while (opcion != 0);

                lector.close();
            }
        }


