package tripe;

public class Tripe {
    boolean dobrado;
    int alturaMin, alturaMax, alturaAt;


    public void definirAltura(Integer novaAltura){
        this.alturaAt = novaAltura;
    }

    public void dobrar(){
        if (!dobrado){
            alturaMin=alturaAt;
            dobrado = true;
        } else {
            System.out.println("O tripé ja esta dobrado");
        }
    }

    public void desdobrar(){
        if (dobrado){
            alturaMax=alturaAt;
            dobrado=false;
        } else {
            System.out.println("o tripé ja esta estendido");
        }
    }

    public void guardar(){
        if (dobrado && alturaAt==alturaMin){
            System.out.println("pode guardar");
        }
    }

    public void prontoParaGuardar(){
        dobrar();
        guardar();
        System.out.println("Tripé guardado");
    }
    public void prontoParaUsar(){
        desdobrar();
        System.out.println("tripé pronto para o uso");
    }
}

