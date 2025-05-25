public class Reserva {
    private String nombreCliente;
    private Habitacion habitacion;

    public Reserva(String nombreCliente, Habitacion habitacion) {
        this.nombreCliente = nombreCliente;
        this.habitacion = habitacion;
        this.habitacion.reservar();
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    @Override
    public String toString() {
        return "Reserva de " + nombreCliente + " en " + habitacion;
    }
}
