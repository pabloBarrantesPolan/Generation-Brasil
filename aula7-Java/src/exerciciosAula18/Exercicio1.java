package exerciciosAula18;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.Map;

public class Exercicio1 {


    public static void main(String[] args) {

        Map<Integer, String> dicionario = new  HashMap<>();
        dicionario.put(0,"Ovos");
        dicionario.put(1,"Água");
        dicionario.put(2,"Escopeta");
        dicionario.put(3,"Cavalo");

        for (Integer numero: dicionario.keySet()) {
            System.out.println(dicionario.get(numero));
        }


        Map<String, List<String>> apelidos = new HashMap<>();

        List<String> joao = new ArrayList<>();
        joao.add("Juan");
        joao.add("Fissura");
        joao.add("Maromba");

        List<String> miguel = new ArrayList<>();
        miguel.add("Night Watch");
        miguel.add("Bruce Wayne");
        miguel.add("Tampinha");

        List<String> maria = new ArrayList<>();
        maria.add("Wonder Woman");
        maria.add("Mary");
        maria.add("Marilene");

        List<String> lucas = new ArrayList<>();
        lucas.add("Lukinha");
        lucas.add("Jorge");
        lucas.add("george");

        apelidos.put("João", joao);
        apelidos.put("Miguel", miguel);
        apelidos.put("Maria", maria);
        apelidos.put("Lucas", lucas);



       for (String apelido: apelidos.keySet()) {
            System.out.println(apelidos.get(apelido));
        }

        Map<String, ArrayList<String>> nomesApelidos = new HashMap<>();

       nomesApelidos.put("João", new ArrayList<>());
       nomesApelidos.get("João").add("Juan");
       nomesApelidos.get("João").add("Fissura");
       nomesApelidos.get("João").add("Maromba");

       nomesApelidos.put("Miguel", new ArrayList<>());
       nomesApelidos.get("Miguel").add("Night Watch");
       nomesApelidos.get("Miguel").add("Bruce Wayne");
       nomesApelidos.get("Miguel").add("Tampinha");

       nomesApelidos.put("Maria", new ArrayList<>());
       nomesApelidos.get("Maria").add("Wonder Woman");
       nomesApelidos.get("Maria").add("Mary");
       nomesApelidos.get("Maria").add("Marilene");

       nomesApelidos.put("Lucas", new ArrayList<>());
       nomesApelidos.get("Lucas").add("Lukinha");
       nomesApelidos.get("Lucas").add("Jorge");
       nomesApelidos.get("Lucas").add("george");

        for (String apelido: nomesApelidos.keySet()) {
            System.out.println(apelidos.get(apelido));
        }
    }
}
