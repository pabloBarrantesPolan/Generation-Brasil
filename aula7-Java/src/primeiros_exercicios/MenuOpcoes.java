package primeiros_exercicios;

import java.util.Scanner;

public class MenuOpcoes {
    public static void main(String[] args) {
        Scanner seletor = new Scanner(System.in);
        int opcao;
        double salario, aumentoSalario,remunerado;

        boolean ehOpcao;

        do {
                System.out.println("Menu de Opçoes");
                System.out.println("--------------");
                System.out.println("1. Imposto");
                System.out.println("2. Novo Salario");
                System.out.println("3. Classificação");
                System.out.println("4. Finalizar Programa");
                System.out.println("--------------");
                System.out.print("Digite a opção: ");
                opcao = seletor.nextInt();
                if ((opcao<=4) && (opcao>=1)){
                    ehOpcao=true;
                 }else {
                    ehOpcao=false;
                    System.out.println("\n");
                    System.out.println("Opção inválida");
                    System.out.println("\n");
                }
        }

         while (!ehOpcao);

            if (opcao == 1) {
                System.out.println("Cálculo valor do imposto");
                System.out.println("Qual e seu salario?");
                salario = seletor.nextDouble();

                if ((salario <= 500)) {
                    System.out.println("o valor do imposto é: " + salario * 0.05);
                } else if ((salario >= 500.01) && (salario <= 850)) {
                    System.out.println("o valor do imposto é: " + salario * 0.1);
                } else {
                    System.out.println("o valor do imposto é: " + salario * 0.15);
                }
                System.out.println("fim programa");

            }
                else  if (opcao == 2){
                        System.out.println("Cálculo de aumento de salario");
                        System.out.println("Qual e seu salario?");
                        aumentoSalario = seletor.nextDouble();
                        if (aumentoSalario>1500){
                            System.out.println("o novo valor do salario é: " + aumentoSalario +25+"RS");
                        } else if ((aumentoSalario<=1500.)&&(aumentoSalario>=750)){
                            System.out.println("o novo valor do salario é: " + aumentoSalario +50+"RS");
                        } else if ((aumentoSalario<750)&&(aumentoSalario>=450)){
                            System.out.println("o novo valor do salario é: " + aumentoSalario +75+"RS");
                        } else {
                            System.out.println("o novo valor do salario é: " + aumentoSalario +100+"RS");
                        }
                    }
                else if (opcao == 3){
                        System.out.println("Sua remuneraçao é adequada?");
                    System.out.println("Qual e seu salario?");
                    remunerado = seletor.nextDouble();
                        if (remunerado>=750){
                            System.out.println("Voce esta bem remunerado");
                        } else {
                            System.out.println("Voce  NAO esta bem remunerado");
                        }
                    }
                else if (opcao == 4){
                        System.out.println("fim programa");
                    }

        }
    }


