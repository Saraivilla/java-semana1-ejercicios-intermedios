/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import java.util.Random; //Importamos Random
import java.util.Scanner;

/**
 *
 * @author Sarai
 */
public class adivinarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        //Generamos el número
        Random random = new Random();
        int numRandom = random.nextInt(100) + 1;

        int intentos = 0;
        int num;

        do {
            System.out.print("Ingrese el número: ");
            num = entrada.nextInt();
            intentos++;

            //Verificamos si el número es mayor, menor o igual
            if (num < numRandom) {
                System.out.println("Demasiado bajo");
            } else if (num > numRandom) {
                System.out.println("Demasiado alto");
            } else {
                System.out.println("¡Felicidades. Lo lograste en " + intentos + " intentos");
            }

        } while (numRandom != num);

    }

}
