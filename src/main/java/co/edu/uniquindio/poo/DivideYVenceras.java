package co.edu.uniquindio.poo;

//7
public class DivideYVenceras {

    public static int suma(int[] arr, int inicio, int fin) {
        // Caso base: si el inicio y el fin son el mismo índice, retornar el elemento
        if (inicio == fin) {// caso base
            return arr[inicio];
        }

        // Calcular el punto medio
        int medio = (inicio + fin) / 2;

        // Dividir el problema en dos partes y sumar sus resultados
        int sumaIzquierda = suma(arr, inicio, medio);
        int sumaDerecha = suma(arr, medio + 1, fin);

        // Combinar los resultados
        return Math.max(sumaIzquierda, sumaDerecha);
    }

    public static void main(String[] args) {
        int[] arreglo = { 3, 1, 5, 2, 4, 6 };
        int resultado = suma(arreglo, 0, arreglo.length - 1);
        System.out.println("Numero maximo: " + resultado);
    }
}