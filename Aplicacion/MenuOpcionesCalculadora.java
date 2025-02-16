package Aplicacion;

import java.util.Scanner;

/**
 * Clase que implementa el menú interactivo de la calculadora.
 *
 * @author Jesús
 */

public class MenuOpcionesCalculadora {

    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== Calculadora ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            double num1, num2;

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + Suma.sumar(num1, num2));
                    break;
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + Resta.restar(num1, num2));
                    break;
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + Multiplicacion.multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.print("Ingrese el dividendo: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el divisor: ");


            }

        }
    }
}