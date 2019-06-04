package clientesContas;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Pablo", "Barrantes");

        Cliente cliente2 = new Cliente("Julio", "Silva");

        Scanner leia = new Scanner(System.in);
        double deposito;
        double saque;
        Conta conta1 = new Conta();
        conta1.setTitular(cliente1);
        conta1.setNumeroConta(123);
        System.out.println("Indique o valor a depositar:");
        deposito= leia.nextDouble();
        conta1.depositar(deposito);
        conta1.mostraSaldo();

        System.out.println("Indique o valor a sacar:");
        saque= leia.nextDouble();
        conta1.sacar(saque);
        conta1.mostraSaldo();

        Conta conta2 = new Conta();
        conta2.setTitular(cliente2);
        conta2.setNumeroConta(456);

        System.out.println("Indique o valor a depositar:");
        deposito= leia.nextDouble();
        conta2.depositar(deposito);
        conta2.mostraSaldo();

        System.out.println("Indique o valor a sacar:");
        saque= leia.nextDouble();
        conta2.sacar(saque);
        conta2.mostraSaldo();



    }
}
