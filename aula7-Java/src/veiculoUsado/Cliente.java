package veiculoUsado;


public class Cliente {
    private String nome, sobreNome;
    private int telContato;


    public Cliente(String nomeDoCliente, String sobrenomeDoCliente, int telefoneDeContato){
        this.nome= nomeDoCliente;
        this.sobreNome= sobrenomeDoCliente;
        this.telContato = telefoneDeContato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getTelContato() {
        return telContato;
    }

    public void setTelContato(int telContato) {
        this.telContato = telContato;
    }
}
