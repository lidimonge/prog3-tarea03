package uam.prog3.tarea03;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemMenu> items = new ArrayList<>();

    public void agregar(ItemMenu item) {
        items.add(item);
    }

    public void agregar(ItemMenu item, int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser positiva");
            return;
        }
        for (int i = 0; i < cantidad; i++) {
            items.add(item);
        }
    }

    public double calcularSubtotal() {
        double subtotal = 0;
        for (ItemMenu item : items) {
            subtotal += item.calcularPrecio();
        }
        return subtotal;
    }

    public List<ItemMenu> getItems() {
        return new ArrayList<>(items);
    }

    public void cobrar(MetodoPago metodo) {
        double total = metodo.calcularTotal(calcularSubtotal());
        System.out.println("Total a pagar con " + metodo.getNombre() + ": ₡" + total);
    }
}