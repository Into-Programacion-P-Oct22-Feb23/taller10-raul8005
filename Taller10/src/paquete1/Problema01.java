/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double[][] notas = {{9, 10, 7, 8}, 
                            {10, 5, 7, 9}, 
                            {7, 9.4, 10, 9}};
        String[] nombresEstudiante = {"Jerry Ponce", "Gabriela Lewis", 
            "David Bell"};
        double[] promedioNotas = new double[3];
        
        String cadena = "";
        
        for (int i = 0; i < notas.length; i++) { 
            double suma =0;
            double promedio = 0;
            for (int j = 0; j < notas[i].length; j++) { 
                suma = suma + notas[i][j];
                promedio =  suma / notas[i].length;
                
            }
            promedioNotas[i] = promedio;
        }
            
            
        for (var i = 0; i < nombresEstudiante.length; i++) {
            cadena = String.format("%sEstudiante: %s tiene un pomedio de "
                    + "%.2f\n", 
                    cadena, 
                    nombresEstudiante[i],
                    promedioNotas[i]);
                
            }
            System.out.printf("%s\n", cadena);
        }
}