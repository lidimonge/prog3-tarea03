# Tarea 3 - Sistema de la Soda

**1.** `pedido.items.clear()` sí compilaría dentro de `Pedido`, y `casado.precioBase` sí compilaría dentro de `ItemMenu`, porque `private` permite el acceso desde cualquier código escrito en la misma clase ("private es por clase, no por objeto"). En `App` no compilan porque es otra clase: el compilador da el error *has private access*.

**2.** `casado.getPrecioBase()` sí compila escrito en `App` (probado: imprime 3500.0). `protected` da acceso a las subclases y también a todas las clases del mismo paquete, y `App` está en el paquete `uam.prog3.tarea03`, igual que `ItemMenu`.