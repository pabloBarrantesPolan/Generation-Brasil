package bancoSantander.model;


public class ContaCorrente extends Conta{

    private double chequeEspecial;

    public ContaCorrente( Cliente cliente, double chequeEspecial) {
        super( cliente);
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public double deposita(Cheque cheque){
        this.saldo += cheque.valor;
        return saldo;
    }

    @Override
    public double saque(double valor) {

        if (saldo< valor){
            chequeEspecial -= (valor-saldo);
            saldo =0;
        } else if (saldo>= valor){
            saldo-= valor;
        } else if(saldo+chequeEspecial< valor) {
            }
            return super.saldo;
        }

}
