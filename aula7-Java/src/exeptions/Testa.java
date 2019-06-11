package exeptions;

import exeptions.modelo.Pessoa;

public class Testa {

    public static void main(String[] args) {

        try {
            Pessoa pessoa = new Pessoa();
            //System.out.println(pessoa);
            pessoa.setIdade(23);

            if (pessoa.getIdade() >= 18){
                System.out.println("vc é maior de idade");
            }
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("caiu dentro do catch");
        }
        finally {
            System.out.println("continua...");
        }



    }
}
