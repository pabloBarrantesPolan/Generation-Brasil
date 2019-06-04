package veiculoUsado;

public class Vendas {
    private double valorDaVenda;
    private Carro veiculoVendido;
    private Cliente comprador;


    public Vendas(double valordaVendaDoCarro, Carro carro,Cliente cliente){
        this.valorDaVenda = valordaVendaDoCarro;
        this.veiculoVendido= carro;
        this.comprador = cliente;

    }

    public double getValorDaVenda() {
        return valorDaVenda;
    }

    public void setValorDaVenda(double valorDaVenda) {
        this.valorDaVenda = valorDaVenda;
    }

    public Carro getVeiculoVendido() {
        return veiculoVendido;
    }

    public void setVeiculoVendido(Carro veiculoVendido) {
        this.veiculoVendido = veiculoVendido;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }
}
