package bancoSantander.model;

import java.util.Scanner;

public class ContaCorrente extends Conta{

    private double chequeEspecial;

    public ContaCorrente( Cliente cliente, double chequeEspecial) {
        super( cliente);
        this.chequeEspecial = chequeEspecial;
    }

    public void depositaCheque(Cheque cheque){

        this.saldo += cheque.valor;
        System.out.println("o cheque com valor de: "+ cheque.valor + " emitido pelo banco " + cheque.bancoEmisor
                + ", com data de pagamento: " + cheque.dataPagamento + ".\n Foi depositado na sua conta");

    }

    @Override
    public void saque() {
        System.out.print("Que valor deseja sacar? ");
        double valor = leia.nextDouble();
        if (saldo< valor){
            saldo+= chequeEspecial;
            saldo-= valor;
            System.out.println("uso do cheque especial.");
        }
        if (saldo>= valor){
            saldo-= valor;
            System.out.println("saque aceito");
        } else {
            System.out.println("saldo mais cheque insuficientes");
        }
    }
}
