package bancoSantander.model;


public abstract class Conta {

    private Cliente cliente;
    protected double saldo;

    public Conta( Cliente cliente) {

        this.cliente = cliente;
        this.saldo = saldo;
    }

    public double deposita(double valor){
        saldo += valor;
        return saldo;
    }

    public abstract double saque(double valor);

    public double consultaSaldo(){
        System.out.println("seu saldo é: " + this.saldo + " R$");
        return saldo;
    }

}
