package bancoSantander.model;

public class Cliente {
    private Integer idCliente;
    private String nome, sobrenome, rg, cpf;

    public Cliente(String nome, String sobrenome, String rg, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.cpf = cpf;
    }
}
