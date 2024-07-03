package dio.ethan.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    //metodos
    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List <Item> itemParaRemover = new ArrayList<>();
        if(!itemList.isEmpty()) {
            for(Item i : itemList) {
                if(i.getNome().equalsIgnoreCase(nome)) {
                    itemParaRemover.add(i);
                }
            }
            itemList.removeAll(itemParaRemover);
        } else {
            System.out.println("A lista esta vazia!");
        }
    }

    public double calcularValorTotal() {
        double valortotal = 0d;
        if(!itemList.isEmpty()) {
            for(Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valortotal += valorItem;
            }
            return valortotal;
        } else {
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public void exibirItens() {
        if(!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista esta vazia!");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lapis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lapis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Cola", 2d, 2);

        carrinhoDeCompras.exibirItens();
        
        carrinhoDeCompras.removerItem("Lapis");

        carrinhoDeCompras.exibirItens();
        
        System.out.println("O valor total da compra é " + carrinhoDeCompras.calcularValorTotal());
    }
}
