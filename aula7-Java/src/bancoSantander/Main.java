package bancoSantander;

import bancoSantander.model.Cheque;
import bancoSantander.model.Cliente;
import bancoSantander.model.ContaCorrente;
import bancoSantander.model.ContaPoupanca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente cl1 = new Cliente("Pablo","Barrantes", "1234-4", "123483/23");
        ContaPoupanca cp = new ContaPoupanca(cl1);

        Cliente cl2 = new Cliente("Jorge","Ferreira", "1254-4", "123283/26");
        ContaCorrente cc = new ContaCorrente(cl2,500);

        Cheque cheque = new Cheque();
        Scanner leia = new Scanner(System.in);
        /*
        System.out.print("Que valor deseja depositar? ");
        double valorDeposito = leia.nextDouble();
        cp.deposita(valorDeposito);
        cp.consultaSaldo();

        System.out.print("Que valor deseja sacar? ");
        double valorSaque = leia.nextDouble();
        cp.saque(valorSaque);
        cp.consultaSaldo();
        cp.recolheJuros();
        System.out.println("Taxa de: " + cp.getTaxaJuros() + " calculando juros...");
        cp.consultaSaldo();

        System.out.print("Que valor deseja depositar? ");
        double valorDepositoCC = leia.nextDouble();
        cc.deposita(valorDepositoCC);
        cc.consultaSaldo();
        System.out.print("Que valor deseja sacar? ");
        double valorSaquecc = leia.nextDouble();
        cc.saque(valorSaquecc);


        System.out.print("digite o valor do cheque: ");
         double valorCheque= leia.nextDouble();
        cheque.setValor(valorCheque);
        System.out.print("digite o banco Emisor do cheque: ");
        String bancoCheque= leia.next();
        cheque.setBancoEmisor(bancoCheque);
        System.out.print("digite a data de pagamento do cheque: ");
        String dataCheque = leia.next();
        cheque.setDataPagamento(dataCheque);
        System.out.print("Que valor deseja sacar? ");
        double valor = leia.nextDouble();
        cc.deposita(cheque);

        cc.consultaSaldo();
        */

        cc.deposita(500);
        cc.saque(600);
        System.out.println(cc.consultaSaldo());
        System.out.println(cc.getChequeEspecial());
    }
}
