package primeiros_exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ArrayDe9 {

    public static void main(String[] args) {

        int[] lista = new int[4];
        Scanner leia = new Scanner(System.in);
        List<Integer> listaDePrimos = new ArrayList();
// loop para captar os valores da tela
        for (int i = 0; i < lista.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            lista[i] = leia.nextInt();

        }

// loop
        for (int j = 0; j < lista.length; j++) {

            boolean ehPrimo = true;
            for (int i = 2; i <lista[j] ; i++) {
                if (lista[j] % i == 0) {
                    ehPrimo =false;
                    break;
                }
            }

            if(ehPrimo){
                listaDePrimos.add(lista[j]);
            }

        }

        for (Integer numero : listaDePrimos) {
            System.out.print(numero+" ");
        }
    }
}
