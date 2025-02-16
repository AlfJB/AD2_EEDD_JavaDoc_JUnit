package Operaciones;

/**
 * Clase que implementa operaciones de multiplicación y potencia
 * para una calculadora.
 *
 * <p>Esta clase proporciona métodos para realizar multiplicaciones
 * con diferentes números de parámetros y también para calcular potencias.</p>
 *
 * @author Luís
 */
public class Multiplicacion {

    /**
     * Multiplica dos números de tipo double.
     *
     * @param num1 El primer número a multiplicar.
     * @param num2 El segundo número a multiplicar.
     * @return El resultado de la multiplicación.
     */
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Multiplica dos números de tipo int.
     *
     * @param num1 El primer número a multiplicar.
     * @param num2 El segundo número a multiplicar.
     * @return El resultado de la multiplicación.
     */
    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Multiplica tres números de tipo double.
     *
     * @param num1 El primer número a multiplicar.
     * @param num2 El segundo número a multiplicar.
     * @param num3 El tercer número a multiplicar.
     * @return El resultado de la multiplicación.
     */
    public static double multiplicar(double num1, double num2, double num3) {
        return num1 * num2 * num3;
    }

    /**
     * Calcula la potencia de un número elevado a un exponente.
     *
     * @param base La base de la potencia.
     * @param exponente El exponente al que se eleva la base.
     * @return El resultado de la potencia.
     */
    public static double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }
}
