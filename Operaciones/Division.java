package Operaciones;

/**
 * En este caso hemos utilizado la ArithmeticException la cual no se nos ha explicado y hemos usado google para completar.
 * Y añadirla en la plantilla de JavaDoc.
 *
 * Clase que implementa operaciones de división y raíz cuadrada
 * para una calculadora.
 *
 * <p>Esta clase proporciona métodos para realizar divisiones con diferentes tipos de datos
 * (números enteros y de punto flotante), así como el cálculo de la raíz cuadrada de un número.</p>
 *
 * @author Alfonso
 */
public class Division {

    /**
     * Realiza una división de dos números de tipo double.
     *
     * <p>Si el divisor es cero, se lanzará una excepción {@link ArithmeticException}.</p>
     *
     * @param dividendo El número a dividir.
     * @param divisor El número por el que se divide el dividendo.
     * @return El resultado de la división.
     * @throws ArithmeticException Si el divisor es cero.
     */
    public static double dividir(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Error: División por cero no permitida.");
        }
        return dividendo / divisor;
    }

    /**
     * Realiza una división de dos números de tipo int.
     *
     * <p>Si el divisor es cero, se lanzará una excepción {@link ArithmeticException}.</p>
     *
     * @param dividendo El número a dividir.
     * @param divisor El número por el que se divide el dividendo.
     * @return El resultado de la división.
     * @throws ArithmeticException Si el divisor es cero.
     */
    public static int dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Error: División por cero no permitida.");
        }
        return dividendo / divisor;
    }

    /**
     * Calcula la raíz cuadrada de un número.
     *
     * <p>Si el número es negativo, se lanzará una excepción {@link ArithmeticException}.</p>
     *
     * @param numero El número del que se calcula la raíz cuadrada.
     * @return El valor de la raíz cuadrada.
     * @throws ArithmeticException Si el número es negativo.
     */
    public static double raiz(double numero) {
        if (numero < 0) {
            throw new ArithmeticException("Error: No se puede calcular la raíz de un número negativo.");
        }
        return Math.sqrt(numero);
    }
}
