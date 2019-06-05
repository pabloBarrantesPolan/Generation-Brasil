package tripe;

public class Tripe {
    private boolean dobrado;
    private int alturaMin, alturaMax, alturaAt;


    public void definirAltura(Integer novaAltura){
        this.alturaAt = novaAltura;
    }



    private boolean dobrar(){
        if (!dobrado){
            alturaMin=alturaAt;
            dobrado = true;
            return true;
        } else {
            System.out.println("O tripé ja esta dobrado");
            return false;
        }
    }

    private void desdobrar(){
        if (dobrado){
            alturaMax=alturaAt;
            dobrado=false;
        } else {
            System.out.println("o tripé ja esta estendido");
        }
    }

    private void guardar(){
        if (dobrar()){
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

