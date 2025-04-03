import java.util.List;

public class Pedido {
    private int numero_pedido;
    private List<ItemMenu> itens;
    private String data;

    public int getNumero_pedido() {
        return numero_pedido;
    }

    public void setNumero_pedido(int numero_pedido) {
        this.numero_pedido = numero_pedido;
    }

    public List<ItemMenu> getItens() {
        return itens;
    }

    public void setItens(List<ItemMenu> itens) {
        this.itens = itens;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int calcular_total() {
        int total = 0;
        for (ItemMenu item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    public void adicionarItem(ItemMenu item) {
        this.itens.add(item);
    }
}
