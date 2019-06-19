package primeiros_exercicios;

import java.util.Scanner;

public class NotasPonderadas {

    public static void main(String[]args){

        float nota1,nota2, nota3, resultado;
        int peso1, peso2, peso3;

        Scanner calculadorNotasPonderadas = new Scanner(System.in);
        System.out.print("Qual é a primeira nota: ");
        nota1 = calculadorNotasPonderadas.nextFloat();
        System.out.print("Qual seu peso: ");
        peso1 = calculadorNotasPonderadas.nextInt();

        System.out.print("Qual é a segunda nota: ");
        nota2 = calculadorNotasPonderadas.nextFloat();
        System.out.print("Qual seu peso: ");
        peso2 = calculadorNotasPonderadas.nextInt();

        System.out.print("Qual é a terceira nota: ");
        nota3 = calculadorNotasPonderadas.nextFloat();
        System.out.print("Qual seu peso: ");
        peso3 = calculadorNotasPonderadas.nextInt();

        resultado = (nota1*peso1 + nota2*peso2 + nota3*peso3) /(peso1+peso2+peso3);

        System.out.println("A media ponderada é: "+ resultado);

    }
}
