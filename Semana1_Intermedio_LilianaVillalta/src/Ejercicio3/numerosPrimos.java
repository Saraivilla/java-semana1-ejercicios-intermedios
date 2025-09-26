/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Sarai
 */
public class numerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número para verificar si es primo: ");
        int num = entrada.nextInt();

        //Ni 1 ni números negativos pueden ser primos
        if (num < 2) {
            System.out.println("El número " + num + " no es primo.");
        } else {
            boolean esPrimo = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println("El número " + num + " es primo.");
            } else {
                System.out.println("El número " + num + " no es primo.");
            }
        }
    }

}
