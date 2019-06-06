package bancoSantander.model;

import java.util.Scanner;

public abstract class Conta {

    Scanner leia = new Scanner(System.in);

    Cliente cliente;
    protected double saldo;

    public Conta( Cliente cliente) {

        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void deposita(){
        System.out.print("Que valor deseja depositar? ");
        double valor = leia.nextDouble();
        this.saldo += valor;
        System.out.println(" ");
    }

    public  void saque(){

    }

    public double consultaSaldo(){
        System.out.println("seu saldo é: " + this.saldo + " R$");
        return saldo;
    }

}
