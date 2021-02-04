package CounterManager;

import Resources.Animals;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;

@ApplicationScoped
public class AnimalManager {
    int id;
    ArrayList<Animals> zoo = new ArrayList<Animals>();

    public void putAnimals(Animals animals) {
        animals.setId(zoo.size() + 1);
        zoo.add(animals);
    }

    public ArrayList<Animals> getAnimals() {
        return zoo;
    }

    public Animals getSpecificAnimals(id) {

        return(zoo.get(id));
    }

    public void euthanise(int xid) {
        zoo.remove(xid - 1);
    }
}
