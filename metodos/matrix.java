package metodos;

import java.util.Scanner;
import java.util.Random;

public class matrix {

    public static void llenarMatriz(int matrix[][]) {

        Scanner blur = new Scanner(System.in);
        for (byte a = 0; a < matrix.length; a++) {
            for (byte b = 0; b < matrix.length; b++) {

                System.out.print("Matriz [" + a + "] [" + b + "] = ");
                matrix[a][b] = blur.nextInt();
            }
        }
    }
//------------------------------------------------------------------------------

    public static void imprimirMatriz(int matrix[][]) {

        for (byte a = 0; a < matrix.length; a++) {
            for (byte b = 0; b < matrix[a].length; b++) {
                System.out.print(matrix[a][b] + "\t");
            }
            System.out.println();
        }
    }
//------------------------------------------------------------------------------

    public static void matrizRandom(int matrix[][], short range) {

        Random sdlg = new Random();

        for (byte a = 0; a < matrix.length; a++) {
            for (byte b = 0; b < matrix[a].length; b++) {
                matrix[a][b] = sdlg.nextInt(range + 1);
            }
        }
    }
//------------------------------------------------------------------------------

    public static void calcularPromedioDeCadaFila(int matrix[][]) {
        short suma;
        float promedio;

        for (byte a = 0; a < matrix.length; a++) {
            suma = 0;
            for (byte b = 0; b < matrix[a].length; b++) {
                suma += matrix[a][b];
            }
            
            promedio = (float) suma / matrix[a].length;
            System.out.println("Promedio de los numeros de la fila " + (a + 1) + ": " + promedio);
        }
    }
//------------------------------------------------------------------------------

    public static void calcularPromedioDeCadaColumna(int matrix[][]) {
        short suma;
        float promedio;

        for (byte b = 0; b < matrix[0].length; b++) {
            suma = 0;
            for (byte a = 0; a < matrix.length; a++) {
                suma += matrix[a][b];
            }

            promedio = (float) suma / matrix.length;
            System.out.println("Promedio de los numeros de la columna " + (b + 1) + ": " + promedio);
        }
    }
//------------------------------------------------------------------------------
    
    public static void printMultiples(int[][] matrix, int multiple) {
        System.out.println("Numeros multiplos de " + multiple + ":");
        
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix1.length; j++) {
                if (matrix1[j] % multiple == 0) {
                    System.out.println(matrix1[j]);
                }
            }
        }
    }
//------------------------------------------------------------------------------
    
    public static String matrizToString(int matrix[][]) {
        String s = "";

        for (int a = 0; a < matrix.length; a++) {
            s = s + "[ ";
            for (byte b = 0; b < matrix.length - 1; b++) {
                s = s + String.valueOf(matrix[a][b]) + ", ";
            }
            s = s + matrix[a][a];
            s = s + "]\n\n";
        }
        return s;
    }
}
