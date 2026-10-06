package uam.prog3.tarea03;

public class Plato extends ItemMenu {
    private boolean conAcompanamiento;

    public Plato(String nombre, double precioBase, boolean conAcompanamiento) {
        super(nombre, precioBase);
        this.conAcompanamiento = conAcompanamiento;
    }

    @Override
    public double calcularPrecio() {
        if (conAcompanamiento) {
            return getPrecioBase() + 800;
        }
        return getPrecioBase();
    }
}