package jogadoresTreinamento;

public class Exercicio2 {

    public static void main(String[] args) {
        JogadorDeFutebol jog1 = new JogadorDeFutebol("Pablo",14,10,0,5);
        JogadorDeFutebol jog2 = new JogadorDeFutebol("Jorge",10,14,1,10);

        SessaoDeTreinamento treino1 = new SessaoDeTreinamento(15);
        treino1.treinarA(jog1);
        jog1.getExperiencia();

        SessaoDeTreinamento treino2 = new SessaoDeTreinamento(20);
        treino2.treinarA(jog2);
        jog2.getExperiencia();
        System.out.println("");
        jog1.mostraEstatistica();
        System.out.println("");
        jog2.mostraEstatistica();
    }
}
