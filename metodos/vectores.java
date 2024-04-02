package metodos;

import java.util.Scanner;

public class vectores {

    public static void imprimir(int[] arr) {
        byte i;

        if (arr.length > 1) {
            System.out.print("V = {");
            for (i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + ", ");
            }
            System.out.println(arr[i] + "}");
        } else {
            for (i = 0; i < arr.length; i++) {
                System.out.print("V = {" + arr[i] + "}");
            }
        }
    }
//------------------------------------------------------------------------------

    public static void imprimirDouble(double[] arr) {
        byte length = (byte) arr.length, i;

        System.out.print("V = {");
        for (i = 0; i < length - 1; i++) {
            if (arr[i] == (int) arr[i]) {
                System.out.print((int) arr[i] + ", ");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }

        if (arr[i] == (int) arr[i]) {
            System.out.println((int) arr[i] + "}");
        } else {
            System.out.println(arr[i] + "}");
        }

    }
//------------------------------------------------------------------------------

    public static void ordenamientoBurbuja(int[] arr) {
        byte n = (byte) arr.length, i, j;

        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }
//------------------------------------------------------------------------------

    public static byte contarPosicionesRepetidas(int[] arr, int numeroBuscado) {
        byte contador = 0, i;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] == numeroBuscado) {
                contador++;
            }
        }

        return contador;
    }
//------------------------------------------------------------------------------

    public static void imprimirInverso(int[] arr) {
        byte length = (byte) arr.length, i;

        System.out.print("\nV-1 = {");
        for (i = (byte) (length - 1); i >= 1; i--) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[0] + "}");
    }
//------------------------------------------------------------------------------

    public static void llenar(int[] arr) {
        Scanner blur = new Scanner(System.in);

        byte length = (byte) arr.length, i;

        for (i = 0; i < length; i++) {
            System.out.print("Posicion " + (i + 1) + ": ");
            arr[i] = blur.nextShort();
        }
    }
//------------------------------------------------------------------------------

    public static void cambiarXtoZ(int[] arr, short changeX, short toZ) {
        for (byte i = 0; i < arr.length; i++) {
            if (arr[i] == changeX) {
                arr[i] = toZ;
            }
        }
    }
//------------------------------------------------------------------------------

    public static int[] obtenerEspejo(int[] vectorOriginal) {
        byte i;
        int[] vectorEspejo = new int[vectorOriginal.length];

        for (i = 0; i < vectorOriginal.length; i++) {
            int digit = vectorOriginal[i];
            int reversed = 0;
            while (digit != 0) {
                int remainder = digit % 10;
                reversed = reversed * 10 + remainder;
                digit = digit / 10;
            }
            vectorEspejo[i] = reversed;
        }

        return vectorEspejo;

    }
//------------------------------------------------------------------------------

    public static int encontrarNumeroMenor(int[] vector) {
        int menor = vector[0];

        for (byte i = 1; i < vector.length; i++) {
            if (vector[i] < menor) {
                menor = vector[i];
            }
        }

        return menor;
    }
//------------------------------------------------------------------------------

    public static int[] concatenar2Vectores(int[] arr1, int[] arr2, int[] arrConcat) {

        byte length1 = (byte) arr1.length, length2 = (byte) arr2.length, lengthConcat;

        lengthConcat = (byte) (length1 + length2);

        for (byte i = 0; i < length1; i++) {
            arrConcat[i] = arr1[i];
        }

        for (byte i = 0; i < length2; i++) {
            arrConcat[i + length1] = arr2[i];
        }

        return arrConcat;

    }
//------------------------------------------------------------------------------

    public static boolean esPerfecto(int numero) {
        int sumaDivisores = 1;
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
                if (i != numero / i) {
                    sumaDivisores += numero / i;
                }
            }
        }
        return sumaDivisores == numero && numero != 1;
    }
//------------------------------------------------------------------------------

    public static int[] interleaveVectors(int[] vectorA, int[] vectorB) {
        int maxLength = Math.max(vectorA.length, vectorB.length);
        int[] vectorC = new int[maxLength * 2];

        int indexC = 0;
        int indexA = 0;
        int indexB = 0;

        while (indexA < vectorA.length || indexB < vectorB.length) {
            if (indexA < vectorA.length) {
                vectorC[indexC++] = vectorA[indexA++];
            }
            if (indexA < vectorA.length) {
                vectorC[indexC++] = vectorA[indexA++];
            }
            if (indexB < vectorB.length) {
                vectorC[indexC++] = vectorB[indexB++];
            }
            if (indexB < vectorB.length) {
                vectorC[indexC++] = vectorB[indexB++];
            }
        }

        int[] result = new int[indexC];
        System.arraycopy(vectorC, 0, result, 0, indexC);

        return result;
    }
//------------------------------------------------------------------------------
    
    public static void insertarVector(int[] V1, int[] V2, int posicionInicial) {
        int indiceV1 = 0;
        for (int i = posicionInicial; i < V2.length && indiceV1 < V1.length; i++) {
            V2[i] = V1[indiceV1];
            indiceV1++;
        }
    }
}
