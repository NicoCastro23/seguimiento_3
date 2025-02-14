package co.edu.uniquindio.poo;

//10
public class SumarDiagonal {

    public static int SumaDiagonal(int[][] matriz, int index) {
        if (index >= matriz.length) { // caso base
            return 0;
        }

        return matriz[index][index] + SumaDiagonal(matriz, index + 1);
    }

    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int resultado = SumaDiagonal(matriz, 0);
        System.out.println("La suma total de la diagonal es: " + resultado);
    }
}