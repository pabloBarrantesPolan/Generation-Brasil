package clientesContas;

public class Conta {
   public int numeroConta;
    private double saldo;
    private Cliente titular;


    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void mostraSaldo() {
        System.out.println("Saldo atual: "+saldo+" R$");
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor){
        this.saldo = saldo+valor;
    }

    public void sacar(double valor){
        if (valor<=saldo){
            this.saldo = saldo-valor;
            System.out.println("saque de "+ valor+"R$ "+ "Saldo atual: "+saldo+" R$" );
        } else{
            System.out.println("Saldo Insuficiente");
        }
    }
}
