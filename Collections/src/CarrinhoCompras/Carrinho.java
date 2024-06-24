package CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Item> itemList;

    public Carrinho() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }
    
    public void removeItem(String nome) {
        List<Item> removeItem = new ArrayList<>();
        if (!itemList.isEmpty()) {      
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    removeItem.add(i);

                 }
            }
        itemList.removeAll(removeItem);
        } else {
            System.out.println("A lista está vazia");
        }
    }
    
    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
          for (Item item : itemList) {
            double valorItem = item.getPreco() * item.getQuant();
            valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
          }
          return valorTotal;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItems() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        }else{
        System.out.println("A lista está vazia");
        }
    }

    @Override
  public String toString() {
    return "CarrinhoDeCompras{" +
        "itens=" + itemList +
        '}';
    }

    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho();
    

        carrinho.addItem("Lápis", 2d, 3);
        carrinho.addItem("Lápis", 2d, 3);
        carrinho.addItem("Caderno", 35d, 1);
        carrinho.addItem("Borracha", 2d, 2);
    
        carrinho.exibirItems();
        carrinho.removeItem("Lápis");
        carrinho.exibirItems();

        System.out.println("O valor total da compra é = " + carrinho.calcularValorTotal());
      }

}
