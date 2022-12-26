/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        //double[][] datos = new double[2][2];
        int [][] datos1= new int[2][2];
        int datoingresado;
        
        for (int i = 0; i < datos1.length; i++) {
            for (int j = 0; j < datos1[i].length; j++) {
                
                System.out.printf("Ingrese valor para fila[%d]"
                + "columna [%d] \n", i , j);
                datoingresado = entrada.nextInt();
                datos1[i][j] = datoingresado;
            }
            
        }
        System.out.println();
        
        System.out.println("El nuevo arreglo es:");
        for (int i = 0; i < datos1.length; i++) {
            for (int j = 0; j < datos1[i].length; j++) {
                System.out.printf("%d\t", datos1[i][j]);
            }
            
             System.out.println();
        }
    }
}
        
