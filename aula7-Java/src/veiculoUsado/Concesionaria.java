package veiculoUsado;

public class Concesionaria {
    private Carro veiculos;
    private Cliente clientes;
    private Vendas vendas;

    public void registrarVenda(Carro carro, Cliente cliente, double valor){
        Vendas venda = new Vendas(valor, carro, cliente );

        System.out.println("Veiculo: "+ carro.getMarca()+" "+carro.getModelo()+" ano "
                +carro.getAnoFabricacao()+ ", da cor "+ carro.getCor() +
                "\n Vendido para: "+cliente.getNome()+" "+cliente.getSobreNome()+
                "\n Por: "+ venda.getValorDaVenda());
    }


}

