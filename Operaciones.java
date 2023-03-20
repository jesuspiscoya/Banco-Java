import java.util.*;

public class Operaciones {

    // Creando una variable general----
    double monto = 0;

    // Crear dos ArrayList vacíos para nombres y DNI----
     ArrayList<String> dnis = new ArrayList<>();
     ArrayList<String> claves = new ArrayList<>();

    // Creando los getters para que devuelvan el valor de dnis y claves
    public ArrayList<String> getDnis() {
        return dnis;
    }

    public ArrayList<String> getClaves() {
        return claves;
    }



    // Creando los métodos agregar/retiro/sado/mostrar----
    public void agregar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el monto que desea agregar: ");
        monto = scanner.nextDouble();
    }

    public void retiro() {
        
        Scanner scanner = new Scanner(System.in);
        double retiro;
        System.out.println("Ingrese el monto que desea retirar: ");
        retiro = scanner.nextDouble();
        System.out.println(retiro);
        monto -= retiro;
    }

    public void saldo() {
        System.out.println("Su saldo es: " + monto);
    }

    public void mostrar() {
        Scanner scanner = new Scanner(System.in);
        int selec;
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
                    System.exit(0);
            }

        } while (selec != 4);

    }
}