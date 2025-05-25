package exp1_s1_aguilar_morroni;

import com.clases.Cliente;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Rai Banco Bank Boston Servicio de gestion de cuentas bancarias.
 *
 * Numero de cuenta: entero de 9 digitos. Saldo: entero. Solo 1 cuenta por
 * cliente.
 *
 * Debe contar con las siguientes operaciones disponibles: 1. Registrar cliente:
 * Generar registro de los datos del cliente (incluido cta cte). 2. Ver datos de
 * cliente: Visualizar datos de un cliente. 3. Depositar: Abonar monto al saldo
 * existente en la cuenta (CLP). 4. Girar: Retirar dinero de la cuenta del saldo
 * existente. 5. Consultar saldo: Mostrar saldo actual en la cuenta.
 *
 */
public class Exp1_S1_Aguilar_Morroni {

    //Cliente(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String domicilio, String comuna, int telefono, String cuentaCorriente)
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.println("¡Bienvenido a Bank Boston!");
        System.out.println(""); //Linea en blanco.
        boolean opcionValida;
        int opcion = 0;
        do {
            opcionValida = false;
            System.out.println("Sistema de Gestion de Cuentas");
            System.out.println("        Menu Principal");
            System.out.println("Ingrese una opcion para continuar:");
            System.out.println("1. Registrar cliente.");
            System.out.println("2. Ver datos de cliente.");
            System.out.println("3. Depositar dinero.");
            System.out.println("4. Girar dinero.");
            System.out.println("5. Consultar saldo.");
            System.out.println("6. Salir.");
            try {
                System.out.println("\nIngrese la opcion deseada:");
                opcion = sca.nextInt();
                sca.nextLine();
                opcionValida = true;
            } catch (InputMismatchException e) {
                sca.next(); //Entrada para evitar bucle infinito.
                System.out.println("-----------------------------------------------------------");
                System.out.println("Opcion ingresada no valida. Por favor, intente nuevamente.");
                System.out.println("-----------------------------------------------------------");
                System.out.println(""); //Linea en blanco.                
            }
            if (opcionValida == true) {

                switch (opcion) {
                    case 1:

                        System.out.println("Ingrese el rut del cliente");
                        String rut = sca.nextLine();
                        cliente.setRut(rut);
                        System.out.println("Ingrese el nombre");
                        String nombre = sca.nextLine();
                        cliente.setNombre(nombre);
                        System.out.println("Ingrese el apellido paterno");
                        String apellidoPaterno = sca.nextLine();
                        cliente.setApellidoP(apellidoPaterno);
                        System.out.println("Ingrese el apellido materno");
                        String apellidoMaterno = sca.nextLine();
                        cliente.setApellidoM(apellidoMaterno);
                        System.out.println("Ingrese domicilio");
                        String domicilio = sca.nextLine();
                        cliente.setDomicilio(domicilio);
                        System.out.println("Ingrese comuna");
                        String comuna = sca.nextLine();
                        cliente.setComuna(comuna);
                        System.out.println("Ingrese teléfono");
                        int telefono = sca.nextInt();
                        sca.nextLine();
                        cliente.setTelefono(telefono);

                        System.out.println("Cliente registrado con los siguientes datos: " + cliente);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        System.out.println("¡Hasta pronto!");
                        break;
                    default:
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("Opcion ingresada no valida. Por favor, intente nuevamente.");
                        System.out.println("-----------------------------------------------------------");
                        System.out.println(""); //Linea en blanco.
                }
            }
        } while (opcion != 6);
    }
}
