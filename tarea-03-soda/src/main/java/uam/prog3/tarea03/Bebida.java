package uam.prog3.tarea03;

public class Bebida extends ItemMenu {
    private boolean grande;

    public Bebida(String nombre, double precioBase, boolean grande) {
        super(nombre, precioBase);
        this.grande = grande;
    }

    @Override
    public double calcularPrecio() {
        if (grande) {
            return getPrecioBase() + 500;
        }
        return getPrecioBase();
    }

    @Override
    public String describir() {
        if (grande) {
            return super.describir() + " (grande)";
        }
        return super.describir();
    }
}