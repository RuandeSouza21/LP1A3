public abstract class Animal {
    private String nome;
    private int idade;
    private String especie;
    private boolean alimentado;

    public Animal(String nome, int idade, String especie, boolean alimentado) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.alimentado = alimentado;
    }

    public void setAlimentado(boolean alimentado) {
        this.alimentado = alimentado;
    }

    public String getNome() {
        return nome;
    }

    public void getAlimentado() {
        System.out.println(alimentado);
    }
}
