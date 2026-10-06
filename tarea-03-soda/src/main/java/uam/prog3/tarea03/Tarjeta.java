package uam.prog3.tarea03;

public class Tarjeta implements MetodoPago {
    @Override
    public String getNombre() {
        return "Tarjeta";
    }

    @Override
    public double calcularTotal(double subtotal) {
        return subtotal * 1.03;
    }
}