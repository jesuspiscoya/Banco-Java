import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {

        // Instanciando un objeto de la clase Operaciones para poder acceder a sus
        // métodos----
        Operaciones operaciones = new Operaciones();

        Scanner scanner = new Scanner(System.in);
        String respuesta;

        System.out.println("\n||---- Bienvenido a new Bank Perú ----||");
        System.out.println("        <---- REGISTRARSE ---->");

        // Esto es el momento de registro ----
        do {
            System.out.print("\nIngrese un DNI: ");
            String dni = scanner.nextLine();
            System.out.print("Cree una clave: ");
            String clave = scanner.nextLine();

            // Agregamos el dni y clave a los ArrayLists correspondientes----
            operaciones.getDnis().add(dni);
            operaciones.getClaves().add(clave);

            System.out.println("\n*Presione 's' si desea ingresar otro usuario*\n*Presione cualquier tecla si ya no desea ingresar más usuarios*");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));

        // Mostrar los elementos ingresados en los ArrayLists----
        System.out.println("Elementos ingresados:");
        for (int i = 0; i < operaciones.getDnis().size(); i++) {
            System.out.println(operaciones.getDnis().get(i) + " - " + operaciones.getClaves().get(i));
        }

        // Esto es el incio de sesión ----
        //System.out.println("\n||---- Bienvenido a new Bank Perú ----||");
        System.out.println("        <---- INICIAR SESIÓN ---->");

        // Aquí es el sistema de los 3 intentos para ingresar----
        int intentos = 0; //

        while (intentos < 3) {
            System.out.print("\nIngrese su DNI: ");
            String dni = scanner.nextLine();

            System.out.print("Ingrese su password: ");
            String clave = scanner.nextLine();

            for (int i = 0; i < operaciones.getDnis().size(); i++) {
                if (operaciones.getDnis().get(i).equals(dni) && operaciones.getClaves().get(i).equals(clave)) {
                    System.out.println("\n        **** BIENVENIDO ****");
                    operaciones.mostrar();
                    break;
                }
            }
            intentos++;
            System.out.println("\nHay un error en los datos, intente otra vez");
        }
        System.out.println("\nEl sistema se ha bloqueado\n");
    }
}