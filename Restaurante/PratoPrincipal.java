import java.util.List;

public class PratoPrincipal {
    private List<String> ingredientes;
    private int tempo_preparo;
    private String categoria;

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getTempo_preparo() {
        return tempo_preparo;
    }

    public void setTempo_preparo(int tempo_preparo) {
        this.tempo_preparo = tempo_preparo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void exibir_detalhes() {
        System.out.println("Categoria: " + categoria);
        System.out.println("Tempo de preparo: " + tempo_preparo + " minuto(s)");
        for (String ingrediente : ingredientes) {
            System.out.println("Ingrediente: " + ingrediente);
        }
    }
}
