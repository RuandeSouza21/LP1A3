import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> zoo = new ArrayList<>();

    public void adicionarAnimal(Animal animal){
        zoo.add(animal);
    }

    public void listarAnimais(){
        for(Animal cada: zoo){
            System.out.println("-"+cada.getNome());
        }
    }

    public void alimentarAnimais(){
        for(Animal cada: zoo){
            cada.setAlimentado(true);
        }
    }
}
