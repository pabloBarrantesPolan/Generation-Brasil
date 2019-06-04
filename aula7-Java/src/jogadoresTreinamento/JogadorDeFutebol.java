package jogadoresTreinamento;

public class JogadorDeFutebol {
   private String nome;
    private int energia,alegria,gols, experiencia;

    public JogadorDeFutebol(String nome,int energia, int alegria, int gols, int experiencia){
        this.nome = nome;
        this.energia = energia;
        this.alegria = alegria;
        this.gols = gols;
        this.experiencia = experiencia;
    }

    public String getNome() {
        return nome;
    }

    public int getEnergia() {
        return energia;
    }

    public int getAlegria() {
        return alegria;
    }

    public int getGols() {
        return gols;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int setExperiencia(int experiencia) {
        this.experiencia += experiencia;
        return experiencia;
    }

    public void fazerGol(){
        this.energia = energia-5;
        this.alegria = alegria+10;
        this.gols = gols+1;
        System.out.println("GOOOL");
    }

    public void Correr(){
        this.energia = energia-10;
        System.out.println("cansei!!!");
    }

    public void mostraEstatistica(){
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Energia: "+ this.getEnergia());
        System.out.println("Alegria: "+ this.getAlegria());
        System.out.println("Gols: "+ this.getGols());
        System.out.println("Experiência: "+ this.getExperiencia());
    }

}
