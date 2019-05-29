import java.util.Date;
import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        int a;
        boolean primo=true;
        Scanner valor = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        a = valor.nextInt();
        if (a <= 0) {
            System.out.println("Digito errado");
            System.out.print("digite um valor valido: ");
            a = valor.nextInt();
        }
        for (int i = 2; i <a; i++) {
            if (a % i == 0) {
               primo = false;
               break;
            }

        }

        if (primo==true){
            System.out.println("e primo");
        } else {
            System.out.println("nao e primo");
        }
    }
}
