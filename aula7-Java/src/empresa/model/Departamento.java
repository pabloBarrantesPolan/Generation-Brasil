package empresa.model;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String  nomeDoDep;
    private List<Funcionario> funcionariosDoDep = new ArrayList<>();

    public Departamento(String nomeDoDep) {
        this.nomeDoDep = nomeDoDep;
    }

    public void adicionaFuncionarios(Funcionario funcionario){
        funcionariosDoDep.add(funcionario);
    }

    public void getFuncionariosDoDep() {
        for (Funcionario funcionario : funcionariosDoDep) {
            System.out.println("Nome: "+funcionario.getNome()+ " Contratado em "+ funcionario.getDataAdmissao()+
            "\n salario de: "+ funcionario.getSalario()+" R$");
        }
    }

    public String getNomeDoDep() {
        return this.nomeDoDep;
    }

    public void aumentarSalario( ){

            for (Funcionario fun: funcionariosDoDep) {
                fun.setSalario(fun.getSalario() + fun.getSalario() * 0.1);
                System.out.println("Salario do "+ fun.getNome()+ " aumentou para "+ fun.getSalario()+" R$");
            }
        }

     public void transferirFuncionario(Funcionario funcionario, Departamento departamento){
        departamento.funcionariosDoDep.add(funcionario);
        this.funcionariosDoDep.remove(funcionario);
     }
}
