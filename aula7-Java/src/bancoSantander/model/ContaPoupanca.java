package bancoSantander.model;


public class ContaPoupanca extends Conta {
    private final static double taxaJuros = 0.1;

    public ContaPoupanca( Cliente cliente) {
        super(cliente);
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    @Override
    public double saque(double valor) {
        this.saldo -= valor;
        return this.saldo;
    }

    public double recolheJuros(){
       double juros = saldo * this.taxaJuros;
        return this.saldo += juros;
    }
}
