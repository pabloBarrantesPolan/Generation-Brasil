package primeiros_exercicios;

import java.util.Scanner;

public class Soma {



    public static void main(String[] args){



        int num1, num2, num3, num4, soma;
        Scanner somador = new Scanner(System.in);
        System.out.print("digite o primer valor: ");
        num1 = somador.nextInt();
        System.out.print("digite o segundo valor: ");
        num2 = somador.nextInt();
        System.out.print("digite o tercer valor: ");
        num3 = somador.nextInt();
        System.out.print("digite o quarto valor: ");
        num4 = somador.nextInt();
        soma = num1 + num2 + num3 + num4;
        System.out.println("o resultado de "+ num1+ " + "+ num2 + " + "+ num3 + " + "+ num4 +" = "+ soma );





    }
}
