package utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class InventarioTest {

    @Test
    void testCalcularAjusteCategoriaPremium() {
        // Creamos el objeto de la clase refactorizada
        InventarioAlmacen inventario = new InventarioAlmacen();

        // El ajuste premium es del 20% (100 * 0.20 = 20.0)
        double resultado = inventario.calcularAjusteCategoria("premium", 100.0);

        assertEquals(20.0, resultado, "El ajuste premium debería ser 20.0");
    }

    @Test
    void testCalcularAjusteCategoriaBasica() {
        InventarioAlmacen inventario = new InventarioAlmacen();

        // El ajuste básico es del -5% (100 * -0.05 = -5.0)
        double resultado = inventario.calcularAjusteCategoria("basica", 100.0);

        assertEquals(-5.0, resultado, "El ajuste básico debería ser -5.0");
    }
}


