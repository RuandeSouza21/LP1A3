import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Pão",5.00);
        Produto p4 = new Produto("Pão",5.00);
        Produto p2 = new Produto("Refrigerante", 7.00);
        Produto p3 = new Produto("Pacote de Bala", 10.00);

        Lista l1 = new Lista();
        l1.adicionarProduto(p1);
        l1.adicionarProduto(p2);
        l1.adicionarProduto(p3);
        l1.adicionarProduto(p4);

        try {
            l1.listarProdutos();
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println();
        }

        try{
            l1.venda();
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println();
        }

        try{
            l1.venda();
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println();
        }

        try {
            l1.listarProdutos();
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println();
        }

        Lista l2 = new Lista();

        try {
            l2.listarProdutos();
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println();
        }

    }
}