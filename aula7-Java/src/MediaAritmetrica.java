import java.util.Scanner;

public class MediaAritmetrica {

    public static void main(String[]args){

        System.out.println("Calcula a media");
        float n1, n2, n3, media;

        Scanner calculadorDeMedia = new Scanner(System.in);
        System.out.print("Digite um primeira nota: ");
        n1 = calculadorDeMedia.nextInt();

        System.out.print("Digite segunda nota: ");
        n2 = calculadorDeMedia.nextInt();

        System.out.print("Digite segunda nota: ");
        n3 = calculadorDeMedia.nextInt();

        media = (n1+n2+n3)/3;
        System.out.println("a media é "+media);

    }
}
