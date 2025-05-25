import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Habitacion> habitaciones;
    private List<Reserva> reservas;

    public Hotel() {
        habitaciones = new ArrayList<>();
        reservas = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            habitaciones.add(new Habitacion(i));
        }
    }

    public Habitacion buscarHabitacionDisponible() {
        for (Habitacion h : habitaciones) {
            if (h.estaDisponible()) {
                return h;
            }
        }
        return null;
    }

    public Reserva crearReserva(String nombreCliente) {
        Habitacion libre = buscarHabitacionDisponible();
        if (libre != null) {
            Reserva nueva = new Reserva(nombreCliente, libre);
            reservas.add(nueva);
            return nueva;
        }
        return null;
    }

    public void mostrarEstadoHabitaciones() {
        for (Habitacion h : habitaciones) {
            System.out.println(h);
        }
    }
}
