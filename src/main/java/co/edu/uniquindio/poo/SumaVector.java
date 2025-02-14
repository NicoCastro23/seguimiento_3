package co.edu.uniquindio.poo;

//8
public class SumaVector {
    public static int sumaVector(int[] vector, int index) {
        if (index >= vector.length) { // caso base
            return 0;
        }
        return vector[index] + sumaVector(vector, index + 1);
    }

    public static void main(String[] args) {
        int[] vector = { 1, 2, 3, 4, 5 };
        int resultado = sumaVector(vector, 0);
        System.out.println("La suma total del vector es: " + resultado);
    }
}