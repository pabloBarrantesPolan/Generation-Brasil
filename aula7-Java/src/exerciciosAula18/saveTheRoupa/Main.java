package exerciciosAula18.saveTheRoupa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main  {


    public static void main(String[] args) {

        List<Peca> listaDoPablo = new ArrayList<>();
        listaDoPablo.add(new Peca("nike", "curto" ));
        listaDoPablo.add(new Peca("adidas", "novo" ));
        listaDoPablo.add(new Peca("seiLa", "brecho" ));


        Map<Integer, List<Peca>> listaPecas = new HashMap<>();
        listaPecas.put(1, listaDoPablo);
        GuardaVolumes guardaVolumes = new GuardaVolumes(1,listaPecas);


        guardaVolumes.mostrarPecas();



    }
}
