import java.text.SimpleDateFormat;

public class Programador extends Funcionario implements Ponto{

    public Programador(String nome, int id, double salario, int horaEntrada, int horaSaida) {
        super(nome, id, salario, horaEntrada, horaSaida);
    }

    @Override
    public void baterPonto(int a, int b) {
        setHoraEntrada(a);
        setHoraSaida(b);
    }
}
