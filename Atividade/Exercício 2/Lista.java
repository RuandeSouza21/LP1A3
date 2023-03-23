import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
    private List<Produto> lista = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        lista.add(produto);
    }

    Scanner sc = new Scanner(System.in);

    public void listarProdutos() throws Exception {
        if (lista.isEmpty()) {
            throw new Exception("Não existem produtos na lista");
        } else {
            for (Produto cada : lista) {
                System.out.print("-" + cada.getNome());
                System.out.println("- R$" + cada.getPreco());
            }
        }
    }

    public Produto busca(String x){
        for (Produto cada : lista) {
            if (cada.getNome().equals(x)) {
                return cada;
            }
        }
        throw new RuntimeException("Produto não encontrado");
    }

    public void removerProduto(String x){
        for (Produto cada : lista) {
            if (cada.getNome().equals(x)) {
                lista.remove(cada);
                break;
            }
        }
    }

    public void venda() throws Exception{
        System.out.println("Digite o nome do produto desejado:");
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        busca(x);

        System.out.println("Digite a quantidade de dinheiro pago:");
        double v = sc.nextDouble();
        if(busca(x).getPreco() > v){
            throw new Exception("O dinheiro não é suficiente para pagar o produto");
        }
        else{
            System.out.println("Produto Vendido");
            if (v > busca(x).getPreco()){
                double t = v - busca(x).getPreco();
                System.out.println("Seu troco é de R$"+t);
            } else {
                System.out.println("Obrigado pela preferência");
            }
            removerProduto(x);
        }
    }
}