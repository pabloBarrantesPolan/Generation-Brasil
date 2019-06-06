package bancoSantander;

import bancoSantander.model.Cheque;
import bancoSantander.model.Cliente;
import bancoSantander.model.ContaCorrente;
import bancoSantander.model.ContaPoupanca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente cl1 = new Cliente("Pablo","Barrantes", "1234-4", "123483/23");
        ContaPoupanca cp = new ContaPoupanca(cl1, 0.1);

        Cliente cl2 = new Cliente("Jorge","Ferreira", "1254-4", "123283/26");
        ContaCorrente cc = new ContaCorrente(cl2,500);

        Cheque cheque = new Cheque();
        Scanner leia = new Scanner(System.in);

        cp.deposita();
        cp.consultaSaldo();

        cp.saque();
        cp.consultaSaldo();
        cp.recolheJuros();
        cp.consultaSaldo();


        cc.deposita();
        cc.consultaSaldo();
        cc.saque();


        System.out.print("digite o valor do cheque: ");
         double valorCheque= leia.nextDouble();
        cheque.setValor(valorCheque);
        System.out.print("digite o banco Emisor do cheque: ");
        String bancoCheque= leia.next();
        cheque.setBancoEmisor(bancoCheque);
        System.out.print("digite a data de pagamento do cheque: ");
        String dataCheque = leia.next();
        cheque.setDataPagamento(dataCheque);

        cc.depositaCheque(cheque);

        cc.consultaSaldo();

    }
}
