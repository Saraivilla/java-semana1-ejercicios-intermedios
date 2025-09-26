/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

import java.util.Scanner;
import java.util.ArrayList; //Importamos ArrayList
/**
 *
 * @author Sarai
 */
public class inventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        //ArrayList por atributo
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Double> precios = new ArrayList<>();
        ArrayList<Integer> cantidades = new ArrayList<>();
        
        int opcion;
        do {

            System.out.println("==============================");
            System.out.println("  Bienvenido a mi inventario  ");
            System.out.println("==============================");

            //MENÚ
            System.out.println("1. Registrar producto");
            System.out.println("2. Mostrar Productos");
            System.out.println("3. Valor total de inventario");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    //REGISTRAR PRODCUTO
                    System.out.println("\nRegistro de producto");
                    System.out.print("Nombre de producto: ");
                    String nombre = entrada.nextLine();
                    System.out.print("Precio: $");
                    double precio = entrada.nextDouble();
                    System.out.print("Cantidad: ");
                    int cantidad = entrada.nextInt();

                    //Agregar información por cada arrayList
                    nombres.add(nombre);
                    precios.add(precio);
                    cantidades.add(cantidad);
                    
                    System.out.println("Producto registrado!!\n");
                    break;
                case 2:
                    //Validación para ver si hay productos
                    if (nombres.isEmpty()) {
                        System.out.println("No hay productos registrados.\n");
                    } else {
                        System.out.println("\n--- Productos Registrados ---");
                        for (int i = 0; i < nombres.size(); i++) {
                            System.out.println((i + 1) + ". Nombre: " + nombres.get(i) + " Precio: $" + precios.get(i) + " Cantidad: " + cantidades.get(i));
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    //Obtener valor total de inventario
                    double total = 0;
                    for (int i = 0; i < nombres.size(); i++) {
                        total += precios.get(i) * cantidades.get(i);
                    }
                    System.out.println("\nValor total del inventario: $" + total + "\n");
                    break;
                case 4:
                    System.out.println("\nGracias por utilizar el inventario\n");
                    break;
                default:
                    System.out.println("\nOpción inválida. Ingrese una opción válida\n");
                    break;
            }

        } while (opcion != 4);
    }

}
