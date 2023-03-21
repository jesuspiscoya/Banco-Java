import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {

        // Instanciando un objeto de la clase Operaciones para poder acceder a sus métodos----
        Operaciones operaciones = new Operaciones();

        Scanner scanner = new Scanner(System.in);
        String respuesta;

        // Esto es el momento de registro ----
        do {
            System.out.println("||---- Bienvenido a new Bank Perú ----||");
            System.out.println("        <---- REGISTRARSE ---->         ");
            System.out.print("Ingrese un DNI: ");
            String dni = scanner.nextLine();
            System.out.print("Cree una clave: ");
            String clave = scanner.nextLine();

            // Agregamos el dni y clave a los ArrayLists correspondientes----
            operaciones.getDnis().add(dni);
            operaciones.getClaves().add(clave);

            System.out.println("¿Desea ingresar otro elemento? (s/n): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));

        // Mostrar los elementos ingresados en los ArrayLists----
        System.out.println("\nElementos ingresados:");
        for (int i = 0; i < operaciones.getDnis().size(); i++) {
            System.out.println(operaciones.getDnis().get(i) + " - " + operaciones.getClaves().get(i));
        }

        // Esto es el incio de sesión ----
        System.out.println("||---- Bienvenido a new Bank Perú ----||");
        System.out.println("         <----INICIAR SESIÓN---->       ");
        System.out.println("Ingrese su DNI: ");
        String dni = scanner.nextLine();

        System.out.println("Ingrese su password: ");
        String clave = scanner.nextLine();


        // Aquí es el sistema de los 3 intentos para ingresar----
        int intentos = 1; //

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
