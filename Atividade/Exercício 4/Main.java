public class Main {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("João", 10, 20, 8, 13);
        Gerente g2 = new Gerente("Beatriz", 11, 80, 7, 23);
        Programador p1 = new Programador("Jair", 20, 32, 10, 12);
        Analista a1 = new Analista("Zeca", 31, 50, 6, 10);

        Departamento d1 = new Departamento();
        d1.adicionarGerente(g1);
        d1.adicionarGerente(g2);
        d1.adicionarFunc(a1);
        d1.adicionarFunc(p1);
        d1.listar();
        a1.baterPonto(7,12);
        p1.baterPonto(9,15);
        d1.atrasos();
        d1.removerGerente(g1);
    }
}