package Testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Operaciones.Suma;

/**
 * Pruebas unitarias para la clase Suma.
 *
 * @author Jesús
 */
class SumaTest {
    private Suma suma;

    @BeforeEach
    void setUp() {
        suma = new Suma();
    }

    @Test
    void testSumarDosReales() {
        assertEquals(5.5, Suma.sumar(2.5, 3.0), 0.001);
    }

    @Test
    void testSumarDosEnteros() {
        assertEquals(10, Suma.sumar(4, 6));
    }

    @Test
    void testSumarTresReales() {
        assertEquals(10.2, Suma.sumar(2.5, 3.2, 4.5), 0.001);
    }

    @Test
    void testSumaAcumulada() {
        assertEquals(3.5, suma.sumarAcumulado(3.5));
        assertEquals(7.0, suma.sumarAcumulado(3.5));
    }
}