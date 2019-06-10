package exerciciosAula18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercicio2 {

    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(1);
        listaNumeros.add(5);
        listaNumeros.add(5);
        listaNumeros.add(6);
        listaNumeros.add(7);
        listaNumeros.add(8);
        listaNumeros.add(8);
        listaNumeros.add(8);

        for (Integer numero: listaNumeros) {
            System.out.println(numero);
        }

        Set<Integer> conjuntoNumeros = new HashSet<>();
        conjuntoNumeros.add(1);
        conjuntoNumeros.add(5);
        conjuntoNumeros.add(5);
        conjuntoNumeros.add(6);
        conjuntoNumeros.add(7);
        conjuntoNumeros.add(8);
        conjuntoNumeros.add(8);
        conjuntoNumeros.add(8);

        for (Integer numero: conjuntoNumeros) {
            System.out.println(numero.toString());
        }

    }
}
