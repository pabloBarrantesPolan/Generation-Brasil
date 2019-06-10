package exerciciosAula18.saveTheRoupa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolumes {
    private Integer  contador=0;
    private  Map<Integer, List<Peca>> dicionario;

    public GuardaVolumes(Integer contador, Map<Integer, List<Peca>> dicionario) {
        this.contador = contador;
        this.dicionario = dicionario;
    }

    public  Integer guardarPecas(List<Peca> listaDePeca){
        this.dicionario.put(contador, listaDePeca);
        return contador++;
    }

    public  void mostrarPecas(){
        for (Integer item: this.dicionario.keySet()) {
            System.out.println("Item: "+ item+ " Lista de peças "
                    +this.dicionario.get(item));
        }
    }

    public void mostraPecas(Integer numero){

        for (Integer item: this.dicionario.keySet()) {
            if (numero == item){
            System.out.println("Item: "+ item+ " Lista de peças "
                    +this.dicionario.get(item));
            }
        }
    }

    public  void devolverPecas(Integer numero){
       this.dicionario.remove(numero);
    }
}
