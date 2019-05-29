public class TesteVariaveis {

    public static void main(String[] args) {

        if (3<2){
            System.out.println("3 é maior que 2");
        } else {
            System.out.println("3 é menor que 2");
        }

        for (int i = 0; i<=10;i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.print(j + " ");
            }
            System.out.println(i);
        }
    }
}
