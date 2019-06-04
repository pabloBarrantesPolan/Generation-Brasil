package atletasProvas;

public class Atleta {
    private String nome;
    private int nivel, energia;

    public Atleta(String nome, int nivel, int energia){
        this.nome = nome;
        this.nivel = nivel;
        this.energia = energia;
    }

    public int getEnergia() {
        return energia;
    }

    public int getNivel() {
        return nivel;
    }
}
