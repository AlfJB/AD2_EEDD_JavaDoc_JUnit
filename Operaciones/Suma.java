package Operaciones;

/** Hola Luís
 * Clase que implementa operaciones de suma para una calculadora.
 *
 * <p>Esta clase proporciona métodos para realizar sumas con diferentes números de parámetros.
 * Además, permite mantener un valor acumulado para realizar sumas sucesivas.</p>
 *
 * @author Jesús
 */
public class Suma {
    private double acumulado;

    /**
     * Constructor que inicializa el valor acumulado a 0.
     */
    public Suma() {
        this.acumulado = 0;
    }

    /**
     * Realiza una suma de dos números de tipo double.
     *
     * @param num1 El primer número a sumar.
     * @param num2 El segundo número a sumar.
     * @return El resultado de la suma.
     */
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Realiza una suma de dos números de tipo int.
     *
     * @param num1 El primer número a sumar.
     * @param num2 El segundo número a sumar.
     * @return El resultado de la suma.
     */
    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Realiza una suma de tres números de tipo double.
     *
     * @param num1 El primer número a sumar.
     * @param num2 El segundo número a sumar.
     * @param num3 El tercer número a sumar.
     * @return El resultado de la suma.
     */
    public static double sumar(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    /**
     * Realiza una suma acumulada, sumando el valor especificado al acumulado actual.
     *
     * @param valor El número a sumar al acumulado.
     * @return El valor acumulado después de la suma.
     */
    public double sumarAcumulado(double valor) {
        this.acumulado += valor;
        return this.acumulado;
    }

    /**
     * Obtiene el valor acumulado actual.
     *
     * @return El valor acumulado.
     */
    public double getAcumulado() {
        return this.acumulado;
    }
}

