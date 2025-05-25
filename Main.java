import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Ver disponibilidad");
            System.out.println("2. Crear reserva");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    hotel.mostrarEstadoHabitaciones();
                    break;
                case 2:
                    System.out.print("Nombre del cliente: ");
                    String nombre = sc.nextLine();
                    Reserva r = hotel.crearReserva(nombre);
                    if (r != null) {
                        System.out.println("Reserva creada: " + r);
                    } else {
                        System.out.println("No hay habitaciones disponibles.");
                    }
                    break;
                case 3:
                    System.out.println("Gracias por usar el sistema.");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
