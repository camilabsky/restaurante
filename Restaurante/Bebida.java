public class Bebida {
    private String tamanho;
    private boolean alcoolica;
    private String marca;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isAlcoolica() {
        return alcoolica;
    }

    public void setAlcoolica(boolean alcoolica) {
        this.alcoolica = alcoolica;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void exibir_detalhes() {
        String alcool = "";
        if (alcoolica) {
            alcool = "Sim";
        } else {
            alcool = "Não";
        }
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Alcoólica: " + alcool);
        System.out.println("Marca: " + marca);
    }
}
