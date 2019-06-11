package empresa;

import empresa.model.Departamento;
import empresa.model.Empresa;
import empresa.model.Funcionario;

public class Main {
    public static void main(String[] args) {
        Departamento rh = new Departamento("recursos Humanos");
        Departamento financeiro = new Departamento("departamento do dindin");

        Funcionario fun1 = new Funcionario("Pablo","21/03/2019",1234.56);
        Funcionario fun2 = new Funcionario("Rebeca","21/02/2019",2234.56);
        Funcionario fun3 = new Funcionario("Giovana","21/03/2018",3234.56);


        Empresa pabloinc = new Empresa();


        pabloinc.adicionaDepartamento(rh);
        pabloinc.adicionaDepartamento(financeiro);

        rh.adicionaFuncionarios(fun1);
        rh.adicionaFuncionarios(fun2);
        financeiro.adicionaFuncionarios(fun3);

       rh.getFuncionariosDoDep();
       financeiro.getFuncionariosDoDep();

        pabloinc.getListaDepartamentos();

        rh.aumentarSalario();
        financeiro.aumentarSalario();

        rh.transferirFuncionario(fun1,financeiro);

        System.out.println("********");

        rh.getFuncionariosDoDep();
        financeiro.getFuncionariosDoDep();

    }
}
