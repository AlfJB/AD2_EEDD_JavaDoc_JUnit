package Operaciones;

/**
 * Clase que implementa operaciones de resta para una calculadora.
 *
 * <p>Esta clase proporciona métodos para realizar restas con diferentes números de parámetros.
 * Además, permite mantener un valor acumulado para realizar restas sucesivas.</p>
 *
 * @author Alberto
 */
public class Resta {
    private double acumulado;

    /**
     * Constructor que inicializa el valor acumulado a 0.
     */
    public Resta() {
        this.acumulado = 0;
    }

    /**
     * Realiza una resta de dos números de tipo double.
     *
     * @param minuendo El número del que se va a restar.
     * @param sustraendo El número que se va a restar al minuendo.
     * @return El resultado de la resta.
     */
    public static double restar(double minuendo, double sustraendo) {
        return minuendo - sustraendo;
    }

    /**
     * Realiza una resta de dos números de tipo int.
     *
     * @param minuendo El número del que se va a restar.
     * @param sustraendo El número que se va a restar al minuendo.
     * @return El resultado de la resta.
     */
    public static int restar(int minuendo, int sustraendo) {
        return minuendo - sustraendo;
    }

    /**
     * Realiza una resta de tres números de tipo double.
     *
     * @param num1 El primer número de la resta.
     * @param num2 El segundo número de la resta.
     * @param num3 El tercer número de la resta.
     * @return El resultado de la resta.
     */
    public static double restar(double num1, double num2, double num3) {
        return num1 - num2 - num3;
    }

    /**
     * Realiza una resta acumulada, restando el valor especificado al acumulado actual.
     *
     * @param valor El número a restar del acumulado.
     * @return El valor acumulado después de la resta.
     */
    public double restarAcumulado(double valor) {
        this.acumulado -= valor;
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
