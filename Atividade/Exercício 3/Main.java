import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();
        List<String> lista3 = new LinkedList<>();

        System.out.println("Adicione 2 elementos na lista 1");
        adicionarLista(lista1);
        System.out.println("Adicione 2 elementos na lista 2");
        adicionarLista(lista2);
        System.out.println("Adicione 2 elementos na lista 3");
        adicionarLista(lista3);

        //Adicione todos os elementos da lista 2 e 3 para a lista 1
        lista1.addAll(lista2);
        lista1.addAll(lista3);
        System.out.println("lista1: "+lista1);

        //Verifique se um elemento da lista 2 contém na lista 1.
        String a = lista2.get(1);
        boolean contem = lista1.contains(a);
        if(contem == true){
            System.out.println("Este elemento está na lista 1");
        } else{
            System.out.println("Este elemento não está na lista 1");
        }

        //Verifique se todos os elementos da lista 3 estão na lista 1.
        boolean contemTudo = lista1.containsAll(lista3);
        if(contemTudo == true){
            System.out.println("A lista 3 está totalmente contida na lista 1");
        } else{
            System.out.println("A lista 3 não está totalmente contida na lista 1");
        }

        //Verifique se a lista 1 é igual a lista 2.
        boolean igual = lista1.equals(lista2);
        if(igual == true){
            System.out.println("A lista 1 é igual a lista 2");
        } else{
            System.out.println("A lista 1 não é igual a lista 2");
        }

        //Mostre o elemento 2 de cada lista.
        System.out.println("2º Elemento (lista 1): " +lista1.get(1));
        System.out.println("2º Elemento (lista 2): " +lista2.get(1));
        System.out.println("2º Elemento (lista 3): " +lista3.get(1));

        //Remova um elemento da lista 3.
        lista3.remove(1);

        //Remova os elementos da lista 3 da lista 1.
        lista1.removeAll(lista3);

        //Verifique o tamanho da lista 1.
        int tam = lista1.size();
        System.out.println("Tamanho da lista 1: "+tam);

        //Limpe a lista 3.
        lista3.clear();

        //Verifique se a lista 3 está vazia.
        boolean vazia = lista3.isEmpty();
        if(vazia == true){
            System.out.println("A lista 3 está vazia");
        } else {
            System.out.println("A lista 3 não está vazia");
        }

        //Mostre cada elemento da lista 1.
        for(String str : lista1){
            System.out.println(str);
        }
    }

    public static void adicionarLista(List n) {
        Scanner sc = new Scanner(System.in);
        boolean continuelooping = true;
        boolean continuelooping2 = true;

        do {
            System.out.println("Digite o texto que deseja inserir na lista:");
            String valor = sc.nextLine();
            try {
                if(valor.matches(".*\\d.*")) {
                    throw new PersonalizadaException("Números não são permitidos");
                } else {
                    n.add(valor);
                    continuelooping = false;
                }
            } catch (PersonalizadaException e) {
                System.out.println(e.getMessage());
            }
        } while(continuelooping);

        do {
            System.out.println("Digite o segundo texto que deseja inserir na lista:");
            String valor2 = sc.nextLine();
            try {
                if(valor2.matches(".*\\d.*")) {
                    throw new PersonalizadaException("Números não são permitidos");
                } else {
                    n.add(valor2);
                    continuelooping2 = false;
                }
            } catch (PersonalizadaException e) {
                System.out.println(e.getMessage());
            }
        } while(continuelooping2);
    }

}