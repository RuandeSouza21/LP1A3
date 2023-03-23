public class Reptil extends Animal implements Alimentavel{
    private double temperaturaCorporal;

    public Reptil(String nome, int idade, String especie, boolean alimentado, double temperaturaCorporal) {
        super(nome, idade, especie, alimentado);
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public void emitirSom(){
        System.out.println("O réptil emitiu som");
    }

    public void alimentar(){
        setAlimentado(true);
    }
}
