package exerciciosAula18;

import java.util.HashSet;
import java.util.Set;

public class Prova {

    public static void somaTotal(Set<Integer> conjuntoDeInteiros) {
        int soma = 0;
        for (Integer numero : conjuntoDeInteiros) {
            System.out.print(numero+" ");
             soma  += numero;
        }
        System.out.println("\n a soma é: " + soma);
    }


    public static void main(String[] args) {
        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(11);
        conjunto.add(4);
        conjunto.add(6);
        conjunto.add(8);
        conjunto.add(1);


        somaTotal(conjunto);

    }
}