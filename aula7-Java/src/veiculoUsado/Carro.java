package veiculoUsado;

public class Carro {
    private String marca, modelo, cor;
    private int anoFabricacao;
    private double km;

    public Carro(String marcaDoCarro, String modeloDoCarro, String corDoCarro,
                 int anoFabricacaoDoCarro, double kmDoCarro){
        this.marca = marcaDoCarro;
        this.modelo = modeloDoCarro;
        this.cor = corDoCarro;
        this.anoFabricacao =anoFabricacaoDoCarro;
        this.km = kmDoCarro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
}
