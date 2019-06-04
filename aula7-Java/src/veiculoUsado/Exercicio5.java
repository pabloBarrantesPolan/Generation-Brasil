package veiculoUsado;

public class Exercicio5 {

    public static void main(String[] args) {
        Concesionaria minha = new Concesionaria();
        Carro carro1 = new Carro("Chevrolet","Onix",
                "preto",2015,25000.56);
        Cliente cliente1 = new Cliente("Pablo","Barrantes",
                98773225);
        minha.registrarVenda(carro1,cliente1,15000);
    }
}
