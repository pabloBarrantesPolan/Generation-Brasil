package exercicioHierarquia;


import exeptions.ExerciciosExceptions;

public abstract class Quadrilatero implements CalculadoraForma {
    private Integer noLados = 4;
    private Integer[] lados = new Integer[4];

    public Quadrilatero(Integer ladoa, Integer ladob, Integer ladoc, Integer ladod) {
        this.lados[0] = ladoa;
        this.lados[1] = ladob;
        this.lados[2] = ladoc;
        this.lados[3] = ladod;
    }
}
