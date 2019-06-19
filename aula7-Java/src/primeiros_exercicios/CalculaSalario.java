package primeiros_exercicios;

import java.util.Scanner;

public class CalculaSalario {
    public static void main(String[] args) {
        double salario, salFinal;
        Scanner Calculadora = new Scanner(System.in);
        System.out.println("qual é seu salario: ");
        salario= Calculadora.nextDouble();

        salFinal =salario-((salario*1.7)-(salario*1.5));
        System.out.println(salFinal);

    }
}
