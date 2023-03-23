public class Ave extends Animal implements Alimentavel{
    private String tipoBico;

    public Ave(String nome, int idade, String especie, boolean alimentado, String tipoBico){
        super(nome, idade, especie, alimentado);
        this.tipoBico = tipoBico;
    }

    public void emitirSom(){
        System.out.println("A ave emitiu som");
    }

    public void alimentar(){
        setAlimentado(true);
    }
}
