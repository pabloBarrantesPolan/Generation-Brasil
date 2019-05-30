import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {
        double b=0,h=0, area;
        Scanner leia = new Scanner(System.in);



        while((b<=0)||(h<=0)){
            System.out.print("Qual a base: ");
            b= leia.nextDouble();
            System.out.print("Qual a Altura: ");
            h= leia.nextDouble();
            if (b<=0){
                System.out.println("a base nao pode ser menor que 0");
            }
            if (h<=0){
                System.out.println("a altura nao pode ser menor que 0");
            }
        }

        area =(b*h)/2;
        System.out.println("a area equivale a "+area);
    }
}
