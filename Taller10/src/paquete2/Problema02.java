/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema02 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
    
        
        int[][] ventas = new int [2][5];
        String[] nombres = {"Jessica Cole", "Robert Wallace"};
        
                
        int suma = 0;
    
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("Ingrese el valor de venta de %s\n", nombres);
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.println("Ingrese el numero de ventas al dia");
                ventas[i][j] = entrada.nextInt();
                suma = suma + ventas[i][j];
            }
            
            //sumaventas[i] = suma;
        }
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("Vendedor(a)%s\n", nombres[i]);
            
        }
        
        System.out.printf("Ha realizado un toral de %d en ventas\n", suma);

    }
}


