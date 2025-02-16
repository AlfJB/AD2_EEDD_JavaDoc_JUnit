package Testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Operaciones.Resta;

/**
 * Pruebas unitarias para la clase Resta.
 *
 * @author Alberto
 */
class RestaTest {
    private Resta resta;

    @BeforeEach
    void setUp() {
        resta = new Resta();
    }

    @Test
    void testRestarDosReales() {
        assertEquals(2.5, Resta.restar(5.5, 3.0), 0.001);
    }

    @Test
    void testRestarDosEnteros() {
        assertEquals(5, Resta.restar(10, 5));
    }

    @Test
    void testRestarTresReales() {
        assertEquals(-2.0, Resta.restar(5.0, 3.0, 4.0), 0.001);
    }

    @Test
    void testRestaAcumulada() {
        assertEquals(-3.5, resta.restarAcumulado(3.5));
        assertEquals(-7.0, resta.restarAcumulado(3.5));  // Suponiendo que resta es acumulativa
    }
}
