/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Sarai
 */
public class cajeroAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        //sado inicial
        double saldo = 500.00;

        int opcion;

        do {
            System.out.println("================================");
            System.out.println("        Cajero automático       ");
            System.out.println("================================");

            //Opciones
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.println("================================");

            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    //Consulta de saldo
                    System.out.printf("Saldo actual: %.2f%n", saldo);
                    break;
                case 2:
                    //Deposito
                    System.out.print("Ingrese el monto a depositar: $");
                    double deposito = entrada.nextDouble();

                    if (deposito > 0) {
                        saldo += deposito; 
                        System.out.printf("Deposito exitoso. Nuevo saldo: %.2f%n ", saldo);
                    } else {
                        System.out.println("Cantidad Inválida");
                    }
                    break;
                case 3:
                    //Retiro
                    System.out.print("Ingrese el monto a retirar: $");
                    double retiro = entrada.nextDouble();
                    if (retiro > 0 && retiro <= saldo) { //El retiro debe ser menor al saldo actual
                        saldo -= retiro;
                        System.out.printf("Retiro exitoso. Nuevo saldo: %.2f%n ", saldo);
                    } else {
                        System.out.println("Cantidad inválida o fondos insuficientes");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opción Inválida. Seleccione una opción correcta");
                    break;
            }
            System.out.println("");

        } while (opcion != 4);
    }

}
