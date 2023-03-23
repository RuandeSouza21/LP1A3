public class Main {

    public static void main(String[] args) {
        Mamifero m1 = new Mamifero("Leon",10,"Leão",false,110);
        Mamifero m2 = new Mamifero("Nala",8,"Leão",true,110);
        Ave a1 = new Ave("Pidgey",6,"Papagaio",false,"Curvado");
        Reptil r1 = new Reptil("Lip",5,"Iguana",false, 32.6);

        Zoologico z1 = new Zoologico();
        z1.adicionarAnimal(m1);
        z1.adicionarAnimal(m2);
        z1.adicionarAnimal(a1);
        z1.adicionarAnimal(r1);

        z1.listarAnimais();
        z1.alimentarAnimais();

        m1.getAlimentado();
        r1.getAlimentado();
    }
}
