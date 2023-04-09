import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Departamento<T>{
    private List<Funcionario> depto = new ArrayList<Funcionario>();
    private List<Gerente> gdepto = new ArrayList<Gerente>();

    public <T extends Funcionario & Ponto> void adicionarFunc(T x){
        if(x.getClass() == Gerente.class){
            System.out.println("Um Gerente não pode ser adicioando nessa lista");
        }else {
            depto.add(x);
        }
    }

    public <T extends Funcionario & Ponto> void removerFunc(T x){
        boolean contem = depto.contains(x);
        if(contem == true){
            depto.remove(x);
            System.out.println("Funcionário removido");
        }
        else {
            System.out.println("Funcionário não está no departamento");
        }
    }

    public void adicionarGerente(Gerente y){
        gdepto.add(y);
    }

    public void removerGerente(Gerente y){
        boolean contem = gdepto.contains(y);
        if(contem == true){
            gdepto.remove(y);
            System.out.println("Gerente removido");
        }
        else {
            System.out.println("Gerente não está no departamento");
        }
    }

    public void listar(){
        for(Funcionario cada:depto){
            System.out.println("Funcionário - "+cada.getNome());
        }
        for(Gerente cada:gdepto){
            System.out.println("Gerente - "+cada.getNome());
        }
    }

    public void atrasos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o horário de entrada do departamento:");
        int z = sc.nextInt();
        for(Funcionario cada:depto){
            if(cada.getHoraEntrada() > z){
                System.out.println("Funcionário atrasado - Nome: "+cada.getNome() +" Id: "+cada.getId());
            }
        }
    }
}
