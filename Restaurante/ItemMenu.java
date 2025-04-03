public class ItemMenu {
    private String nome;
    private float preco;
    private String descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void alterar_preco(float novoPreco) {
        this.preco = novoPreco;
    }

    public void exibir_detalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Descrição: " + descricao);
    }
}
