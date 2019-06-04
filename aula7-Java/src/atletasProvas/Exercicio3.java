package atletasProvas;

public class Exercicio3 {
    public static void main(String[] args) {
        Atleta atl1 = new Atleta("Pablo", 3, 10);
        Atleta atl2 = new Atleta("João", 4, 15);

        Prova prova1 = new Prova(4,5);
        prova1.podeRealizar(atl1);
        prova1.podeRealizar(atl2);
    }
}
