package atletasProvas;

public class Prova {
    private int dificuldade, energiaNecessaria;

    public Prova(int dificuldade, int energiaNecessaria){
        this.dificuldade = dificuldade;
        this.energiaNecessaria = energiaNecessaria;
    }

    public boolean podeRealizar(Atleta atleta){
        if ((atleta.getEnergia()>=this.energiaNecessaria)&&(atleta.getNivel()>=this.dificuldade)){
            System.out.println("pode fazer");
            return true;
        } else {
            System.out.println("nao pode fazer");
            return false;
        }


    }
}
