package co.edu.uniquindio.poo;

//9
public class SumarMatriz {

    public static int SumaMatriz(int[][] matriz, int fila, int col) {
        if (fila >= matriz.length) {// caso base
            return 0;
        }
        if (col >= matriz[fila].length) {// caso base
            return SumaMatriz(matriz, fila + 1, 0);

        }
        return matriz[fila][col] + SumaMatriz(matriz, fila, col + 1);
    }

    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int resultado = SumaMatriz(matriz, 0, 0);
        System.out.println("La suma total de la matriz es: " + resultado);
    }
}