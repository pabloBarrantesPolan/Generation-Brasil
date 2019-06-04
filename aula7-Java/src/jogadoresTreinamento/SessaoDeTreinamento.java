package jogadoresTreinamento;


public class SessaoDeTreinamento {

    int experiencia;

    public  SessaoDeTreinamento(int experiencia){
        this.experiencia = experiencia;
    }


    public void treinarA( JogadorDeFutebol jogador){
        System.out.println("Experiencia inicial "+jogador.getExperiencia());
        jogador.Correr();
        jogador.fazerGol();
        jogador.Correr();
        jogador.setExperiencia(this.experiencia);
        System.out.println("Experiencia depois do treino "+jogador.getExperiencia());
    }

}

