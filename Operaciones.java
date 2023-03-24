import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class Operaciones {

    double monto = 0;
    Scanner scanner = new Scanner(System.in);
    LocalTime hora = LocalTime.now();
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


    // Creando métodos boolean para que me devuelvan o TRUE o FALSE
    public boolean isDouble(String value) {
        try {
            double v = Double.parseDouble(value);
            if (v > 0) {
                return true;
            } else {
                System.out.println("Error ! Por favor ingresar un monto mayor a 0\n");
                return false;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error ! Por favor ingresar números enteros\n");
            return false;
        }
    }

    public boolean isInt(String value) {
        try {
            int v = Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("\nSolo elegir las opciones 1/2/3/4\n");
            return false;
        }
    }

    // Creando el método agregar----
    public void agregar() {
        String value;
        do {
            System.out.print("\nIngrese el monto que desea agregar: ");
            value = scanner.nextLine();
        } while (!isDouble(value));
        monto += Double.parseDouble(value);
        System.out.println("\nHizo un depósito de S/." + monto + "\nEl " + fecha + " \nA las " + hora + "\n");
    }

    // Creando el método retiro----
    public void retiro() {
        String value;
        double retiro;
        do {
            System.out.print("\nIngrese el monto que desea retirar: ");
            value = scanner.nextLine();
        } while (!isDouble(value));
        retiro = Double.parseDouble(value);
        monto -= retiro;
        System.out.println("\nHizo un retiro de S/." + retiro + "\nEl " + fecha + "\nA las " + hora + "\n");
    }

    // Creando el método saldo----
    public void saldo() {
        System.out.println("\nSu saldo es S/." + monto);
        System.out.println(fecha + "\n" + hora + "\n");
    }

    // Creando el método mostrar----
    public void mostrar() {
        String value;
        int selec;
        do {
            System.out.println("[1] Depósito");
            System.out.println("[2] Retiro");
            System.out.println("[3] Consulta de saldo");
            System.out.println("[4] Salir");
            System.out.print("Elija la operación que desea realizar: ");
            value = scanner.nextLine();
        } while (!isInt(value));
        selec = Integer.parseInt(value);

        switch (selec) {
            case 1:
                agregar();
                mostrar();
                break;

            case 2:
                retiro();
                mostrar();
                break;

            case 3:
                saldo();
                mostrar();
                break;

            case 4:
                System.out.println("\nHASTA LA PRÓXIMA\n");
                System.exit(0);

            default:
                System.out.println("\nSolo elegir las opciones 1/2/3/4\n");
                mostrar();
                break;
        }
    }
}