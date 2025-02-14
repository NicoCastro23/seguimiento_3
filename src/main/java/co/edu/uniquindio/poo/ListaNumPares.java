package co.edu.uniquindio.poo;

import java.util.List;
import java.util.ArrayList;

//5
public class ListaNumPares {
    public static List<Integer> listaNumPares(List<Integer> lista, int index) {
        if (index >= lista.size()) {// caso base
            return new ArrayList<>();
        }
        List<Integer> resultado = listaNumPares(lista, index + 1);
        if (lista.get(index) % 2 == 0) {
            resultado.add(lista.get(index));
        }
        return resultado;
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> resultado = listaNumPares(numeros, 0);
        System.out.println("Lista de números pares: " + numeros);
        System.out.println("Lista de números pares: " + resultado);
    }

}