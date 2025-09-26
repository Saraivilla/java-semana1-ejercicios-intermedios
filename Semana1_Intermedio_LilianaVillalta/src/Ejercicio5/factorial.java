/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Sarai
 */
public class factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Cálculo de factorial");
            System.out.println("1. Ingresar número");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número para calcular su factorial: ");
                    int num = entrada.nextInt();

                    if (num < 0) {
                        System.out.println("Los números negativos no tienen factorial");
                    } else {
                        int factorial = 1;

                        for (int i = 1; i <= num; i++) {
                            factorial *= i;
                        }

                        System.out.println("\nEl factorial de " + num + " es: " + factorial + "\n");
                    }
                    break;
                case 2:
                    System.out.println("Gracias por utilizar la calculadora de factorial!\n");
                    break;
                default:
                    System.out.println("\nOpción inválida\n");
                    break;
            }

        } while (opcion != 2);
    }

}
