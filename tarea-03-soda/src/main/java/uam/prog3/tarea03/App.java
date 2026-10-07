package uam.prog3.tarea03;

public class App {
    public static void main(String[] args) {
        ItemMenu casado = new Plato("Casado", 3500, true);
        ItemMenu cafe = new Bebida("Café", 1200, false);
        ItemMenu fresco = new Bebida("Fresco de mora", 1500, true);

        System.out.println("=== Menú ===");
        ItemMenu[] menu = {casado, cafe, fresco};
        for (ItemMenu item : menu) {
            System.out.println(item.describir());
        }

        Pedido pedido = new Pedido();
        pedido.agregar(casado);
        pedido.agregar(cafe, 2);
        pedido.agregar(fresco);
        pedido.agregar(cafe, 0);
        System.out.println("Subtotal: ₡" + pedido.calcularSubtotal());

        System.out.println("=== Pagos ===");
        MetodoPago[] metodos = {new Efectivo(), new Tarjeta()};
        for (MetodoPago metodo : metodos) {
            pedido.cobrar(metodo);
        }

        System.out.println("=== Parámetros ===");
        double subtotal = pedido.calcularSubtotal();
        aplicarDescuento(subtotal);
        System.out.println("Subtotal tras aplicarDescuento: ₡" + subtotal);

        agregarCortesia(pedido);
        System.out.println("Subtotal tras agregarCortesia: ₡" + pedido.calcularSubtotal());

        pedido.getItems().clear();
        System.out.println("Subtotal tras getItems().clear(): ₡" + pedido.calcularSubtotal());

        // System.out.println(casado.precioBase); // no compila: precioBase es private en ItemMenu; solo se puede usar dentro de esa clase
        // pedido.items.clear();                  // no compila: items es private en Pedido; desde App solo se llega por getItems(), que da una copia
    }

    private static void aplicarDescuento(double subtotal) {
        subtotal = subtotal * 0.9;
    }

    private static void agregarCortesia(Pedido pedido) {
        pedido.agregar(new Bebida("Agua", 500, false));
    }
}