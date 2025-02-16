package Testing;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Operaciones.Multiplicacion;

/**
 * Pruebas unitarias para la clase Multiplicacion.
 *
 * @author Luís
 */
class MultiplicacionTest {

    @Test
    void testMultiplicarDosReales() {
        assertEquals(9.0, Multiplicacion.multiplicar(3.0, 3.0), 0.001);
    }

    @Test
    void testMultiplicarDosEnteros() {
        assertEquals(20, Multiplicacion.multiplicar(4, 5));
    }

    @Test
    void testMultiplicarTresReales() {
        assertEquals(30.0, Multiplicacion.multiplicar(2.0, 3.0, 5.0), 0.001);
    }

    @Test
    void testPotencia() {
        assertEquals(16.0, Multiplicacion.potencia(2.0, 4), 0.001);
    }
}
