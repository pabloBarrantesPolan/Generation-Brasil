import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int numero, valor=1;
        Scanner leiaNumero = new Scanner(System.in);
        System.out.print("digite um numero: ");
        numero= leiaNumero.nextInt();

        for (int i = 1; i <= numero ; i++) {

           valor *=i;
        }

        System.out.println("O valor de "+numero+"! é "+ valor);
    }
}
