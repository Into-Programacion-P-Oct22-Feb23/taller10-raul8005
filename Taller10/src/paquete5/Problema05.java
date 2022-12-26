/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {

        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };

        char[][] letra = new char[4][2];
        String[][] letra1 = new String[4][2];
        String cadena = "";

        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {

                letra[i][j] = estudiantes[i][j].charAt(0);
                letra1[i][j] = String.valueOf(letra[i][j]);

                if (letra1[i][j].equals("S")
                        || letra1[i][j].equals("P")
                        || letra1[i][j].equals("T")) {

                    cadena = String.format("%s%s \n", cadena,
                            estudiantes[i][j]);

                }

            }

        }

        System.out.println(cadena);

    }
}
