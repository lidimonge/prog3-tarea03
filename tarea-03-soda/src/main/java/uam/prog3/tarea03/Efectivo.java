package uam.prog3.tarea03;

public class Efectivo implements MetodoPago {
    @Override
    public String getNombre() {
        return "Efectivo";
    }

    @Override
    public double calcularTotal(double subtotal) {
        return subtotal;
    }
}