import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Funcionario {
    private String nome;
    private int id;
    private double salario;
    private int horaEntrada;
    private int horaSaida;

    public Funcionario(String nome, int id, double salario, int horaEntrada, int horaSaida) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(int horaSaida) {
        this.horaSaida = horaSaida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return id == that.id && Double.compare(that.salario, salario) == 0 && horaEntrada == that.horaEntrada && horaSaida == that.horaSaida && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, id, salario, horaEntrada, horaSaida);
    }
}
