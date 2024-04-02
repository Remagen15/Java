package metodos;

import java.util.Scanner;

public class forOne {

    public static byte indices(byte indices) {
        Scanner blur = new Scanner(System.in);

        indices = blur.nextByte();

        return indices;
    }
    
//------------------------------------------------------------------------------
    public static int[] encontrarRepetidos(int[] primerVector) {
        int[] segundoVector = new int[primerVector.length]; // Tamaño máximo del segundo vector
        int indice = 0; // Índice actual del segundo vector

        // Iterar sobre el primer vector
        for (int i = 0; i < primerVector.length; i++) {
            int contador = 0; // Contador para cada elemento del primer vector

            // Contar las ocurrencias del elemento actual en el primer vector
            for (int j = 0; j < primerVector.length; j++) {
                if (primerVector[j] == primerVector[i]) {
                    contador++;
                }
            }

            // Si el elemento se repite dos veces, agregarlo al segundo vector
            if (contador == 2) {
                // Verificar si el número ya está en el segundo vector para evitar duplicados
                boolean encontrado = false;
                for (int k = 0; k < indice; k++) {
                    if (segundoVector[k] == primerVector[i]) {
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    segundoVector[indice] = primerVector[i];
                    indice++;
                }
            }
        }

        // Crear un nuevo array con el tamaño exacto del segundo vector
        int[] resultado = new int[indice];
        System.arraycopy(segundoVector, 0, resultado, 0, indice);

        return resultado;
    }
//------------------------------------------------------------------------------
    
    public static String removeExtraS(String input) {
        StringBuilder result = new StringBuilder();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == 's') {
                count++;

                if (count <= 2) {
                    result.append(currentChar);
                }
            } else {

                for (int j = 0; j < count; j++) {
                    result.append('s');
                }

                count = 0;
                result.append(currentChar);
            }
        }

        for (int j = 0; j < count; j++) {
            result.append('s');
        }

        return result.toString();
    }
//------------------------------------------------------------------------------
    
    public static int[] obtenerPrimos(int[] vectorOriginal) {
        int cantidadPrimos = contarPrimos(vectorOriginal);
        int[] vectorPrimos = new int[cantidadPrimos];
        int indice = 0;
        for (int num : vectorOriginal) {
            if (esPrimo(num)) {
                vectorPrimos[indice] = num;
                indice++;
            }
        }
        return vectorPrimos;
    }

    public static int contarPrimos(int[] vectorOriginal) {
        int contador = 0;
        for (int num : vectorOriginal) {
            if (esPrimo(num)) {
                contador++;
            }
        }
        return contador;
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
//------------------------------------------------------------------------------
    
    public static int[] obtenerNumerosPerfectos(int[] vectorOriginal) {
        int contadorPerfectos = 0;
        for (int num : vectorOriginal) {
            if (esNumeroPerfecto(num)) {
                contadorPerfectos++;
            }
        }

        int[] vectorPerfectos = new int[contadorPerfectos];
        int indice = 0;
        for (int num : vectorOriginal) {
            if (esNumeroPerfecto(num)) {
                vectorPerfectos[indice] = num;
                indice++;
            }
        }

        return vectorPerfectos;
    }

    public static boolean esNumeroPerfecto(int num) {
        int sumaDivisores = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores == num;
    }
}
