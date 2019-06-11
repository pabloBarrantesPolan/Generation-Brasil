package empresa.model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nomeEmpresa, cnpj;
    private List<Departamento> listaDepartamentos = new ArrayList<>();

    public  void  adicionaDepartamento(Departamento departamento){
        this.listaDepartamentos.add(departamento);

    }

    public void getListaDepartamentos() {
        for (Departamento departamento: listaDepartamentos) {
            System.out.println("Departamento " + departamento.getNomeDoDep());
        }
    }

}
