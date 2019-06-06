package bancoSantander.model;

import java.util.Scanner;

public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca( Cliente cliente,  double taxaJuros) {
        super(cliente);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void saque() {
        System.out.print("Que valor deseja sacar? ");
        double valor = leia.nextDouble();
        if(valor>saldo){
            System.out.println("Você não tem saldo suficiente");
        } else {
            this.saldo -= valor;
        }
    }

    public void recolheJuros(){
       double juros = saldo * this.taxaJuros;
       this.saldo += juros;
        System.out.println("calculando juros...");
    }
}
