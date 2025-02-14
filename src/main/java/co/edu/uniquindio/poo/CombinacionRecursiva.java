package co.edu.uniquindio.poo;

//6
public class CombinacionRecursiva {
    /**
     * Calcula el coeficiente binomial C(n, k) de forma recursiva.
     * La fórmula utilizada es:
     * C(n, k) = C(n-1, k) + C(n-1, k-1)
     * con los casos base:
     * C(n, k) = 1 si k == 0 o k == n
     * C(n, k) = 0 si k > n
     *
     * @param n Número total de elementos.
     * @param k Número de elementos a elegir.
     * @return El número de combinaciones posibles.
     */
    public static int combinacionRecursiva(int n, int k) {
        if (k > n) {
            return 0;
        }
        if (k == 0 || k == n) {
            return 1;
        }
        return combinacionRecursiva(n - 1, k) + combinacionRecursiva(n - 1, k - 1);
    }

    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        int resultado = combinacionRecursiva(n, k);
        System.out.println("C(" + n + ", " + k + ") = " + resultado);
    }

}