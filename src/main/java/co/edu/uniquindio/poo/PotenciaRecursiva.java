package co.edu.uniquindio.poo;

//11
public class PotenciaRecursiva {
    public static int potenciaRecursiva(int base, int exponente) {
        if (exponente == 0) { // Caso base: si el exponente es 0, retornar 1
            return 1;
        }
        if (exponente == 1) { // Caso base: si el exponente es 1, retornar el base
            return base;
        }
        return base * potenciaRecursiva(base, exponente - 1);
    }

    public static void main(String[] args) {
        int base = 2;
        int exponente = 3;
        int resultado = potenciaRecursiva(base, exponente);
        System.out.println("La potencia de " + base + " elevada a " + exponente + " es: " + resultado);
    }
}