/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Sarai
 */
public class EstadisticaCalificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        double nota, sumNotas = 0, alta = 0, baja = 10;
        System.out.println("**Ingreso de calificaciones**\n");

        System.out.print("Ingrese la cantidad de estudiantes para ingresar notas: ");
        int cant = entrada.nextInt();

        for (int i = 0; i < cant; i++) {
            System.out.print("Ingrese la calificación del estudiante " + (i + 1) + ": ");
            nota = entrada.nextDouble();
            if (nota != -1) {
                sumNotas += nota;
                if (nota > alta) {
                    alta = nota;
                }

                if (nota < baja) {
                    baja = nota;
                }

            }
        }

        double promedio = sumNotas / cant;
        System.out.println("\n==========================================");
        System.out.printf("El promedio de las notas es: %.2f%n", promedio);
        System.out.printf("La nota más baja es: %.2f%n", baja);
        System.out.printf("La nota más alta es: %.2f%n", alta);
        System.out.println("==========================================\n");
    }

}
