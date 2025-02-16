package Testing;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Operaciones.Division;

/**
 * Pruebas unitarias para la clase Division.
 *
 * @author Alfonso
 */
class DivisionTest {

    @Test
    void testDividirDosReales() {
        assertEquals(2.5, Division.dividir(5.0, 2.0), 0.001);
    }

    @Test
    void testDividirDosEnteros() {
        assertEquals(3, Division.dividir(9, 3));
    }

    @Test
    void testDivisionPorCero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Division.dividir(10, 0);
        });
        assertEquals("Error: División por cero no permitida.", exception.getMessage());
    }

    @Test
    void testRaizCuadrada() {
        assertEquals(4.0, Division.raiz(16.0), 0.001);
    }

    @Test
    void testRaizDeNumeroNegativo() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Division.raiz(-4.0);
        });
        assertEquals("Error: No se puede calcular la raíz de un número negativo.", exception.getMessage());
    }
}

