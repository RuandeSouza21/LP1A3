public class Analista extends Funcionario implements Ponto{

    public Analista(String nome, int id, double salario, int horaEntrada, int horaSaida) {
        super(nome, id, salario, horaEntrada, horaSaida);
    }

    @Override
    public void baterPonto(int a, int b) {
        setHoraEntrada(a);
        setHoraSaida(b);
    }
}
