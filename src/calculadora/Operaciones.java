package calculadora;

import javax.swing.JOptionPane;

public class Operaciones {

    public int[][] Suma(int matriz1[][], int matriz2[][]) {
        int matriz3[][] = new int[matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];

            }

        }
        String respuesta = "";
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3.length; j++) {
                respuesta += " " + matriz3[i][j];
            }
            respuesta += " \n ";
        }
        JOptionPane.showMessageDialog(null, "la suma es:\n \t" + respuesta);
        return null;
    }

    public int[][] Resta(int matriz1[][], int matriz2[][]) {
        int matriz3[][] = new int[matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matriz3[i][j] = matriz1[i][j] - matriz2[i][j];

            }

        }
        String respuesta = "";
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3.length; j++) {
                respuesta += " " + matriz3[i][j];
            }
            respuesta += " \n ";
        }
        JOptionPane.showMessageDialog(null, "la resta es:\n \t" + respuesta);
        return null;
    }

    public int[][] Traza(int matriz1[][]) {
        int suma = 0;
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
            }
        }
        for (int i = 0, j = 0; i < matriz1.length; i++, j++) {
            suma += matriz1[i][j];

        }
        JOptionPane.showMessageDialog(null, "la traza es: \t" + suma);

        return null;

    }

    public int[][] Determinante(int matriz1[][], int matriz2[][]) {

        return null;

    }

}
