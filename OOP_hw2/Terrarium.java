package OOP_hw2;
import java.util.ArrayList;
import java.util.List;

public class Terrarium {

    private final List<Reptiles> reptiles = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("In terrarium: \n");
        for (Reptiles zoo : reptiles) {
            sb.append(zoo).append('\n');
        }
        return sb.toString();
    }

    public Terrarium addAnimal(Reptiles someAnimal) {
        reptiles.add(someAnimal);
        return this;
    }
        public List<SwimSpeed> swimmers() {
        List<SwimSpeed> swimmer = new ArrayList<>();
        for (Reptiles zoo: reptiles) {
            if (zoo instanceof SwimSpeed) {
                swimmer.add((SwimSpeed) zoo);
            }
        }
        return swimmer;
    }

        public SwimSpeed getSwimmerChampion(){
        List<SwimSpeed> swimmers = swimmers();
        SwimSpeed champ = swimmers.get(0);
        for (SwimSpeed runner: swimmers) {
            if (champ.getSwimSpeed() < runner.getSwimSpeed()) {
                champ = runner;
            }
        }
        return champ;
    }

}