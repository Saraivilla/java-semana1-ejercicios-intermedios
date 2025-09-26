/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Sarai
 */
public class calculadoraAvanzada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;
        do {
            System.out.println("==========================");
            System.out.println("   Calculadora Avanzada   ");
            System.out.println("==========================");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada");
            System.out.println("7. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            //Solicita los dos números para los siguientes casos
            switch (opcion) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.print("\nIngresa el primer número: ");
                    num1 = entrada.nextDouble();
                    System.out.print("Ingresa el segundo número: ");
                    num2 = entrada.nextDouble();
                    break;
                default:
                    num1 = num2 = 0;
            }

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.printf("La suma de %.2f + %.2f es: %.2f%n", num1, num2, resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.printf("La resta de %.2f - %.2f es: %.2f%n", num1, num2, resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.printf("La multiplicación de %.2f x %.2f es: %.2f%n", num1, num2, resultado);
                    break;
                case 4:
                    //Validación de divisor 0
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.printf("La división de %.2f / %.2f es: %.2f%n", num1, num2, resultado);
                    } else {
                        System.out.println("No se puede dividir entre 0");
                    }
                    break;
                case 5:
                    resultado = Math.pow(num1, num2);
                    System.out.printf("%.2f elevado a %.2f es: %.2f%n", num1, num2, resultado);
                    break;
                case 6:
                    //Solicita solo un número
                    System.out.print("Ingresa el número: ");
                    num1 = entrada.nextDouble();
                    if (num1 >= 0) {
                        resultado = Math.sqrt(num1);
                        System.out.printf("La raíz cuadrada de %.2f es: %.2f%n", num1, resultado);
                    } else {
                        System.out.println("Error: No se puede calcular la raíz de un número negativo.");
                    }
                    break;
                case 7:
                    System.out.println("Gracias por utilizar la calculadora");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }

            System.out.println();
        } while (opcion != 7);
    }

}
