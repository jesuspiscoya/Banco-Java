
// import java.time.LocalDate;
// import java.time.LocalDateTime;
import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {
        Operaciones operaciones = new Operaciones();


        // Crear dos ArrayList vacíos para nombres y DNI
        // Solicitar al usuario que ingrese un nombre y un DNI
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        do {
            // LocalDateTime myobj = LocalDateTime.now();
            // System.out.println(myobj);
            System.out.println("||---- Bienvenido a new Bank Perú ----||");
            System.out.println("        <---- REGISTRARSE ---->         ");
            System.out.print("Ingrese un DNI: ");
            String dni = scanner.nextLine();
            System.out.print("Cree una clave: ");
            String clave = scanner.nextLine();

            // Agregar el nombre y DNI a los ArrayLists correspondientes
            operaciones.getDnis().add(dni);
            operaciones.getClaves().add(clave);

            System.out.println("¿Desea ingresar otro elemento? (s/n): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));

        // Mostrar los elementos ingresados en los ArrayLists
        System.out.println("\nElementos ingresados:");
        for (int i = 0; i < operaciones.getDnis().size(); i++) {
            System.out.println(operaciones.getDnis().get(i) + " - " + operaciones.getClaves().get(i));
        }

        // for (int i = 0; i < dnis.size(); i++) {
        // System.out.println(dnis.get(i) + " - " + claves.get(i));
        // }

        System.out.println("||---- Bienvenido a new Bank Perú ----||");
        System.out.println("         <----INICIAR SESIÓN---->       ");
        System.out.println("Ingrese su DNI: ");
        String dni = scanner.nextLine();

        System.out.println("Ingrese su password: ");
        String clave = scanner.nextLine();

        int intentos = 1;

        for (int i = 0; i < operaciones.getDnis().size(); i++) {
            while (intentos < 4) {
                if (operaciones.getDnis().get(i).equals(dni) && operaciones.getClaves().get(i).equals(clave)) {
                    System.out.println("Bienvenido");
                    operaciones.mostrar();
                } else {
                    System.out.println("Hay un error en los datos, intente otra vez");
                    System.out.println("Ingrese su DNI: ");
                    dni = scanner.nextLine();
                    System.out.println("Ingrese su password: ");
                    clave = scanner.nextLine();
                    intentos++;
                    if (intentos == 3) {
                        System.out.println("El sistema se ah bloqueado");
                        break;
                    }
                }
            }
        }

    }
}
