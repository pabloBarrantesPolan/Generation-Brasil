package bancoSantander.model;

public class Cheque {
    protected double valor;
    protected String bancoEmisor,dataPagamento;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setBancoEmisor(String bancoEmisor) {
        this.bancoEmisor = bancoEmisor;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
