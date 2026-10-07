package uam.prog3.tarea03;

public abstract class ItemMenu {
    private String nombre;
    private double precioBase;

    protected ItemMenu(String nombre, double precioBase) {
        this.nombre = nombre;
        if (precioBase <= 0) {
            System.out.println("Precio inválido para " + nombre + ", se usa 0");
            this.precioBase = 0;
        } else {
            this.precioBase = precioBase;
        }
    }

    public String getNombre() {
        return nombre;
    }

    protected double getPrecioBase() {
        return precioBase;
    }

    public abstract double calcularPrecio();

    public String describir() {
        return nombre + " - ₡" + calcularPrecio();
    }
}