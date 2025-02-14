package co.edu.uniquindio.poo;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

//4
public class InvertirLista {
    public static void invertirLista(List<Integer> lista, int inicio, int fin) {
        if (inicio >= fin) {// caso base
            return;
        }
        int ultimo = lista.get(inicio);
        lista.set(inicio, lista.get(fin));
        lista.set(fin, ultimo);
        invertirLista(lista, inicio + 1, fin - 1);
    }

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Lista original: " + numeros);
        invertirLista(numeros, 0, numeros.size() - 1);
        System.out.println("Lista invertida: " + numeros);
    }
}