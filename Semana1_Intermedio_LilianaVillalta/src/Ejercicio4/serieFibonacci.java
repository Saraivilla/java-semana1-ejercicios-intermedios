/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author Sarai
 */
public class serieFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Inicialización de los primeros 2 valores
        int num1 = 0, num2 = 1, contador = 0, next;

        //Contador 20 para evitar cálculo excesivo
        while (contador < 20) {

            System.out.print(num1 + "|" + num2 + "|");
            next = num1 + num2;
            num2 = num2 + next;
            num1 = next;
            contador++;
        }
        System.out.println("");
    }

}
