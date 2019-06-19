package primeiros_exercicios;

public class SalarioAumentaProporcional {

    public static void main(String[] args) {
        double salario=1000, aumento = 0.015, salFinal=0;

        for (int ano = 1995; ano <= 2019; ano++){
            if (ano<=1997){
                salFinal= (salario*aumento) + salario;
                System.out.println("O salario no ano "+ano+ " ate 1997 e "+salFinal);
            } else{
                aumento=aumento*2;
                salFinal= (salario*aumento) + salario;
                System.out.println("O salario no ano "+ano+ " desde 1997 e "+salFinal+" aumento de "+ aumento*100+"%");

                }
            }



        System.out.println("o Salario em 2019 e " +salFinal+"R$");
    }



    }

