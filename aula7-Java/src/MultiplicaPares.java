public class MultiplicaPares {

    public static void main(String[] args) {
        int novoI=0;
        for (int i = 0; i <=50 ; i+=2) {
            System.out.print(i+" ");
            novoI=novoI+i;
            System.out.println("total: "+novoI);;
        }

        System.out.println(novoI);
    }
}
