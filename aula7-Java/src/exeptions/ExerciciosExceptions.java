package exeptions;

import java.util.ArrayList;
import java.util.List;

public class ExerciciosExceptions {
    public static void main(String[] args) {

        //Exercicio 1
        try {
            List<String > list = new ArrayList<>();
            list.add("Pato");
            list.add("Cachorro");
            list.add("Gato");

            System.out.println(list.get(3));
        }
        catch (IndexOutOfBoundsException e){
           // e.printStackTrace();
            System.out.println("não existe esse index");
        }

        /// exercicio 2
        try {
            ArrayList<String> list2 = new ArrayList<>();

            list2.add("pato");
            list2.add("cachorro");
            list2.add("gato");

            System.out.println(list2.get(5));
        } catch (NullPointerException e){
            System.out.println("a lista e nula");
        } catch (IndexOutOfBoundsException e){
            System.out.println("não existe esse index");
        }


        // Exercicio 3

        try {
            CalculoMatematico calcula = new CalculoMatematico();
            calcula.dividir(4,0);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }



    }

    public static class CalculoMatematico {

        public Integer dividir(Integer dividendo, Integer divisor) throws ArithmeticException {

            if (divisor == 0){
                throw new ArithmeticException("o divisor não pode ser 0");
            }

            try {
                Integer resultado = dividendo/divisor;
            } catch (ArithmeticException e){
                System.out.println("não pode dividir por 0");
            }
            return 0;
        }
    }
}
