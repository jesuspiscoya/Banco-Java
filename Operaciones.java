import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class Operaciones {

    // Creando una variable general----
    double monto = 0;

    // Creando un objeto para LocalTime----
    LocalTime hora = LocalTime.now();

    // Creando un objeto para LocalDate----
    LocalDate fecha = LocalDate.now();

    // Creando dos ArrayList vacíos para dni y claves----
     ArrayList<String> dnis = new ArrayList<>();
     ArrayList<String> claves = new ArrayList<>();

    // Creando los getters para que devuelvan el valor de dnis y claves
    public ArrayList<String> getDnis() {
        return dnis;
    }

    public ArrayList<String> getClaves() {
        return claves;
    }


    // Creando el método agregar----
    public void agregar() {
        Scanner scanner = new Scanner(System.in);
        boolean error_agregar = false;
        do {
             try {
            System.out.println("Ingrese el monto que desea agregar: ");
        monto += scanner.nextDouble();
        System.out.println("Agregó el monto de S/."+ monto + "\n El "+ fecha + " \n A las " + hora);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error ! Por favor ingresar números enteros");
        }
        } while (error_agregar);
    }

    // Creando el método retiro----
    public void retiro() {
        Scanner scanner = new Scanner(System.in);
        boolean error_retiro = false;
        double retiro;
        do {
             try {
             System.out.println("Ingrese el monto que desea retirar: ");
        retiro = scanner.nextDouble();
        monto -= retiro;
        System.out.println("Hizo un retiro de S/."+ retiro + "\n El " + fecha+ "\n A las " + hora);
        } catch (Exception e) {
            System.out.println("Erro ! Por favor ingresar números enteros");
        }
        } while (error_retiro);
        }

    // Creando el método saldo----
    public void saldo() {
        System.out.println("Su saldo es S/." + monto);
        System.out.println(fecha + "\n"+ hora);
    }

    // Creando el método mostrar----
    public void mostrar() {
        Scanner scanner = new Scanner(System.in);
        // boolean error_mostrar = false;
        int selec;
        try {
            do {
                System.out.println("---- Bienvenido a new Bank Perú ---- ");
                System.out.println("[1] Depósito");
                System.out.println("[2] Retiro");
                System.out.println("[3] Consulta de saldo");
                System.out.println("[4] Salir");
                System.out.println("Elija la operación que desea realizar");
                selec = scanner.nextInt();

                switch (selec) {
                    case 1:
                        agregar();
                        break;

                    case 2:
                        retiro();
                        break;

                    case 3:
                        saldo();
                        break;

                    case 4:
                    System.out.println("HASTA LA PRÓXIMA");
                        System.exit(0);
                        break;

                    default:
                    System.out.println("Solo elegir las opciones 1/2/3/4");
                }

            } while (selec != 4);
        } catch (Exception e) {
            System.out.println("Solo elegir las opciones 1/2/3/4");
        }

    }
}