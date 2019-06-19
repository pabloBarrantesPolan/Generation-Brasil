package primeiros_exercicios;

import java.util.Scanner;

public class MostraValores {

    public static void main(String[] args) {
        /*
        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        */
        int a, b;
        Scanner leValor = new Scanner(System.in);
        System.out.print("digite o valor inicial: ");
        a = leValor.nextInt();
        System.out.print("digite o valor final: ");
        b = leValor.nextInt();
        if (a % 2 == 0) {
            for (int i = a; i <= b; i +=2){
                System.out.println(i);
            }
        } else if (a%2 != 0){
            for (int i = a+1; i <= b; i +=2){
                System.out.println(i);
            }
        }
    }
}
