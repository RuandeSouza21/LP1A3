public class Mamifero extends Animal implements Alimentavel {
    private int tempoGestacao;

    public Mamifero(String nome, int idade, String especie, boolean alimentado, int tempoGestacao){
        super(nome, idade, especie, alimentado);
        this.tempoGestacao = tempoGestacao;
    }

    public void emitirSom(){
        System.out.println("O mamifero emitiu som");
    }

    public void alimentar(){
        setAlimentado(true);
        }
}
