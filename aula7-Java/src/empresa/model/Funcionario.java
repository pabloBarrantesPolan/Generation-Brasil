package empresa.model;

public class Funcionario {
    private String nome, dataAdmissao;
    private Double salario;

    public Funcionario(String nome, String dataAdmissao, Double salario) {
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
